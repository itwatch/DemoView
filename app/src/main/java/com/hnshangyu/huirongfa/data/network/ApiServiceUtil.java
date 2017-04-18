package com.hnshangyu.huirongfa.data.network;

import android.content.Context;


import com.hnshangyu.huirongfa.model.ALiPay;
import com.hnshangyu.huirongfa.model.AddFriend;
import com.hnshangyu.huirongfa.model.AddFriendModle;
import com.hnshangyu.huirongfa.model.ConfirmFriend;
import com.hnshangyu.huirongfa.model.FriendListModel;
import com.hnshangyu.huirongfa.model.HomePage;
import com.hnshangyu.huirongfa.model.MoviePlayInfo;
import com.hnshangyu.huirongfa.model.NearFriendsModel;
import com.hnshangyu.huirongfa.model.PlayListModel;
import com.hnshangyu.huirongfa.model.SearchResult;
import com.hnshangyu.huirongfa.model.TicketSeatOrderConfirm;
import com.hnshangyu.huirongfa.model.WXPay;

import rx.Observable;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;


/**
 * Created by xiansong on 2016/12/21.
 */

public class ApiServiceUtil {

    public static Observable<MoviePlayInfo> getMoviePlayInfo(Context context,
                                                             String auditoriumId) {
        return RestAdapterUtils.getAPI(context)
                .getMoviePlayInfo(auditoriumId, ApiConfig.getSuffix(context))
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());
    }

    public static Observable<MoviePlayInfo> getMovieAuthPlayInfo(Context context,
                                                                 String auditoriumId,
                                                                 String movieId,
                                                                 String showId) {
        return RestAdapterUtils.getAPI(context)
                .getMovieAuthPlayInfo(auditoriumId, movieId, showId, ApiConfig.getSuffix(context))
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());
    }

    public static Observable<NearFriendsModel> getNearFriendsInfo(Context context,
                                                                  String showId,
                                                                  String auditoriumId,
                                                                  String roomNum) {
        return RestAdapterUtils.getAPI(context)
                .getNearFriendList(showId, auditoriumId, roomNum, ApiConfig.getSuffixS(context))
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());
    }

    public static Observable<PlayListModel> getPlayListInfo(Context context,
                                                            String auditoriumId) {
        return RestAdapterUtils.getAPI(context)
                .getPlayList(auditoriumId)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());
    }

    public static void unsubscribe(Subscription... subscriptions) {
        for (Subscription item : subscriptions) if (item != null) item.unsubscribe();
    }


    public static Observable<TicketSeatOrderConfirm> getOrderConfirm(Context context,
                                                                     String auditoriumId,
                                                                     String showId,
                                                                     String seats,
                                                                     String roomNum) {
        return RestAdapterUtils.getAPI(context)
                .getOrderConfirm(auditoriumId, showId, seats, roomNum, ApiConfig.getSuffix(context))
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());
    }


    public  static  Observable<AddFriendModle>  getSameSeatInformation(Context context,
                                                                       String roomNum,
                                                                       String showId,
                                                                       String auditoriumId,
                                                                       String appId,
                                                                       String token
    ){
        return  RestAdapterUtils.getAPI(context)
                .getSameSeat(roomNum,showId,auditoriumId,appId,token,ApiConfig.getSuffix(context))
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());
    }



    public  static  Observable<ConfirmFriend> getConfirmIsFriend(Context context,
                                                                 String friendId
                                                                 ){
        return RestAdapterUtils.getAPI(context)
                .getisFriend(friendId,ApiConfig.getSuffix(context))
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());
    }



    public  static  Observable<AddFriend> getInvetFriend(Context context,
                                                         String friendId
                                                         ){
        return  RestAdapterUtils.getAPI(context)
                .getInviteFriend(friendId,ApiConfig.getSuffix(context))
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());
    }

    public static Observable<HomePage> getHomePage(Context context) {
        return RestAdapterUtils.getAPI(context)
                .getHomePage()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());
    }

    public static Observable<WXPay> getWXPay(Context context,
                                             String appId,
                                             String out_trade_no,
                                             String body,
                                             int total_fee,
                                             String orderId,
                                             String notify_url,
                                             int type,
                                             String account,
                                             String timestamp,
                                             String ver,
                                             String sign) {
        return RestAdapterUtils.getPayAPI(context)
                .getWeiXinPay(appId, out_trade_no, body, total_fee,orderId,notify_url, type, account, timestamp, ver, sign)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());
    }

    public static Observable<ALiPay> getALPay(Context context,
                                              String appId,
                                              String out_trade_no,
                                              String body,
                                              int total_fee,
                                              String orderId,
                                              String notify_url,
                                              int type,
                                              String account,
                                              String timestamp,
                                              String ver,
                                              String sign) {
        return RestAdapterUtils.getPayAPI(context)
                .getALiPay(appId, out_trade_no, body, total_fee,orderId,notify_url, type, account, timestamp, ver, sign)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());
    }

    public static Observable<FriendListModel> getFriendList(Context context,
                                                            String userId,
                                                            String deviceId,
                                                            String appId,
                                                            String deviceType,
                                                            String token) {
        return RestAdapterUtils.getAPI(context)
                .getFriendList(userId, deviceId, appId, deviceType,token)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());
    }

    public static Observable<SearchResult> getSearchResult(Context context, String keyword) {
        return RestAdapterUtils.getAPI(context)
                .getSearchResult(keyword)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());
    }
}
