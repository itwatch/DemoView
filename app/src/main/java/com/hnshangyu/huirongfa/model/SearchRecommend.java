package com.hnshangyu.huirongfa.model;


import com.hnshangyu.huirongfa.model.base.ErrorMessage;

import java.util.List;

/**
 * Created by wyq on 2016/12/8.
 */

public class SearchRecommend extends ErrorMessage {


    /**
     * hotMovieName : 金刚侠
     * recomList : [{"loadType":"live","angleIcon":"https://img.svipmovie.com/image/2016/11/18/1479437451118072978.png","loadUrl":"http://cmcc.ips.cnlive.com/content/movie?contentId=612552469&productid=2028593910&ratelevel=2","movieId":"1","pic":"https://img.svipmovie.com/onlinecinema/hall1.png","title":"全职猎人"},{"loadType":"live","angleIcon":"https://img.svipmovie.com/image/2016/11/18/1479437451118072978.png","loadUrl":"http://cmcc.ips.cnlive.com/content/movie?contentId=603383211&productid=2028593910&ratelevel=2","movieId":"10","pic":"https://img.svipmovie.com/onlinecinema/hall2.jpg","title":"金刚侠"},{"loadType":"","angleIcon":"","loadUrl":"http://cmcc.ips.cnlive.com/content/movie?contentId=613876960&productid=2028593910&ratelevel=2","movieId":"4","pic":"https://img.svipmovie.com/onlinecinema/movie1.jpg","title":"漂流"},{"loadType":"live","angleIcon":"https://img.svipmovie.com/image/2016/11/18/1479437451118072978.png","loadUrl":"http://cmcc.ips.cnlive.com/content/movie?contentId=612552469&productid=2028593910&ratelevel=2","movieId":"1","pic":"https://img.svipmovie.com/onlinecinema/hall1.png","title":"赏金猎人"}]
     * searchResultList : []
     */

    private DataBean data;
    /**
     * data : {"hotMovieName":"金刚侠","recomList":[{"loadType":"live","angleIcon":"https://img.svipmovie.com/image/2016/11/18/1479437451118072978.png","loadUrl":"http://cmcc.ips.cnlive.com/content/movie?contentId=612552469&productid=2028593910&ratelevel=2","movieId":"1","pic":"https://img.svipmovie.com/onlinecinema/hall1.png","title":"全职猎人"},{"loadType":"live","angleIcon":"https://img.svipmovie.com/image/2016/11/18/1479437451118072978.png","loadUrl":"http://cmcc.ips.cnlive.com/content/movie?contentId=603383211&productid=2028593910&ratelevel=2","movieId":"10","pic":"https://img.svipmovie.com/onlinecinema/hall2.jpg","title":"金刚侠"},{"loadType":"","angleIcon":"","loadUrl":"http://cmcc.ips.cnlive.com/content/movie?contentId=613876960&productid=2028593910&ratelevel=2","movieId":"4","pic":"https://img.svipmovie.com/onlinecinema/movie1.jpg","title":"漂流"},{"loadType":"live","angleIcon":"https://img.svipmovie.com/image/2016/11/18/1479437451118072978.png","loadUrl":"http://cmcc.ips.cnlive.com/content/movie?contentId=612552469&productid=2028593910&ratelevel=2","movieId":"1","pic":"https://img.svipmovie.com/onlinecinema/hall1.png","title":"赏金猎人"}],"searchResultList":[]}
     * errorMessage : 成功
     * errorCode : 0
     */

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        private String hotMovieName;
        /**
         * loadType : live
         * angleIcon : https://img.svipmovie.com/image/2016/11/18/1479437451118072978.png
         * loadUrl : http://cmcc.ips.cnlive.com/content/movie?contentId=612552469&productid=2028593910&ratelevel=2
         * movieId : 1
         * pic : https://img.svipmovie.com/onlinecinema/hall1.png
         * title : 全职猎人
         */

        private List<RecomListBean> recomList;
        private List<?> searchResultList;

        public String getHotMovieName() {
            return hotMovieName;
        }

        public void setHotMovieName(String hotMovieName) {
            this.hotMovieName = hotMovieName;
        }

        public List<RecomListBean> getRecomList() {
            return recomList;
        }

        public void setRecomList(List<RecomListBean> recomList) {
            this.recomList = recomList;
        }

        public List<?> getSearchResultList() {
            return searchResultList;
        }

        public void setSearchResultList(List<?> searchResultList) {
            this.searchResultList = searchResultList;
        }

        public static class RecomListBean {
            private String loadType;
            private String angleIcon;
            private String loadUrl;
            private String movieId;
            private String pic;
            private String title;

            public String getLoadType() {
                return loadType;
            }

            public void setLoadType(String loadType) {
                this.loadType = loadType;
            }

            public String getAngleIcon() {
                return angleIcon;
            }

            public void setAngleIcon(String angleIcon) {
                this.angleIcon = angleIcon;
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

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }
        }
    }
}
