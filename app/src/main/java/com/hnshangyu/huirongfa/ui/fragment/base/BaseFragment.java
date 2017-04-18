package com.hnshangyu.huirongfa.ui.fragment.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.cnlive.libs.util.SharedPreferencesHelper;

import org.greenrobot.eventbus.EventBus;

import java.util.ArrayList;
import java.util.List;

import butterknife.ButterKnife;
import rx.Observable;
import rx.Subscriber;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by xiansong on 2016/5/4.
 */
public abstract class BaseFragment extends Fragment {

    protected List<Subscription> subscriptions;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        subscriptions = new ArrayList<>();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(getLayoutRes(), container, false);
        ButterKnife.bind(this, view);
        return view;
    }

    protected abstract int getLayoutRes();

    protected boolean isEventRegister() {
        return false;
    }

    @Override
    public void onResume() {
        super.onResume();
        if (isEventRegister()) EventBus.getDefault().register(this);
    }

    @Override
    public void onPause() {
        super.onPause();
        if (isEventRegister()) EventBus.getDefault().unregister(this);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        for(Subscription subscription : subscriptions){
            subscription.unsubscribe();
        }
    }

    protected <T> Subscription subscribe(Observable<T> observable, Subscriber<T> subscriber) {
        Subscription subscription = observable
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
        subscriptions.add(subscription);
        return subscription;
    }

    protected String getSharedPreferencesString(String key){
        if(getActivity()!=null){
            return SharedPreferencesHelper.getInstance(getActivity()).getValue(key);
        }else{
            return null;
        }
    }

    protected void setSharedPreferencesString(String key, String value){
        if(getActivity()!=null){
            SharedPreferencesHelper.getInstance(getActivity()).setValue(key,value);
        }
    }
}
