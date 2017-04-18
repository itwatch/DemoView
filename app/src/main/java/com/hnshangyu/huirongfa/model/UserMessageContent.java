package com.hnshangyu.huirongfa.model;


import com.hnshangyu.huirongfa.model.base.ErrorMessage;

import java.util.List;

/**
 * Created by Administrator on 2016/12/14.
 */

public class UserMessageContent extends ErrorMessage {

    private DataBean data;

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * userPic : https://phonemovie.ks3-cn-beijing.ksyun.com/%2Fupload/memberPic/2016/11/30/1480508549681035675.jpg
         * nickName : duan
         * messageId : 8a8ab2df594920c901594942aa880001
         * message : 你好,我们可以成为朋友吗？
         * type : 1
         * userId : https://phonemovie.ks3-cn-beijing.ksyun.com/%2Fupload/memberPic/2016/11/30/1480508549681035675.jpg
         */

        private List<MessageListBean> messageList;

        public List<MessageListBean> getMessageList() {
            return messageList;
        }

        public void setMessageList(List<MessageListBean> messageList) {
            this.messageList = messageList;
        }

        public static class MessageListBean {
            private String userPic;
            private String nickName;
            private String messageId;
            private String message;
            private String type;
            private String userId;

            private boolean checked;

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

            public String getMessageId() {
                return messageId;
            }

            public void setMessageId(String messageId) {
                this.messageId = messageId;
            }

            public String getMessage() {
                return message;
            }

            public void setMessage(String message) {
                this.message = message;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
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
