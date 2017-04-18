package com.hnshangyu.huirongfa.auth;

import android.content.Context;
import android.content.SharedPreferences;

import com.hnshangyu.huirongfa.model.User;


public class UserService {
   private final String KEY_DEFAULT_ACCOUNT = "defaultAccount";
    private final String KEY_USER_DATA_USER_ID = "Uid";
    private final String KEY_USER_DATA_ACCOUNT_NAME = "uname";
    private final String KEY_USER_DATA_NICKNAME = "NickName";
    private final String KEY_USER_DATA_AVATAR = "FaceUrl";
    private final String KEY_USER_DATA_GENDER = "gender";
    private final String KEY_USER_DATA_MOBILE = "Mobile";
    private final String KEY_USER_DATA_LOCATION = "location";
    private final String KEY_USER_DATA_BACK = "back";
    private final String KEY_USER_DATA_QQ = "qq";
    private final String KEY_USER_DATA_WECHAT = "wechat";
    private final String KEY_USER_DATA_MICROBLOG = "microblog";
    private final String KEY_USER_DATA_SIGNATURE = "signature";
    private final String KEY_USER_DATA_TYPE = "type";
    private final String KEY_USER_TOKEN = "token";
    private final String KEY_USER_MASTER = "master";
    private final String share_name = "loginUser";//sharedPreference的名字
    private Context mContext;
    private SharedPreferences sharedPreferences;

    public static UserService mInstance;

    private UserService(Context context) {
        this.mContext = context;
        if (sharedPreferences==null){
            sharedPreferences=context.getSharedPreferences(share_name,Context.MODE_PRIVATE);
        }
    }

    public static synchronized UserService getInstance(Context context) {
        if (mInstance == null)
            mInstance = new UserService(context.getApplicationContext());
        return mInstance;
    }

    public void autoLogin(boolean autoLogin){//  设置 是否自动登录
        SharedPreferences.Editor editor=sharedPreferences.edit();
        editor.putBoolean(KEY_DEFAULT_ACCOUNT,autoLogin);
        editor.commit();
    }

    public boolean isAutoLogin(){//用户状态  是否登录
        boolean b=sharedPreferences.getBoolean(KEY_DEFAULT_ACCOUNT, false);
        return b;
    }

    public void updateNick(String nick){   //修改昵称
        SharedPreferences.Editor editor=sharedPreferences.edit();
        editor.putString(KEY_USER_DATA_NICKNAME, nick);
        editor.commit();
    }
    public void updateAvatar(String avatar){  //修改头像
        SharedPreferences.Editor editor=sharedPreferences.edit();
        editor.putString(KEY_USER_DATA_AVATAR,avatar );
        editor.commit();
    }
    public void updateBack(String back){   //修改签名
        SharedPreferences.Editor editor=sharedPreferences.edit();
        editor.putString(KEY_USER_DATA_SIGNATURE,back );
        editor.commit();
    }
    public void updateMobile(String newMoble){  //修改手机号
        SharedPreferences.Editor editor=sharedPreferences.edit();
        editor.putString(KEY_USER_DATA_MOBILE, newMoble);
        editor.commit();
    }

    public void setUserInfo(User user, String pwd){//更新 保存用户信息
        SharedPreferences.Editor editor=sharedPreferences.edit();
        if (user!=null){
            editor.putBoolean(KEY_DEFAULT_ACCOUNT, true);
            editor.putString(KEY_USER_DATA_USER_ID, user.getUid());
            editor.putString(KEY_USER_DATA_ACCOUNT_NAME, user.getUname());
            editor.putString(KEY_USER_DATA_NICKNAME, user.getNickname());
            editor.putString(KEY_USER_DATA_AVATAR, user.getAvatar());
            editor.putString(KEY_USER_DATA_GENDER, user.getGender());
            editor.putString(KEY_USER_DATA_MOBILE, user.getMobile());
            editor.putString(KEY_USER_DATA_LOCATION, user.getAddress());
            editor.putString(KEY_USER_DATA_BACK, user.getBackgroundPrice());
            editor.putString(KEY_USER_DATA_QQ, user.getQq());
            editor.putString(KEY_USER_DATA_WECHAT, user.getWechat());
            editor.putString(KEY_USER_DATA_MICROBLOG,user.getMicroblog());
            editor.putString(KEY_USER_DATA_SIGNATURE,user.getSignature());
            editor.putString(KEY_USER_DATA_TYPE,user.getType());
            editor.putString(KEY_USER_TOKEN, user.getToken());
            editor.putString(KEY_USER_MASTER,user.getMaster());
        }
        editor.commit();
    }

    public User getUserInfo(){//获取用户信息
        User user = new User();
        user.setUid(sharedPreferences.getString(KEY_USER_DATA_USER_ID, ""));
        user.setUname(sharedPreferences.getString(KEY_USER_DATA_ACCOUNT_NAME, ""));
        user.setNickname(sharedPreferences.getString(KEY_USER_DATA_NICKNAME, ""));
        user.setAvatar(sharedPreferences.getString(KEY_USER_DATA_AVATAR, ""));
        user.setGender(sharedPreferences.getString(KEY_USER_DATA_GENDER, ""));
        user.setMobile(sharedPreferences.getString(KEY_USER_DATA_MOBILE, ""));
        user.setAddress(sharedPreferences.getString(KEY_USER_DATA_LOCATION, ""));
        user.setBackgroundPrice(sharedPreferences.getString(KEY_USER_DATA_BACK, ""));
        user.setQq(sharedPreferences.getString(KEY_USER_DATA_QQ, ""));
        user.setWechat(sharedPreferences.getString(KEY_USER_DATA_WECHAT, ""));
        user.setMicroblog(sharedPreferences.getString(KEY_USER_DATA_MICROBLOG, ""));
        user.setSignature(sharedPreferences.getString(KEY_USER_DATA_SIGNATURE, ""));
        user.setType(sharedPreferences.getString(KEY_USER_DATA_TYPE, ""));
        user.setToken(sharedPreferences.getString(KEY_USER_TOKEN,""));
        user.setMaster(sharedPreferences.getString(KEY_USER_MASTER,""));
        return user;
    }

    public void clearUser(User user){
        SharedPreferences.Editor editor=sharedPreferences.edit();
        if (user != null){
            editor.clear();
            editor.commit();
        }
    }
}
