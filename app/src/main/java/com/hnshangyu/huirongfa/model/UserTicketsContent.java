package com.hnshangyu.huirongfa.model;


import com.hnshangyu.huirongfa.model.base.ErrorMessage;

import java.util.List;

/**
 * Created by luxiaoman on 2016/12/29.
 */

public class UserTicketsContent extends ErrorMessage {

    private DataBean data;

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        private String downloadUrl;
        private List<TickListBean> tickList;

        public String getDownloadUrl() {
            return downloadUrl;
        }

        public void setDownloadUrl(String downloadUrl) {
            this.downloadUrl = downloadUrl;
        }

        public List<TickListBean> getTickList() {
            return tickList;
        }

        public void setTickList(List<TickListBean> tickList) {
            this.tickList = tickList;
        }

        public static class TickListBean {
            private String auditorium;
            private String showId;
            private String auditoriumId;
            private String roomNum;
            private String orderId;
            private String price;
            private String ticketNum;
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

            public String getTicketNum() {
                return ticketNum;
            }

            public void setTicketNum(String ticketNum) {
                this.ticketNum = ticketNum;
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
