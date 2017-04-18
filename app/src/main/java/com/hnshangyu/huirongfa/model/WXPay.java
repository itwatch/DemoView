package com.hnshangyu.huirongfa.model;

import com.google.gson.annotations.SerializedName;
import com.hnshangyu.huirongfa.model.base.ErrorMessage;

/**
 * Created by wyq on 2017/1/3.
 */

public class WXPay extends ErrorMessage {

    private DataBean data;

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * timestamp : 1483425227
         * sign : 6B5BFA73049468024D915C32AA7C7DF7
         * partnerid : 1427687702
         * noncestr : 16a944d0d2734d6798713f911c006c6e
         * prepayid : wx20170103143347b07759d7400137936588
         * package : Sign=WXPay
         * appid : wx510e06bebcb8b690
         */

        private WxAppBean wx_app;
        private String order_id;

        public WxAppBean getWx_app() {
            return wx_app;
        }

        public void setWx_app(WxAppBean wx_app) {
            this.wx_app = wx_app;
        }


        public String getOrder_id() {
            return order_id;
        }

        public void setOrder_id(String order_id) {
            this.order_id = order_id;
        }

        public static class WxAppBean {
            private String timestamp;
            private String sign;
            private String partnerid;
            private String noncestr;
            private String prepayid;
            @SerializedName("package")
            private String packageX;
            private String appid;

            public String getTimestamp() {
                return timestamp;
            }

            public void setTimestamp(String timestamp) {
                this.timestamp = timestamp;
            }

            public String getSign() {
                return sign;
            }

            public void setSign(String sign) {
                this.sign = sign;
            }

            public String getPartnerid() {
                return partnerid;
            }

            public void setPartnerid(String partnerid) {
                this.partnerid = partnerid;
            }

            public String getNoncestr() {
                return noncestr;
            }

            public void setNoncestr(String noncestr) {
                this.noncestr = noncestr;
            }

            public String getPrepayid() {
                return prepayid;
            }

            public void setPrepayid(String prepayid) {
                this.prepayid = prepayid;
            }

            public String getPackageX() {
                return packageX;
            }

            public void setPackageX(String packageX) {
                this.packageX = packageX;
            }

            public String getAppid() {
                return appid;
            }

            public void setAppid(String appid) {
                this.appid = appid;
            }
        }
    }
}
