package com.hnshangyu.huirongfa.model;

import java.util.List;

/**
 * @author
 * @time 2016/12/13  10:14
 * @desc ${TODD}
 */
public class TicketSelectionModel {
    @Override
    public String toString() {
        return "TicketSelectionModel{" +
                "data=" + data +
                ", errorMessage='" + errorMessage + '\'' +
                ", errorCode='" + errorCode + '\'' +
                '}';
    }

    /**
     * data : {"roomNum":"1","palyTime":"00:25","seatList":[{"columns":[{"number":1,"staus":"4"},{"number":2,"staus":"4"},{"number":3,"staus":"0"},{"number":4,"staus":"0"},{"number":5,"staus":"0"},{"number":6,"staus":"0"},{"number":7,"staus":"0"},{"number":8,"staus":"0"},{"number":9,"staus":"0"},{"number":10,"staus":"0"},{"number":11,"staus":"0"},{"number":12,"staus":"0"},{"number":13,"staus":"4"},{"number":14,"staus":"4"}],"rowId":1},{"columns":[{"number":1,"staus":"4"},{"number":2,"staus":"0"},{"number":3,"staus":"0"},{"number":4,"staus":"0"},{"number":5,"staus":"0"},{"number":6,"staus":"0"},{"number":7,"staus":"0"},{"number":8,"staus":"0"},{"number":9,"staus":"0"},{"number":10,"staus":"0"},{"number":11,"staus":"0"},{"number":12,"staus":"0"},{"number":13,"staus":"0"},{"number":14,"staus":"4"}],"rowId":2},{"columns":[{"number":1,"staus":"0"},{"number":2,"staus":"0"},{"number":3,"staus":"0"},{"number":4,"staus":"0"},{"number":5,"staus":"0"},{"number":6,"staus":"0"},{"number":7,"staus":"0"},{"number":8,"staus":"0"},{"number":9,"staus":"0"},{"number":10,"staus":"0"},{"number":11,"staus":"0"},{"number":12,"staus":"0"},{"number":13,"staus":"0"},{"number":14,"staus":"0"}],"rowId":3},{"columns":[{"number":1,"staus":"0"},{"number":2,"staus":"0"},{"number":3,"staus":"0"},{"number":4,"staus":"0"},{"number":5,"staus":"0"},{"number":6,"staus":"0"},{"number":7,"staus":"0"},{"number":8,"staus":"0"},{"number":9,"staus":"0"},{"number":10,"staus":"0"},{"number":11,"staus":"0"},{"number":12,"staus":"0"},{"number":13,"staus":"0"},{"number":14,"staus":"0"}],"rowId":4}],"pic":"https://img.svipmovie.com/onlinecinema/hall1.png"}
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
                    "roomNum='" + roomNum + '\'' +
                    ", palyTime='" + palyTime + '\'' +
                    ", pic='" + pic + '\'' +
                    ", seatList=" + seatList +
                    '}';
        }

        /**
         * roomNum : 1
         * palyTime : 00:25
         * seatList : [{"columns":[{"number":1,"staus":"4"},{"number":2,"staus":"4"},{"number":3,"staus":"0"},{"number":4,"staus":"0"},{"number":5,"staus":"0"},{"number":6,"staus":"0"},{"number":7,"staus":"0"},{"number":8,"staus":"0"},{"number":9,"staus":"0"},{"number":10,"staus":"0"},{"number":11,"staus":"0"},{"number":12,"staus":"0"},{"number":13,"staus":"4"},{"number":14,"staus":"4"}],"rowId":1},{"columns":[{"number":1,"staus":"4"},{"number":2,"staus":"0"},{"number":3,"staus":"0"},{"number":4,"staus":"0"},{"number":5,"staus":"0"},{"number":6,"staus":"0"},{"number":7,"staus":"0"},{"number":8,"staus":"0"},{"number":9,"staus":"0"},{"number":10,"staus":"0"},{"number":11,"staus":"0"},{"number":12,"staus":"0"},{"number":13,"staus":"0"},{"number":14,"staus":"4"}],"rowId":2},{"columns":[{"number":1,"staus":"0"},{"number":2,"staus":"0"},{"number":3,"staus":"0"},{"number":4,"staus":"0"},{"number":5,"staus":"0"},{"number":6,"staus":"0"},{"number":7,"staus":"0"},{"number":8,"staus":"0"},{"number":9,"staus":"0"},{"number":10,"staus":"0"},{"number":11,"staus":"0"},{"number":12,"staus":"0"},{"number":13,"staus":"0"},{"number":14,"staus":"0"}],"rowId":3},{"columns":[{"number":1,"staus":"0"},{"number":2,"staus":"0"},{"number":3,"staus":"0"},{"number":4,"staus":"0"},{"number":5,"staus":"0"},{"number":6,"staus":"0"},{"number":7,"staus":"0"},{"number":8,"staus":"0"},{"number":9,"staus":"0"},{"number":10,"staus":"0"},{"number":11,"staus":"0"},{"number":12,"staus":"0"},{"number":13,"staus":"0"},{"number":14,"staus":"0"}],"rowId":4}]
         * pic : https://img.svipmovie.com/onlinecinema/hall1.png
         */

        private String roomNum;
        private String palyTime;
        private String pic;
        private List<SeatListBean> seatList;

        public String getRoomNum() {
            return roomNum;
        }

        public void setRoomNum(String roomNum) {
            this.roomNum = roomNum;
        }

        public String getPalyTime() {
            return palyTime;
        }

        public void setPalyTime(String palyTime) {
            this.palyTime = palyTime;
        }

        public String getPic() {
            return pic;
        }

        public void setPic(String pic) {
            this.pic = pic;
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
             * columns : [{"number":1,"staus":"4"},{"number":2,"staus":"4"},{"number":3,"staus":"0"},{"number":4,"staus":"0"},{"number":5,"staus":"0"},{"number":6,"staus":"0"},{"number":7,"staus":"0"},{"number":8,"staus":"0"},{"number":9,"staus":"0"},{"number":10,"staus":"0"},{"number":11,"staus":"0"},{"number":12,"staus":"0"},{"number":13,"staus":"4"},{"number":14,"staus":"4"}]
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
                            "number=" + number +
                            ", staus='" + staus + '\'' +
                            '}';
                }

                /**
                 * number : 1
                 * staus : 4
                 */

                private int number;
                private String staus;

                public int getNumber() {
                    return number;
                }

                public void setNumber(int number) {
                    this.number = number;
                }

                public String getStaus() {
                    return staus;
                }

                public void setStaus(String staus) {
                    this.staus = staus;
                }
            }
        }
    }
}
