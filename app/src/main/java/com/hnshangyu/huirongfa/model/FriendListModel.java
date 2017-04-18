package com.hnshangyu.huirongfa.model;


import com.hnshangyu.huirongfa.model.base.ErrorMessage;

import java.util.List;

/**
 * Created by Lynn on 12/22/2016.
 */

public class FriendListModel extends ErrorMessage {
    private DataBean data;


    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public class DataBean {
        private List<FriendList> myFriendList;

        public List<FriendList> getMyFriendList() {
            return myFriendList;
        }

        public void setMyFriendList(List<FriendList> myFriendList) {
            this.myFriendList = myFriendList;
        }

        public class FriendList {
            private String userId;
            private String nickName;
            private String userPic;
            private String level;

            public String getUserId() {
                return userId;
            }

            public void setUserId(String userId) {
                this.userId = userId;
            }

            public String getNickName() {
                return nickName;
            }

            public void setNickName(String nickName) {
                this.nickName = nickName;
            }

            public String getUserPic() {
                return userPic;
            }

            public void setUserPic(String userPic) {
                this.userPic = userPic;
            }

            public String getLevel() {
                return level;
            }

            public void setLevel(String level) {
                this.level = level;
            }

            @Override
            public String toString() {
                return "FriendList{" +
                        "userId='" + userId + '\'' +
                        ", nickName='" + nickName + '\'' +
                        ", userPic='" + userPic + '\'' +
                        ", level='" + level + '\'' +
                        '}';
            }
        }

        @Override
        public String toString() {
            return "DataBean{" +
                    "myFriendList=" + myFriendList +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "FriendListModel{" +
                ", data=" + data +
                '}';
    }
}
