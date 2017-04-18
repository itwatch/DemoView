package com.hnshangyu.huirongfa.model;


import com.hnshangyu.huirongfa.model.base.ErrorMessage;

import java.util.List;

/**
 * Created by jwy on 2016/12/8.
 */

public class AuditoriumContent extends ErrorMessage {

    /**
     * data : {"audList":[{"angleIcon":"","horizontalPic":"https://img.svipmovie.com/onlinecinema/movie1.jpg","movieId":"4","nextPlayTime":[{"des":"","endTime":"2016-12-23 02:30:08","playTime":"00:25","playTimeD":"2016-12-23 00:25:52","showId":"104","videoId":"4"},{"des":"","endTime":"2016-12-23 05:06:17","playTime":"03:02","playTimeD":"2016-12-23 03:02:01","showId":"109","videoId":"4"},{"des":"","endTime":"2016-12-23 07:18:32","playTime":"05:14","playTimeD":"2016-12-23 05:14:16","showId":"111","videoId":"4"},{"des":"","endTime":"2016-12-23 09:30:47","playTime":"07:26","playTimeD":"2016-12-23 07:26:31","showId":"113","videoId":"4"},{"des":"","endTime":"2016-12-23 11:35:04","playTime":"09:30","playTimeD":"2016-12-23 09:30:48","showId":"114","videoId":"4"},{"des":"","endTime":"2016-12-23 13:55:17","playTime":"11:51","playTimeD":"2016-12-23 11:51:01","showId":"117","videoId":"4"},{"des":"","endTime":"2016-12-23 16:07:32","playTime":"14:03","playTimeD":"2016-12-23 14:03:16","showId":"119","videoId":"4"},{"des":"","endTime":"2016-12-23 18:19:47","playTime":"16:15","playTimeD":"2016-12-23 16:15:31","showId":"121","videoId":"4"},{"des":"","endTime":"2016-12-23 20:40:00","playTime":"18:35","playTimeD":"2016-12-23 18:35:44","showId":"124","videoId":"4"},{"des":"","endTime":"2016-12-23 23:00:13","playTime":"20:55","playTimeD":"2016-12-23 20:55:57","showId":"127","videoId":"4"}],"nowShowId":"36","title":"漂流","todayPlayTimeList":[{"des":"","endTime":"2016-12-22 20:05:24","playTime":"18:01","playTimeD":"2016-12-22 18:01:08","showId":"36","videoId":"4"}],"verticalPic":"https://img.svipmovie.com/onlinecinema/hall1.png"}],"videoHallList":[{"auditoriumId":"1","title":"中国网+VR厅","type":"vr"},{"auditoriumId":"10","title":"格瓦拉","type":"ordinary"},{"auditoriumId":"11","title":"好莱坞厅","type":"ordinary"},{"auditoriumId":"4","title":"娱票儿厅","type":"ordinary"},{"auditoriumId":"6","title":"咪咕怀旧厅","type":"ordinary"},{"auditoriumId":"7","title":"汽车电影厅","type":"ordinary"},{"auditoriumId":"8","title":"动漫厅","type":"ordinary"},{"auditoriumId":"9","title":"情侣厅","type":"ordinary"}]}
     */

    private DataBean data;

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        private List<AudListBean> audList;
        private List<VideoHallListBean> videoHallList;

        public List<AudListBean> getAudList() {
            return audList;
        }

        public void setAudList(List<AudListBean> audList) {
            this.audList = audList;
        }

        public List<VideoHallListBean> getVideoHallList() {
            return videoHallList;
        }

        public void setVideoHallList(List<VideoHallListBean> videoHallList) {
            this.videoHallList = videoHallList;
        }

        public static class AudListBean {
            /**
             * angleIcon :
             * horizontalPic : https://img.svipmovie.com/onlinecinema/movie1.jpg
             * movieId : 4
             * nextPlayTime : [{"des":"","endTime":"2016-12-23 02:30:08","playTime":"00:25","playTimeD":"2016-12-23 00:25:52","showId":"104","videoId":"4"},{"des":"","endTime":"2016-12-23 05:06:17","playTime":"03:02","playTimeD":"2016-12-23 03:02:01","showId":"109","videoId":"4"},{"des":"","endTime":"2016-12-23 07:18:32","playTime":"05:14","playTimeD":"2016-12-23 05:14:16","showId":"111","videoId":"4"},{"des":"","endTime":"2016-12-23 09:30:47","playTime":"07:26","playTimeD":"2016-12-23 07:26:31","showId":"113","videoId":"4"},{"des":"","endTime":"2016-12-23 11:35:04","playTime":"09:30","playTimeD":"2016-12-23 09:30:48","showId":"114","videoId":"4"},{"des":"","endTime":"2016-12-23 13:55:17","playTime":"11:51","playTimeD":"2016-12-23 11:51:01","showId":"117","videoId":"4"},{"des":"","endTime":"2016-12-23 16:07:32","playTime":"14:03","playTimeD":"2016-12-23 14:03:16","showId":"119","videoId":"4"},{"des":"","endTime":"2016-12-23 18:19:47","playTime":"16:15","playTimeD":"2016-12-23 16:15:31","showId":"121","videoId":"4"},{"des":"","endTime":"2016-12-23 20:40:00","playTime":"18:35","playTimeD":"2016-12-23 18:35:44","showId":"124","videoId":"4"},{"des":"","endTime":"2016-12-23 23:00:13","playTime":"20:55","playTimeD":"2016-12-23 20:55:57","showId":"127","videoId":"4"}]
             * nowShowId : 36
             * title : 漂流
             * todayPlayTimeList : [{"des":"","endTime":"2016-12-22 20:05:24","playTime":"18:01","playTimeD":"2016-12-22 18:01:08","showId":"36","videoId":"4"}]
             * verticalPic : https://img.svipmovie.com/onlinecinema/hall1.png
             */

