package com.hnshangyu.huirongfa.util;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;

import com.hnshangyu.huirongfa.application.Application;


/**
 * Created by xiansong on 2016/6/29.
 */
public class AppUtil {

    public static String getAppVersionName(Context context) {
        String versionName = "1.0.1";
        try {
            PackageManager pm = context.getPackageManager();
            PackageInfo info = pm.getPackageInfo(Application.getContext().getPackageName(), 0);
            if (info.versionName != null && info.versionName.length() > 0) {
                versionName = info.versionName;
            }
        } catch (Exception e) {
            Log.e("VersionInfo", "Exception", e);
        }
        return versionName;
    }
}
