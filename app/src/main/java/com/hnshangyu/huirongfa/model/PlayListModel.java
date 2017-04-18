package com.hnshangyu.huirongfa.model;


import com.hnshangyu.huirongfa.model.base.ErrorMessage;

import java.util.List;

/**
 * Created by Lynn on 12/22/2016.
 */

public class PlayListModel extends ErrorMessage {
    private DataBean data;

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public class DataBean {
        private List<PlayList> playlist;

        public List<PlayList> getPlaylist() {
            return playlist;
        }

        public void setPlaylist(List<PlayList> playlist) {
            this.playlist = playlist;
        }

        public class PlayList {
            private String staus;
            private String playTime;
            private String title;
            private String showId;
            private String pic;

            public String getStaus() {
                return staus;
            }

            public void setStaus(String staus) {
                this.staus = staus;
            }

            public String getPlayTime() {
                return playTime;
            }

            public void setPlayTime(String playTime) {
                this.playTime = playTime;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getShowId() {
                return showId;
            }

            public void setShowId(String showId) {
                this.showId = showId;
            }

            public String getPic() {
                return pic;
            }

            public void setPic(String pic) {
                this.pic = pic;
            }

            @Override
            public String toString() {
                return "PlayList{" +
                        "staus='" + staus + '\'' +
                        ", playTime='" + playTime + '\'' +
                        ", title='" + title + '\'' +
                        ", showId='" + showId + '\'' +
                        ", pic='" + pic + '\'' +
                        '}';
            }
        }

        @Override
        public String toString() {
            return "DataBean{" +
                    "playlist=" + playlist +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "PlayListModel{" +
                ", data=" + data +
                '}';
    }
}
