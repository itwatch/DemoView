package com.hnshangyu.huirongfa.model;

/**
 * Created by Lynn on 12/22/2016.
 */

public class MessageModel {

    private String content;
    private String name;
    private String img;

    public MessageModel(String content, String name, String img) {
        this.content = content;
        this.name = name;
        this.img = img;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }


}
