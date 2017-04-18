package com.hnshangyu.huirongfa.model;

/**
 * Created by luxiaoman on 2016/12/10.
 */

public class UserPersonalContent {
    private String itemLetter;
    private String itemName;
    private int itemIcon;

    public UserPersonalContent() {
    }

    public UserPersonalContent(String itemLetter, String itemName, int itemIcon) {
        this.itemLetter = itemLetter;
        this.itemName = itemName;
        this.itemIcon = itemIcon;
    }

    public String getItemLetter() {
        return itemLetter;
    }

    public void setItemLetter(String itemLetter) {
        this.itemLetter = itemLetter;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getItemIcon() {
        return itemIcon;
    }

    public void setItemIcon(int itemIcon) {
        this.itemIcon = itemIcon;
    }

    @Override
    public String toString() {
        return "UserPersonalContent{" +
                "itemLetter='" + itemLetter + '\'' +
                ", itemName='" + itemName + '\'' +
                ", itemIcon=" + itemIcon +
                '}';
    }
}
