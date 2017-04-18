package com.hnshangyu.huirongfa.application;


import android.content.Context;

/**
 * Created by xiansong on 2016/10/28.
 */

public class Application extends android.app.Application {

    private static Application  application ;

    @Override
    public void onCreate() {
        super.onCreate();
        application = this;



    }

    public static Context getContext(){
        return application.getApplicationContext();
    }




}
