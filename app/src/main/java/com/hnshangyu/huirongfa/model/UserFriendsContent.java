package com.hnshangyu.huirongfa.model;


import com.hnshangyu.huirongfa.model.base.ErrorMessage;

import java.util.List;

/**
 * Created by luxiaoman on 2016/12/14.
 */

public class UserFriendsContent extends ErrorMessage {

    private DataBean data;

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * creatTime :
         * level : 2
         * userPic : https://phonemovie.ks3-cn-beijing.ksyun.com/%2Fupload/memberPic/2016/11/30/1480508549681035675.jpg
         * nickName : su
         * userId : 2
         */

        private List<MyFriendListBean> myFriendList;

        public List<MyFriendListBean> getMyFriendList() {
            return myFriendList;
        }

        public void setMyFriendList(List<MyFriendListBean> myFriendList) {
            this.myFriendList = myFriendList;
        }

        public static class MyFriendListBean {
            private String creatTime;
            private String level;
            private String userPic;
            private String nickName;
            private String userId;

            private boolean checked;

            public String getCreatTime() {
                return creatTime;
            }

            public void setCreatTime(String creatTime) {
                this.creatTime = creatTime;
            }

            public String getLevel() {
                return level;
            }

            public void setLevel(String level) {
                this.level = level;
            }

            public String getUserPic() {
                return userPic;
            }

            public void setUserPic(String userPic) {
                this.userPic = userPic;
            }

            public String getNickName() {
                return nickName;
            }

            public void setNickName(String nickName) {
                this.nickName = nickName;
            }

            public String getUserId() {
                return userId;
            }

            public void setUserId(String userId) {
                this.userId = userId;
            }

            public boolean isChecked() {
                return checked;
            }

            public void setChecked(boolean checked) {
                this.checked = checked;
            }
        }
    }
}
