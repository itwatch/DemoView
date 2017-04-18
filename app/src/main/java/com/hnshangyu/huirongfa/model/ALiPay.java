package com.hnshangyu.huirongfa.model;


import com.hnshangyu.huirongfa.model.base.ErrorMessage;

/**
 * Created by wyq on 2017/1/3.
 */

public class ALiPay extends ErrorMessage {

    private DataBean data;

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        private String notify_url;
        private String alipay_app;
        private String order_id;

        public String getNotify_url() {
            return notify_url;
        }

        public void setNotify_url(String notify_url) {
            this.notify_url = notify_url;
        }

        public String getAlipay_app() {
            return alipay_app;
        }

        public void setAlipay_app(String alipay_app) {
            this.alipay_app = alipay_app;
        }

        public String getOrder_id() {
            return order_id;
        }

        public void setOrder_id(String order_id) {
            this.order_id = order_id;
        }
    }
}
