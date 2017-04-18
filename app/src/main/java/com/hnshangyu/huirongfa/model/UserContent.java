package com.hnshangyu.huirongfa.model;

/**
 * Created by luxiaoman on 2016/12/5 0004.
 */

public class UserContent {
    public static final int HEADER = 0;
    public static final int ITEM = 1;

    private String itemLetter;
    private int itemType;
    private String itemName;
    private int itemIcon;
    private boolean showRedPoint = false;

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

    public int getItemType() {
        return itemType;
    }

    public void setItemType(int itemType) {
        this.itemType = itemType;
    }

    public boolean isShowRedPoint() {
        return showRedPoint;
    }

    public void setShowRedPoint(boolean showRedPoint) {
        this.showRedPoint = showRedPoint;
    }

    public UserContent(String itemLetter, int itemType, String itemName, int itemIcon, boolean showRedPoint) {
        this.itemLetter = itemLetter;
        this.itemType = itemType;
        this.itemName = itemName;
        this.itemIcon = itemIcon;
        this.showRedPoint = showRedPoint;
    }
}
