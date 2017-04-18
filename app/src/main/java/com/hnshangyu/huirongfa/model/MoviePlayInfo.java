package com.hnshangyu.huirongfa.model;


import com.hnshangyu.huirongfa.model.base.ErrorMessage;

import java.util.List;


public class MoviePlayInfo extends ErrorMessage {
    private DataBean data;

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        private long checkOffSet;
        private String chatRoomId;
        private String roomNum;
        private String auditorium;
        private List<PlayListBean> playList;

        public long getCheckOffSet() {
            return checkOffSet;
        }

        public void setCheckOffSet(long checkOffSet) {
            this.checkOffSet = checkOffSet;
        }

        public String getChatRoomId() {
            return chatRoomId;
        }

        public void setChatRoomId(String chatRoomId) {
            this.chatRoomId = chatRoomId;
        }

        public String getRoomNum() {
            return roomNum;
        }

        public void setRoomNum(String roomNum) {
            this.roomNum = roomNum;
        }

        public String getAuditorium() {
            return auditorium == null ? "" : auditorium;
        }

        public void setAuditorium(String auditorium) {
            this.auditorium = auditorium;
        }

        public List<PlayListBean> getPlayList() {
            return playList;
        }

        public void setPlayList(List<PlayListBean> playList) {
            this.playList = playList;
        }

        public static class PlayListBean {
            private String playUrl;
            private String movieTitle;
            private String movieId;
            private String type;
            private String showId;
            private long offSet;

            public String getPlayUrl() {
                return playUrl;
            }

            public void setPlayUrl(String playUrl) {
                this.playUrl = playUrl;
            }

            public String getMovieTitle() {
                return movieTitle;
            }

            public void setMovieTitle(String movieTitle) {
                this.movieTitle = movieTitle;
            }

            public String getMovieId() {
                return movieId;
            }

            public void setMovieId(String movieId) {
                this.movieId = movieId;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public long getOffSet() {
                return offSet;
            }

            public void setOffSet(long offSet) {
                this.offSet = offSet;
            }

            public String getShowId() {
                return showId;
            }

            public void setShowId(String showId) {
                this.showId = showId;
            }

            @Override
            public String toString() {
                return "PlayListBean{" +
                        "playUrl='" + playUrl + '\'' +
                        ", movieTitle='" + movieTitle + '\'' +
                        ", movieId='" + movieId + '\'' +
                        ", type='" + type + '\'' +
                        ", showId='" + showId + '\'' +
                        ", offSet=" + offSet +
                        '}';
            }
        }

        @Override
        public String toString() {
            return "DataBean{" +
                    "checkOffSet=" + checkOffSet +
                    ", chatRoomId='" + chatRoomId + '\'' +
                    ", roomNum='" + roomNum + '\'' +
                    ", playList=" + playList +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "MoviePlayInfo{" +
                "data=" + data +
                '}';
    }
}
