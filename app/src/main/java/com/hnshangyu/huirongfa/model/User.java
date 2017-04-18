package com.hnshangyu.huirongfa.model;


import com.hnshangyu.huirongfa.model.base.ErrorMessage;

import java.io.Serializable;

public class User extends ErrorMessage implements Serializable {

    /**
     * uid : 201601211717200000000000002308
     * uname : abc123
     * nickname :
     * gender : 0
     * mobile :
     * avatar :
     * point : 0
     */

    private String pwd;

    private String uid;
    private String uname;
    private String nickname;
    private String gender;
    private String mobile;
    private String avatar;
    private String point;
    private String address;
    private String backgroundPrice;

    private String qq;
    private String wechat;
    private String microblog;

    private String birthday;
    private String signature;
    private String constellation;
    private String type;

    private String lasttime;
    private String vip;
    /*vip描述，1-5 分别对应注册，一个月，六个月，十二个月，超级会员*/
    private String vipDescribe;
    /*VIP等级0-2 对应注册，普通，和超级会员*/
    private String vipLevel;
    /*VIP过期时间*/
    private String superVip;

    //获取主播序号 非主播为0，主播为7位数序号
    private String master;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    /*用户token*/
    private String token;

    public String getVipDescribe() {
        return vipDescribe;
    }

    public void setVipDescribe(String vipDescribe) {
        this.vipDescribe = vipDescribe;
    }

    public String getVipLevel() {
        return vipLevel;
    }

    public void setVipLevel(String vipLevel) {
        this.vipLevel = vipLevel;
    }


    @Override
    public String toString() {
        return "User{" +
                "pwd='" + pwd + '\'' +
                ", uid='" + uid + '\'' +
                ", uname='" + uname + '\'' +
                ", nickname='" + nickname + '\'' +
                ", gender='" + gender + '\'' +
                ", mobile='" + mobile + '\'' +
                ", avatar='" + avatar + '\'' +
                ", point='" + point + '\'' +
                ", address='" + address + '\'' +
                ", backgroundPrice='" + backgroundPrice + '\'' +
                ", qq='" + qq + '\'' +
                ", wechat='" + wechat + '\'' +
                ", microblog='" + microblog + '\'' +
                ", birthday='" + birthday + '\'' +
                ", signature='" + signature + '\'' +
                ", constellation='" + constellation + '\'' +
                ", type='" + type + '\'' +
                ", lasttime='" + lasttime + '\'' +
                ", vip='" + vip + '\'' +
                ", vipDescribe='" + vipDescribe + '\'' +
                ", vipLevel='" + vipLevel + '\'' +
                ", superVip='" + superVip + '\'' +
                ", master='" + master + '\'' +
                ", token='" + token + '\'' +
                '}';
    }

    public String getSuperVip() {
        return superVip;
    }

    public void setSuperVip(String superVip) {
        this.superVip = superVip;
    }


    public String getLasttime() {
        return lasttime;
    }

    public void setLasttime(String lasttime) {
        this.lasttime = lasttime;
    }

    public String getVip() {
        return vip;
    }

    public void setVip(String vip) {
        this.vip = vip;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public String getConstellation() {
        return constellation;
    }

    public void setConstellation(String constellation) {
        this.constellation = constellation;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getWechat() {
        return wechat;
    }

    public void setWechat(String wechat) {
        this.wechat = wechat;
    }

    public String getMicroblog() {
        return microblog;
    }

    public void setMicroblog(String microblog) {
        this.microblog = microblog;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public void setPoint(String point) {
        this.point = point;
    }


    public String getBackgroundPrice() {
        return backgroundPrice;
    }

    public void setBackgroundPrice(String backgroundPrice) {
        this.backgroundPrice = backgroundPrice;
    }

    public String getUid() {
        return uid;
    }

    public String getUname() {
        return uname;
    }

    public String getNickname() {
        return nickname;
    }

    public String getGender() {
        return gender;
    }

    public String getMobile() {
        return mobile;
    }

    public String getAvatar() {
        return avatar;
    }

    public String getPoint() {
        return point;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public String getMaster() {
        return master;
    }

    public void setMaster(String master) {
        this.master = master;
    }
}
