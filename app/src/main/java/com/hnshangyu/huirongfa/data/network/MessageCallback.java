package com.hnshangyu.huirongfa.data.network;

import android.util.Log;

import com.cnlive.libs.user.IUserService;
import com.cnlive.libs.user.model.ErrorMessage;
import com.cnlive.libs.util.Config;
import com.cnlive.libs.util.NetUtil;
import com.cnlive.libs.util.data.network.Callback;
import com.cnlive.libs.util.data.network.DataGenericsCallback;
import com.cnlive.libs.util.data.okhttp3.Call;

import static com.cnlive.libs.user.IUserService.ERROR_NETWORK;
import static com.cnlive.libs.user.IUserService.ERROR_OTHER;
import static com.cnlive.libs.user.IUserService.ERROR_SERVER;

/**
 * Created by Administrator on 2016/12/30.
 */

public abstract class MessageCallback<T extends ErrorMessage> extends DataGenericsCallback<T> {
    private static final String TAG = "UserSDK";

    protected Object[] other;

    protected MessageCallback(Callback callback) {
        super(callback);
    }

    protected MessageCallback(Callback callback, Object... other) {
        super(callback);
        this.other = other;
    }

    private int getErrorCoder(T em) {
        try {
            return Integer.parseInt(em.getErrorCode());
        } catch (Exception e) {
            return ERROR_SERVER;
        }
    }

    @Override
    public void onError(Call call, Exception e) {
        if (callback != null)
            if (!NetUtil.isConnectInternet(Config.getContext()))
                callback.onState(ERROR_NETWORK, IUserService.message_error_network,null);
            else
                callback.onState(ERROR_OTHER, IUserService.message_error_other,null);

        if (e != null) Log.e(TAG, "", e);
    }

    @Override
    public void onResponse(T response, Exception e) {
        int code = getErrorCoder(response);
        if (code == 0) onSucess(response);
        if (callback != null)
            callback.onState(code, code == ERROR_SERVER ? IUserService.message_error_server : response.getErrorMessage(),response);
    }

    public abstract void onSucess(T response);
}
