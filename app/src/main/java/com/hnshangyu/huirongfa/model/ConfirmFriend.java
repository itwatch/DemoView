package com.hnshangyu.huirongfa.model;

/**
 * @author
 * @time 2017/1/3  12:36
 * @desc ${TODD}
 */
public class ConfirmFriend {

    @Override
    public String toString() {
        return "ConfirmFriend{" +
                "data=" + data +
                ", errorMessage='" + errorMessage + '\'' +
                ", errorCode='" + errorCode + '\'' +
                '}';
    }

    /**
     * data : {"isFriend":0}
     * errorMessage : 成功
     * errorCode : 0
     */

    private DataBean data;
    private String errorMessage;
    private String errorCode;

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public static class DataBean {
        @Override
        public String toString() {
            return "DataBean{" +
                    "isFriend=" + isFriend +
                    '}';
        }

        /**
         * isFriend : 0
         */

        private int isFriend;

        public int getIsFriend() {
            return isFriend;
        }

        public void setIsFriend(int isFriend) {
            this.isFriend = isFriend;
        }
    }
}
