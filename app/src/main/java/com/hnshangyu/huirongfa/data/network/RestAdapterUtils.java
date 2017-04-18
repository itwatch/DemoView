package com.hnshangyu.huirongfa.data.network;

import android.content.Context;


import com.hnshangyu.huirongfa.BuildConfig;

import java.util.concurrent.TimeUnit;

import okhttp3.Cache;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import okhttp3.logging.HttpLoggingInterceptor.Level;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;


public class RestAdapterUtils {
//    private static final String BASE_URL = "https://perapi.svipmovie.com";
    private static final String BASE_URL = "http://api.svipmovie.com";
    private static final String BASE_URL_TEST = "http://120.92.4.46:8080";
    private static final String BASE_URL_PAY = "https://api.cnlive.com";
    public static final String NOTIFY_URL = "https://perapi.svipmovie.com/from/cinemaTicketApi/thirdPay.do";


    private static HttpLoggingInterceptor httpLoggingInterceptor;

    static {
        httpLoggingInterceptor = new HttpLoggingInterceptor();
        httpLoggingInterceptor.setLevel(BuildConfig.DEBUG ? Level.BODY : Level.NONE);
    }

    private static <T> T getRestAPI(Context context, String endpoint, Class<T> service) {
        return getRestAPI(context, false, 0, 0, endpoint, service);
    }

    private static <T> T getRestAPI(Context context, boolean hasCache, int readTimeout, int connectTimeout, String endpoint, Class<T> service) {
        OkHttpClient.Builder okHttpClientBuilder = new OkHttpClient().newBuilder();

        okHttpClientBuilder.addInterceptor(httpLoggingInterceptor);

        if (connectTimeout > 0) {
            okHttpClientBuilder.connectTimeout(connectTimeout, TimeUnit.SECONDS);
        }
        if (readTimeout > 0) {
            okHttpClientBuilder.readTimeout(readTimeout, TimeUnit.SECONDS);
        }
        if (hasCache) {
            okHttpClientBuilder.cache(new Cache(context.getCacheDir(), 10 * 1024 * 1024));
            okHttpClientBuilder.addNetworkInterceptor(new ClientInterceptor(context));
        }

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(endpoint)
                .client(okHttpClientBuilder.build())
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();

        return retrofit.create(service);
    }

    public static ApiService getAPI(Context context) {
        return RestAdapterUtils.getRestAPI(context, BASE_URL, ApiService.class);
    }

    public static ApiService getTestAPI(Context context) {
        return RestAdapterUtils.getRestAPI(context, BASE_URL_TEST, ApiService.class);
    }

    public static ApiService getPayAPI(Context context) {
        return RestAdapterUtils.getRestAPI(context, BASE_URL_PAY, ApiService.class);
    }
}
