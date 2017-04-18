package com.hnshangyu.huirongfa.model;

/**
 * @author
 * @time 2016/12/21  15:11
 * @desc ${TODD}
 */
public class TicketSeatOrderConfirm {


    @Override
    public String toString() {
        return "TicketSeatOrderConfirm{" +
                "data=" + data +
                ", errorCode='" + errorCode + '\'' +
                ", errorMessage='" + errorMessage + '\'' +
                '}';
    }

    private DataBean2 data;
    private String errorCode;
    private String errorMessage;

    public DataBean2 getData() {
        return data;
    }

    public void setData(DataBean2 data) {
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

    public static class DataBean2 {


        private String price;
        private String actualPrice;
        private  String unit;
        private  String id;

        @Override
        public String toString() {
            return "DataBean2{" +
                    "price='" + price + '\'' +
                    ", actualPrice='" + actualPrice + '\'' +
                    ", unit='" + unit + '\'' +
                    ", id='" + id + '\'' +
                    '}';
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getActualPrice() {
            return actualPrice;
        }

        public void setActualPrice(String actualPrice) {
            this.actualPrice = actualPrice;
        }

        public String getUnit() {
            return unit;
        }

        public void setUnit(String unit) {
            this.unit = unit;
        }

        public String getPrice() {
            return price;
        }

        public void setPrice(String price) {
            this.price = price;
        }
    }

}
