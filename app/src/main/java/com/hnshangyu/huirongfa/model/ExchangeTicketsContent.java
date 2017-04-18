package com.hnshangyu.huirongfa.model;



import com.hnshangyu.huirongfa.model.base.ErrorMessage;

import java.util.List;

/**
 * Created by luxiaoman on 2016/12/29.
 */

public class ExchangeTicketsContent extends ErrorMessage {


    /**
     * price : 52.00
     * ticketNum : WtSlDPIU
     * movieHallName : 娱票儿厅
     * startTime : 2016-12-29 16:27:53
     * time : 2016-12-29 16:40:54.0
     * moviePic : https://yweb0.cnliveimg.com/img/CMCC_MOVIE/615878289_699022_HSJ1080V.jpg
     * movieName : 飞行者
     * realSeatNumber : 2-8
     * ticketId : 4028c781593f243c01593f34d990000e
     */

    private List<DataBean> data;

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        private String price;
        private String ticketNum;
        private String movieHallName;
        private String startTime;
        private String time;
        private String moviePic;
        private String movieName;
        private String realSeatNumber;
        private String ticketId;

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

        public String getMovieHallName() {
            return movieHallName;
        }

        public void setMovieHallName(String movieHallName) {
            this.movieHallName = movieHallName;
        }

        public String getStartTime() {
            return startTime;
        }

        public void setStartTime(String startTime) {
            this.startTime = startTime;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public String getMoviePic() {
            return moviePic;
        }

        public void setMoviePic(String moviePic) {
            this.moviePic = moviePic;
        }

        public String getMovieName() {
            return movieName;
        }

        public void setMovieName(String movieName) {
            this.movieName = movieName;
        }

        public String getRealSeatNumber() {
            return realSeatNumber;
        }

        public void setRealSeatNumber(String realSeatNumber) {
            this.realSeatNumber = realSeatNumber;
        }

        public String getTicketId() {
            return ticketId;
        }

        public void setTicketId(String ticketId) {
            this.ticketId = ticketId;
        }
    }
}
