package com.hnshangyu.huirongfa.application;
import com.cnlive.libs.util.UUIDUtils;
import com.hnshangyu.huirongfa.util.AppUtil;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by xiansong on 2016/10/28.
 */

public class Config {

    public static Map<String, String> BASE_URL_SUFFIX;

    public static final String CNLIVE_SDK_APPID = "82_iunnscwp07";
    public static final String CNLIVE_SDK_APPKEY = "13c6f0ad6f459cd479834b0b39cff99c6cf20c970815bb";

    public static final String PLAT = "a";
    public static final String SPID = "82_iunnscwp07";
    public static final String APPID = "spzg";
    public static final String VERSION = AppUtil.getAppVersionName(Application.getContext());
    public static final String UUID = UUIDUtils.getUUID(Application.getContext());

    static {
        BASE_URL_SUFFIX = new HashMap<>();
        BASE_URL_SUFFIX.put("plat", PLAT);
        BASE_URL_SUFFIX.put("version", VERSION);
        BASE_URL_SUFFIX.put("appid", APPID);
        BASE_URL_SUFFIX.put("spid", SPID);
          BASE_URL_SUFFIX.put("uuid", UUID);
    }

    public static final String BASE_CMS_URL_NEW = "http://intertv.cnlive.com/api";
public static  final String MY_BASE_CMS_URL_NEW="http://intertv.cnlive.com/api/";

}
