package com.hnshangyu.huirongfa.util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

import com.hnshangyu.huirongfa.R;
import com.hnshangyu.huirongfa.application.Application;



public class NetworkUtil {

    private static ConnectivityManager connectManager;

    private static void initConnectivityManager() {
        if (connectManager == null) connectManager = (ConnectivityManager)
                Application.getContext().getSystemService(Context.CONNECTIVITY_SERVICE);
    }

    /**
     * 检测网络是否连接
     */
    public static boolean isNetworkConnected() {
        initConnectivityManager();

        if (connectManager != null) {
            NetworkInfo activeNetwork = connectManager.getActiveNetworkInfo();
            return activeNetwork != null && activeNetwork.isConnectedOrConnecting();
        }
        return false;
    }

    /**
     * 检测网络是否可用
     */
    public static boolean isConnectInternet() {
        initConnectivityManager();

        if (connectManager != null) {
            NetworkInfo networkinfo = connectManager.getActiveNetworkInfo();
            return networkinfo != null && networkinfo.isAvailable();
        }
        return false;
    }

    /**
     * 检测Wifi是否可用
     */
    public static boolean isConnectWifi() {
        initConnectivityManager();

        if (connectManager != null) {
            NetworkInfo info = connectManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI);
            return info != null && !info.isConnectedOrConnecting();
        }
        return false;
    }

    /**
     * 检测网络并提示
     */
    public static boolean checkIntent() {
        if (isConnectInternet()) {
            if (!isConnectWifi()) ToastUtil.showMessage(R.string.no_wifi);
            return true;
        }
        ToastUtil.showMessage(R.string.no_internet);
        return false;
    }
}