package com.hnshangyu.huirongfa.model;


import com.hnshangyu.huirongfa.model.base.ErrorMessage;

/**
 * Created by luxiaoman on 2016/1/3.
 */

public class UserAgreeFriendsContent extends ErrorMessage {

    /**
     * data :
     */

    private String data;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "UserDeleteFriendsContent{" +
                "data='" + data + '\'' +
                '}';
    }
}
