package com.hnshangyu.huirongfa.model;


import com.hnshangyu.huirongfa.model.base.ErrorMessage;

import java.util.List;

/**
 * Created by wyq on 2016/12/8.
 */

public class SearchResult extends ErrorMessage {


    /**
     * data : {"hotMovieName":"","recomList":[],"searchResultList":[{"angleIcon":"https://img.svipmovie.com/image/2016/11/18/1479437451118072978.png","auditorium":"情侣厅","auditoriumId":"9","loadType":"html","loadUrl":"http://cmcc.ips.cnlive.com/content/movie?contentId=603383211&productid=2028593910&ratelevel=2","movieId":"10","pic":"https://img.svipmovie.com/onlinecinema/movie2.jpg","playTime":"2016-12-26 23:16","title":"金刚侠"}]}
     * errorCode : 0
     * errorMessage : 成功
     */

    private DataBean data;

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * hotMovieName :
         * recomList : []
         * searchResultList : [{"angleIcon":"https://img.svipmovie.com/image/2016/11/18/1479437451118072978.png","auditorium":"情侣厅","auditoriumId":"9","loadType":"html","loadUrl":"http://cmcc.ips.cnlive.com/content/movie?contentId=603383211&productid=2028593910&ratelevel=2","movieId":"10","pic":"https://img.svipmovie.com/onlinecinema/movie2.jpg","playTime":"2016-12-26 23:16","title":"金刚侠"}]
         */

        private String hotMovieName;
        private List<?> recomList;
        private List<SearchResultListBean> searchResultList;

        public String getHotMovieName() {
            return hotMovieName;
        }

        public void setHotMovieName(String hotMovieName) {
            this.hotMovieName = hotMovieName;
        }

        public List<?> getRecomList() {
            return recomList;
        }

        public void setRecomList(List<?> recomList) {
            this.recomList = recomList;
        }

        public List<SearchResultListBean> getSearchResultList() {
            return searchResultList;
        }

        public void setSearchResultList(List<SearchResultListBean> searchResultList) {
            this.searchResultList = searchResultList;
        }

        public static class SearchResultListBean {
            /**
             * angleIcon : https://img.svipmovie.com/image/2016/11/18/1479437451118072978.png
             * auditorium : 情侣厅
             * auditoriumId : 9
             * loadType : html
             * loadUrl : http://cmcc.ips.cnlive.com/content/movie?contentId=603383211&productid=2028593910&ratelevel=2
             * movieId : 10
             * pic : https://img.svipmovie.com/onlinecinema/movie2.jpg
             * playTime : 2016-12-26 23:16
             * title : 金刚侠
             */

            private String angleIcon;
            private String auditorium;
            private String auditoriumId;
            private String loadType;
            private String loadUrl;
            private String movieId;
            private String pic;
            private String playTime;
            private String title;

            public String getAngleIcon() {
                return angleIcon;
            }

            public void setAngleIcon(String angleIcon) {
                this.angleIcon = angleIcon;
            }

            public String getAuditorium() {
                return auditorium;
            }

            public void setAuditorium(String auditorium) {
                this.auditorium = auditorium;
            }

            public String getAuditoriumId() {
                return auditoriumId;
            }

            public void setAuditoriumId(String auditoriumId) {
                this.auditoriumId = auditoriumId;
            }

            public String getLoadType() {
                return loadType;
            }

            public void setLoadType(String loadType) {
                this.loadType = loadType;
            }

            public String getLoadUrl() {
                return loadUrl;
            }

            public void setLoadUrl(String loadUrl) {
                this.loadUrl = loadUrl;
            }

            public String getMovieId() {
                return movieId;
            }

            public void setMovieId(String movieId) {
                this.movieId = movieId;
            }

            public String getPic() {
                return pic;
            }

            public void setPic(String pic) {
                this.pic = pic;
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
        }
    }
}
