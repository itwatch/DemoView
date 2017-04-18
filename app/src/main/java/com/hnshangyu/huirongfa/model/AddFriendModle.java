package com.hnshangyu.huirongfa.model;

import java.util.List;

/**
 * @author lishuai
 * @time 2016/12/28  19:11
 * @desc ${TODD}
 */
public class AddFriendModle {

    /**
     * data : {"roomNum":"1","seatList":[{"columns":[{"number":"1","staus":"4","userId":"","userName":"","userPic":""},{"number":"2","staus":"4","userId":"","userName":"","userPic":""},{"number":"3","staus":"0","userId":"","userName":"","userPic":""},{"number":"4","staus":"1","userId":"4","userName":"memeda","userPic":"https://phonemovie.ks3-cn-beijing.ksyun.com/%2Fupload/memberPic/2016/11/30/1480508549681035675.jpg"},{"number":"5","staus":"0","userId":"","userName":"","userPic":""},{"number":"6","staus":"0","userId":"","userName":"","userPic":""},{"number":"7","staus":"0","userId":"","userName":"","userPic":""},{"number":"8","staus":"0","userId":"","userName":"","userPic":""},{"number":"9","staus":"0","userId":"","userName":"","userPic":""},{"number":"10","staus":"0","userId":"","userName":"","userPic":""},{"number":"11","staus":"0","userId":"","userName":"","userPic":""},{"number":"12","staus":"0","userId":"","userName":"","userPic":""},{"number":"13","staus":"4","userId":"","userName":"","userPic":""},{"number":"14","staus":"4","userId":"","userName":"","userPic":""}],"rowId":1},{"columns":[{"number":"1","staus":"4","userId":"","userName":"","userPic":""},{"number":"2","staus":"0","userId":"","userName":"","userPic":""},{"number":"3","staus":"1","userId":"3","userName":"xia","userPic":"https://phonemovie.ks3-cn-beijing.ksyun.com/%2Fupload/memberPic/2016/11/30/1480508549681035675.jpg"},{"number":"4","staus":"0","userId":"","userName":"","userPic":""},{"number":"5","staus":"0","userId":"","userName":"","userPic":""},{"number":"6","staus":"1","userId":"1","userName":"Äã²Â","userPic":"https://phonemovie.ks3-cn-beijing.ksyun.com/%2Fupload/memberPic/2016/11/30/1480508549681035675.jpg"},{"number":"7","staus":"0","userId":"","userName":"","userPic":""},{"number":"8","staus":"0","userId":"","userName":"","userPic":""},{"number":"9","staus":"0","userId":"","userName":"","userPic":""},{"number":"10","staus":"0","userId":"","userName":"","userPic":""},{"number":"11","staus":"0","userId":"","userName":"","userPic":""},{"number":"12","staus":"0","userId":"","userName":"","userPic":""},{"number":"13","staus":"0","userId":"","userName":"","userPic":""},{"number":"14","staus":"4","userId":"","userName":"","userPic":""}],"rowId":2},{"columns":[{"number":"1","staus":"0","userId":"","userName":"","userPic":""},{"number":"2","staus":"0","userId":"","userName":"","userPic":""},{"number":"3","staus":"0","userId":"","userName":"","userPic":""},{"number":"4","staus":"0","userId":"","userName":"","userPic":""},{"number":"5","staus":"0","userId":"","userName":"","userPic":""},{"number":"6","staus":"0","userId":"","userName":"","userPic":""},{"number":"7","staus":"0","userId":"","userName":"","userPic":""},{"number":"8","staus":"0","userId":"","userName":"","userPic":""},{"number":"9","staus":"0","userId":"","userName":"","userPic":""},{"number":"10","staus":"0","userId":"","userName":"","userPic":""},{"number":"11","staus":"0","userId":"","userName":"","userPic":""},{"number":"12","staus":"0","userId":"","userName":"","userPic":""},{"number":"13","staus":"0","userId":"","userName":"","userPic":""},{"number":"14","staus":"0","userId":"","userName":"","userPic":""}],"rowId":3},{"columns":[{"number":"1","staus":"0","userId":"","userName":"","userPic":""},{"number":"2","staus":"0","userId":"","userName":"","userPic":""},{"number":"3","staus":"0","userId":"","userName":"","userPic":""},{"number":"4","staus":"0","userId":"","userName":"","userPic":""},{"number":"5","staus":"0","userId":"","userName":"","userPic":""},{"number":"6","staus":"0","userId":"","userName":"","userPic":""},{"number":"7","staus":"0","userId":"","userName":"","userPic":""},{"number":"8","staus":"0","userId":"","userName":"","userPic":""},{"number":"9","staus":"0","userId":"","userName":"","userPic":""},{"number":"10","staus":"0","userId":"","userName":"","userPic":""},{"number":"11","staus":"0","userId":"","userName":"","userPic":""},{"number":"12","staus":"0","userId":"","userName":"","userPic":""},{"number":"13","staus":"0","userId":"","userName":"","userPic":""},{"number":"14","staus":"0","userId":"","userName":"","userPic":""}],"rowId":4}]}
     * errorCode : 0
     * errorMessage : ³É¹¦
     */

