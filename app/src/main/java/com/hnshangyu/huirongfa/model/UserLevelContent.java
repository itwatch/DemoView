package com.hnshangyu.huirongfa.model;

import com.cnlive.libs.video.model.ErrorMessage;

/**
 * Created by luxiaoman on 2017/1/3.
 */

public class UserLevelContent extends ErrorMessage {

    /**
     * ticketNumber : 0
     * userLevel : 0
     * lvMsg : 再购买44张票即可升级为一星会员
     */

    private DataBean data;

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        private String ticketNumber;
        private String userLevel;
        private String lvMsg;

        public String getTicketNumber() {
            return ticketNumber;
        }

        public void setTicketNumber(String ticketNumber) {
            this.ticketNumber = ticketNumber;
        }

        public String getUserLevel() {
            return userLevel;
        }

        public void setUserLevel(String userLevel) {
            this.userLevel = userLevel;
        }

        public String getLvMsg() {
            return lvMsg;
        }

        public void setLvMsg(String lvMsg) {
            this.lvMsg = lvMsg;
        }
    }
}
