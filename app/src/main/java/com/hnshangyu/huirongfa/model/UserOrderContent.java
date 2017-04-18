package com.hnshangyu.huirongfa.model;


import com.hnshangyu.huirongfa.model.base.ErrorMessage;

import java.util.List;

/**
 * Created by luxiaoman on 2016/12/14 0014.
 */

public class UserOrderContent extends ErrorMessage {

    private DataBean data;

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * auditorium : 中国网+VR厅
         * showId :
         * auditoriumId :
         * roomNum :
         * orderId : 123
         * price : 25.00
         * playTime : 2016-12-22 18:30:00
         * pic : https://img.svipmovie.com/onlinecinema/hall1.png
         * title : 全职猎人
         * seats : 3-5
         */

        private List<OrderListBean> orderList;

        public List<OrderListBean> getOrderList() {
            return orderList;
        }

        public void setOrderList(List<OrderListBean> orderList) {
            this.orderList = orderList;
        }

        public static class OrderListBean {
            private String auditorium;
            private String showId;
            private String auditoriumId;
            private String roomNum;
            private String orderId;
            private String price;
            private String playTime;
            private String pic;
            private String title;
            private String seats;

            public String getAuditorium() {
                return auditorium;
            }

            public void setAuditorium(String auditorium) {
                this.auditorium = auditorium;
            }

            public String getShowId() {
                return showId;
            }

            public void setShowId(String showId) {
                this.showId = showId;
            }

            public String getAuditoriumId() {
                return auditoriumId;
            }

            public void setAuditoriumId(String auditoriumId) {
                this.auditoriumId = auditoriumId;
            }

            public String getRoomNum() {
                return roomNum;
            }

            public void setRoomNum(String roomNum) {
                this.roomNum = roomNum;
            }

            public String getOrderId() {
                return orderId;
            }

            public void setOrderId(String orderId) {
                this.orderId = orderId;
            }

            public String getPrice() {
                return price;
            }

            public void setPrice(String price) {
                this.price = price;
            }

            public String getPlayTime() {
                return playTime;
            }

            public void setPlayTime(String playTime) {
                this.playTime = playTime;
            }

            public String getPic() {
                return pic;
            }

            public void setPic(String pic) {
                this.pic = pic;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getSeats() {
                return seats;
            }

            public void setSeats(String seats) {
                this.seats = seats;
            }
        }
    }
}