    private DataBean data;
    private String errorCode;
    private String errorMessage;

    @Override
    public String toString() {
        return "AddFriendModle{" +
                "data=" + data +
                ", errorCode='" + errorCode + '\'' +
                ", errorMessage='" + errorMessage + '\'' +
                '}';
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public static class DataBean {
        /**
         * roomNum : 1
         * seatList : [{"columns":[{"number":"1","staus":"4","userId":"","userName":"","userPic":""},{"number":"2","staus":"4","userId":"","userName":"","userPic":""},{"number":"3","staus":"0","userId":"","userName":"","userPic":""},{"number":"4","staus":"1","userId":"4","userName":"memeda","userPic":"https://phonemovie.ks3-cn-beijing.ksyun.com/%2Fupload/memberPic/2016/11/30/1480508549681035675.jpg"},{"number":"5","staus":"0","userId":"","userName":"","userPic":""},{"number":"6","staus":"0","userId":"","userName":"","userPic":""},{"number":"7","staus":"0","userId":"","userName":"","userPic":""},{"number":"8","staus":"0","userId":"","userName":"","userPic":""},{"number":"9","staus":"0","userId":"","userName":"","userPic":""},{"number":"10","staus":"0","userId":"","userName":"","userPic":""},{"number":"11","staus":"0","userId":"","userName":"","userPic":""},{"number":"12","staus":"0","userId":"","userName":"","userPic":""},{"number":"13","staus":"4","userId":"","userName":"","userPic":""},{"number":"14","staus":"4","userId":"","userName":"","userPic":""}],"rowId":1},{"columns":[{"number":"1","staus":"4","userId":"","userName":"","userPic":""},{"number":"2","staus":"0","userId":"","userName":"","userPic":""},{"number":"3","staus":"1","userId":"3","userName":"xia","userPic":"https://phonemovie.ks3-cn-beijing.ksyun.com/%2Fupload/memberPic/2016/11/30/1480508549681035675.jpg"},{"number":"4","staus":"0","userId":"","userName":"","userPic":""},{"number":"5","staus":"0","userId":"","userName":"","userPic":""},{"number":"6","staus":"1","userId":"1","userName":"Äã²Â","userPic":"https://phonemovie.ks3-cn-beijing.ksyun.com/%2Fupload/memberPic/2016/11/30/1480508549681035675.jpg"},{"number":"7","staus":"0","userId":"","userName":"","userPic":""},{"number":"8","staus":"0","userId":"","userName":"","userPic":""},{"number":"9","staus":"0","userId":"","userName":"","userPic":""},{"number":"10","staus":"0","userId":"","userName":"","userPic":""},{"number":"11","staus":"0","userId":"","userName":"","userPic":""},{"number":"12","staus":"0","userId":"","userName":"","userPic":""},{"number":"13","staus":"0","userId":"","userName":"","userPic":""},{"number":"14","staus":"4","userId":"","userName":"","userPic":""}],"rowId":2},{"columns":[{"number":"1","staus":"0","userId":"","userName":"","userPic":""},{"number":"2","staus":"0","userId":"","userName":"","userPic":""},{"number":"3","staus":"0","userId":"","userName":"","userPic":""},{"number":"4","staus":"0","userId":"","userName":"","userPic":""},{"number":"5","staus":"0","userId":"","userName":"","userPic":""},{"number":"6","staus":"0","userId":"","userName":"","userPic":""},{"number":"7","staus":"0","userId":"","userName":"","userPic":""},{"number":"8","staus":"0","userId":"","userName":"","userPic":""},{"number":"9","staus":"0","userId":"","userName":"","userPic":""},{"number":"10","staus":"0","userId":"","userName":"","userPic":""},{"number":"11","staus":"0","userId":"","userName":"","userPic":""},{"number":"12","staus":"0","userId":"","userName":"","userPic":""},{"number":"13","staus":"0","userId":"","userName":"","userPic":""},{"number":"14","staus":"0","userId":"","userName":"","userPic":""}],"rowId":3},{"columns":[{"number":"1","staus":"0","userId":"","userName":"","userPic":""},{"number":"2","staus":"0","userId":"","userName":"","userPic":""},{"number":"3","staus":"0","userId":"","userName":"","userPic":""},{"number":"4","staus":"0","userId":"","userName":"","userPic":""},{"number":"5","staus":"0","userId":"","userName":"","userPic":""},{"number":"6","staus":"0","userId":"","userName":"","userPic":""},{"number":"7","staus":"0","userId":"","userName":"","userPic":""},{"number":"8","staus":"0","userId":"","userName":"","userPic":""},{"number":"9","staus":"0","userId":"","userName":"","userPic":""},{"number":"10","staus":"0","userId":"","userName":"","userPic":""},{"number":"11","staus":"0","userId":"","userName":"","userPic":""},{"number":"12","staus":"0","userId":"","userName":"","userPic":""},{"number":"13","staus":"0","userId":"","userName":"","userPic":""},{"number":"14","staus":"0","userId":"","userName":"","userPic":""}],"rowId":4}]
         */

        private String roomNum;
        private List<SeatListBean> seatList;

        public String getRoomNum() {
            return roomNum;
        }

        public void setRoomNum(String roomNum) {
            this.roomNum = roomNum;
        }

        @Override
        public String toString() {
            return "DataBean{" +
                    "roomNum='" + roomNum + '\'' +
                    ", seatList=" + seatList +
                    '}';
        }

        public List<SeatListBean> getSeatList() {
            return seatList;
        }

        public void setSeatList(List<SeatListBean> seatList) {
            this.seatList = seatList;
        }

        public static class SeatListBean {
            @Override
            public String toString() {
                return "SeatListBean{" +
                        "rowId=" + rowId +
                        ", columns=" + columns +
                        '}';
            }

            /**
             * columns : [{"number":"1","staus":"4","userId":"","userName":"","userPic":""},{"number":"2","staus":"4","userId":"","userName":"","userPic":""},{"number":"3","staus":"0","userId":"","userName":"","userPic":""},{"number":"4","staus":"1","userId":"4","userName":"memeda","userPic":"https://phonemovie.ks3-cn-beijing.ksyun.com/%2Fupload/memberPic/2016/11/30/1480508549681035675.jpg"},{"number":"5","staus":"0","userId":"","userName":"","userPic":""},{"number":"6","staus":"0","userId":"","userName":"","userPic":""},{"number":"7","staus":"0","userId":"","userName":"","userPic":""},{"number":"8","staus":"0","userId":"","userName":"","userPic":""},{"number":"9","staus":"0","userId":"","userName":"","userPic":""},{"number":"10","staus":"0","userId":"","userName":"","userPic":""},{"number":"11","staus":"0","userId":"","userName":"","userPic":""},{"number":"12","staus":"0","userId":"","userName":"","userPic":""},{"number":"13","staus":"4","userId":"","userName":"","userPic":""},{"number":"14","staus":"4","userId":"","userName":"","userPic":""}]
             * rowId : 1
             */

            private int rowId;
            private List<ColumnsBean> columns;

            public int getRowId() {
                return rowId;
            }

            public void setRowId(int rowId) {
                this.rowId = rowId;
            }

            public List<ColumnsBean> getColumns() {
                return columns;
            }

            public void setColumns(List<ColumnsBean> columns) {
                this.columns = columns;
            }

            public static class ColumnsBean {
                @Override
                public String toString() {
                    return "ColumnsBean{" +
                            "number='" + number + '\'' +
                            ", staus='" + staus + '\'' +
                            ", userId='" + userId + '\'' +
                            ", userName='" + userName + '\'' +
                            ", userPic='" + userPic + '\'' +
                            '}';
                }

                /**
                 * number : 1
                 * staus : 4
                 * userId :
                 * userName :
                 * userPic :
                 */

                private String number;
                private String staus;
                private String userId;
                private String userName;
                private String userPic;

                public String getNumber() {
                    return number;
                }

                public void setNumber(String number) {
                    this.number = number;
                }

                public String getStaus() {
                    return staus;
                }

                public void setStaus(String staus) {
                    this.staus = staus;
                }

                public String getUserId() {
                    return userId;
                }

                public void setUserId(String userId) {
                    this.userId = userId;
                }

                public String getUserName() {
                    return userName;
                }

                public void setUserName(String userName) {
                    this.userName = userName;
                }

                public String getUserPic() {
                    return userPic;
                }

                public void setUserPic(String userPic) {
                    this.userPic = userPic;
                }
            }
        }
    }
}
