package com.hnshangyu.huirongfa.ui.fragment.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;


import com.hnshangyu.huirongfa.model.base.ErrorMessage;
import com.hnshangyu.huirongfa.util.NetworkUtil;

import rx.Observable;
import rx.Subscriber;
import rx.Subscription;

/**
 * Created by xiansong on 2016/5/5.
 */
public abstract class BaseLoadFragment<T extends ErrorMessage> extends BaseFragment {

    private static final String TAG = "LoadFragment";

    protected T mPageData;
    protected Subscription subscription;

    protected class LoadSubscriber extends Subscriber<T> {
        @Override
        public void onCompleted() {
            if (mPageData != null && "0".equals(mPageData.getErrorCode())) {
                onInitLoadData(mPageData);
            } else {
                BaseLoadFragment.this.onError(mPageData, null);
            }
        }

        @Override
        public void onError(Throwable e) {
            BaseLoadFragment.this.onError(null, e);
        }

        @Override
        public void onNext(T channelTabList) {
            mPageData = channelTabList;
        }
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        if (mPageData != null) {
            onInitLoadData(mPageData);
        } else {
            loaddata();
        }
    }

    protected void loaddata() {
        if (subscription != null) subscription.unsubscribe();
        subscription = subscribe(onLoadPageData(), new LoadSubscriber());
    }

    protected abstract Observable<T> onLoadPageData();

    protected abstract void onInitLoadData(T data);

    protected abstract void onErrorMessage(String msg);

    protected abstract void onErrorNoConnectInternet();

    protected void onError(T data, Throwable e) {
        if (e != null) {
            Log.e(TAG, "Error : ", e);
        }
        if (!NetworkUtil.isConnectInternet()) {
            onErrorNoConnectInternet();
        } else {
            String msg = null;
            if (data != null && !TextUtils.isEmpty(data.getErrorMessage())) {
                msg = data.getErrorMessage();
            }
            onErrorMessage(msg);
        }
    }

}
