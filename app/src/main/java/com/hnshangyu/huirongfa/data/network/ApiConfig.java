package com.hnshangyu.huirongfa.data.network;

import android.content.Context;


import com.hnshangyu.huirongfa.auth.UserService;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by xiansong on 2016/12/22.
 */

public class ApiConfig {

    private static final Map<String, String> map = new HashMap<>();

    public static Map<String, String> getSuffix(Context context) {
        map.put("userId", UserService.getInstance(context).getUserInfo().getUid());
        map.put("deviceType", "Android");
        return map;
    }

    private static final Map<String, String> mapF = new HashMap<>();

    public static Map<String, String> getSuffixS(Context context) {
        mapF.put("userId", UserService.getInstance(context).getUserInfo().getUid());
        mapF.put("deviceType", "Android");
        mapF.put("token", UserService.getInstance(context).getUserInfo().getToken());
        return mapF;
    }

    //旧手机号验证接口
    public static String OLD_MOBILE_VERTIFY = "https://api.cnlive.com/open/api2/user/checkVerifyCode";

}