            private String angleIcon;
            private String horizontalPic;
            private String movieId;
            private String nowShowId;
            private String title;
            private String verticalPic;
            private List<NextPlayTimeBean> nextPlayTime;
            private List<TodayPlayTimeListBean> todayPlayTimeList;

            public String getAngleIcon() {
                return angleIcon;
            }

            public void setAngleIcon(String angleIcon) {
                this.angleIcon = angleIcon;
            }

            public String getHorizontalPic() {
                return horizontalPic;
            }

            public void setHorizontalPic(String horizontalPic) {
                this.horizontalPic = horizontalPic;
            }

            public String getMovieId() {
                return movieId;
            }

            public void setMovieId(String movieId) {
                this.movieId = movieId;
            }

            public String getNowShowId() {
                return nowShowId;
            }

            public void setNowShowId(String nowShowId) {
                this.nowShowId = nowShowId;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getVerticalPic() {
                return verticalPic;
            }

            public void setVerticalPic(String verticalPic) {
                this.verticalPic = verticalPic;
            }

            public List<NextPlayTimeBean> getNextPlayTime() {
                return nextPlayTime;
            }

            public void setNextPlayTime(List<NextPlayTimeBean> nextPlayTime) {
                this.nextPlayTime = nextPlayTime;
            }

            public List<TodayPlayTimeListBean> getTodayPlayTimeList() {
                return todayPlayTimeList;
            }

            public void setTodayPlayTimeList(List<TodayPlayTimeListBean> todayPlayTimeList) {
                this.todayPlayTimeList = todayPlayTimeList;
            }

            public static class NextPlayTimeBean {
                /**
                 * des :
                 * endTime : 2016-12-23 02:30:08
                 * playTime : 00:25
                 * playTimeD : 2016-12-23 00:25:52
                 * showId : 104
                 * videoId : 4
                 */

                private String des;
                private String endTime;
                private String playTime;
                private String playTimeD;
                private String showId;
                private String videoId;

                public String getDes() {
                    return des;
                }

                public void setDes(String des) {
                    this.des = des;
                }

                public String getEndTime() {
                    return endTime;
                }

                public void setEndTime(String endTime) {
                    this.endTime = endTime;
                }

                public String getPlayTime() {
                    return playTime;
                }

                public void setPlayTime(String playTime) {
                    this.playTime = playTime;
                }

                public String getPlayTimeD() {
                    return playTimeD;
                }

                public void setPlayTimeD(String playTimeD) {
                    this.playTimeD = playTimeD;
                }

                public String getShowId() {
                    return showId;
                }

                public void setShowId(String showId) {
                    this.showId = showId;
                }

                public String getVideoId() {
                    return videoId;
                }

                public void setVideoId(String videoId) {
                    this.videoId = videoId;
                }
            }

            public static class TodayPlayTimeListBean {
                /**
                 * des :
                 * endTime : 2016-12-22 20:05:24
                 * playTime : 18:01
                 * playTimeD : 2016-12-22 18:01:08
                 * showId : 36
                 * videoId : 4
                 */

                private String des;
                private String endTime;
                private String playTime;
                private String playTimeD;
                private String showId;
                private String videoId;

                public String getDes() {
                    return des;
                }

                public void setDes(String des) {
                    this.des = des;
                }

                public String getEndTime() {
                    return endTime;
                }

                public void setEndTime(String endTime) {
                    this.endTime = endTime;
                }

                public String getPlayTime() {
                    return playTime;
                }

                public void setPlayTime(String playTime) {
                    this.playTime = playTime;
                }

                public String getPlayTimeD() {
                    return playTimeD;
                }

                public void setPlayTimeD(String playTimeD) {
                    this.playTimeD = playTimeD;
                }

                public String getShowId() {
                    return showId;
                }

                public void setShowId(String showId) {
                    this.showId = showId;
                }

                public String getVideoId() {
                    return videoId;
                }

                public void setVideoId(String videoId) {
                    this.videoId = videoId;
                }
            }
        }

        public static class VideoHallListBean {
            /**
             * auditoriumId : 1
             * title : 中国网+VR厅
             * type : vr
             */

            private String auditoriumId;
            private String title;
            private String type;

            public String getAuditoriumId() {
                return auditoriumId;
            }

            public void setAuditoriumId(String auditoriumId) {
                this.auditoriumId = auditoriumId;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }
        }
    }
}
