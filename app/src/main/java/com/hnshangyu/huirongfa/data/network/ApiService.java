package com.hnshangyu.huirongfa.data.network;



import com.hnshangyu.huirongfa.model.ALiPay;
import com.hnshangyu.huirongfa.model.AddFriend;
import com.hnshangyu.huirongfa.model.AddFriendModle;
import com.hnshangyu.huirongfa.model.AuditoriumContent;
import com.hnshangyu.huirongfa.model.BuyMovieContent;
import com.hnshangyu.huirongfa.model.ConfirmFriend;
import com.hnshangyu.huirongfa.model.ExchangeContent;
import com.hnshangyu.huirongfa.model.ExchangeTicketsContent;
import com.hnshangyu.huirongfa.model.FriendListModel;
import com.hnshangyu.huirongfa.model.GiveTickets;
import com.hnshangyu.huirongfa.model.HomePage;
import com.hnshangyu.huirongfa.model.MoviePlayInfo;
import com.hnshangyu.huirongfa.model.NearFriendsModel;
import com.hnshangyu.huirongfa.model.PlayListModel;
import com.hnshangyu.huirongfa.model.SearchRecommend;
import com.hnshangyu.huirongfa.model.SearchResult;
import com.hnshangyu.huirongfa.model.TicketSeatOrderConfirm;
import com.hnshangyu.huirongfa.model.TicketSelectionModel;
import com.hnshangyu.huirongfa.model.UserAgreeFriendsContent;
import com.hnshangyu.huirongfa.model.UserDeleteFriendsContent;
import com.hnshangyu.huirongfa.model.UserDeleteMessageContent;
import com.hnshangyu.huirongfa.model.UserFriendsContent;
import com.hnshangyu.huirongfa.model.UserLevelContent;
import com.hnshangyu.huirongfa.model.UserMessageContent;
import com.hnshangyu.huirongfa.model.UserOrderContent;
import com.hnshangyu.huirongfa.model.UserTicketsContent;
import com.hnshangyu.huirongfa.model.WXPay;

import java.util.Map;

import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;
import rx.Observable;

/**
 * Created by xiansong on 2016/5/6.
 */
public interface ApiService {

    // 搜索页精彩推荐
    @GET("/from/huntKeyWordApi/huntKeyWords.do")
    Observable<SearchRecommend> getSearchRecommend();

    // 影厅接口
    @POST("/from/auditoriumApi/getAuditorium.do")
    Observable<AuditoriumContent> getAuditoriumContent(@Query("auditoriumId") String auditoriumId);

    // 单片购买接口
    @POST("/from/playMovieApi/getPlayMovie.do")
    Observable<BuyMovieContent> getBuyMovieContent(@Query("movieId") String movieId);

    // 搜索结果
    @GET("/from/searchResultApi/byKeyWords.do")
    Observable<SearchResult> getSearchResult(@Query("keyword") String keyword);

    //首页
    @GET("/from/headPageApi/headPage.do")
    Observable<HomePage> getHomePage();


    // 购票选座
    @GET("/from/seatTypeApi/getSeat.do")
    Observable<TicketSelectionModel> getTicketSelection(@Query("auditoriumId") String auditoriumId,
                                                        @Query("showId") String showId);

    /**
     * 获取播放信息
     *
     * @param auditoriumId 影厅id     true
     * @return {@link Observable<MoviePlayInfo>}
     */
    @GET("/from/transmitApi/getPlayMsg.do")
    Observable<MoviePlayInfo> getMoviePlayInfo(@Query("auditoriumId") String auditoriumId,
                                               @QueryMap() Map<String, String> suffix);

    /**
     * 播放鉴权
     *
     * @param auditoriumId 影厅id     true
     * @param movieId      影片id     true
     * @param showId       节目单id   false
     * @return {@link Observable< MoviePlayInfo >}
     */
    @GET("/from/checkTicketApi/checkTicket.do")
    Observable<MoviePlayInfo> getMovieAuthPlayInfo(@Query("auditoriumId") String auditoriumId,
                                                   @Query("movieId") String movieId,
                                                   @Query("showId") String showId,
                                                   @QueryMap() Map<String, String> suffix);

    /**
     * 节目单
     *
     * @param auditoriumId 影厅id true
     * @return {@link Observable<PlayListModel>}
     */
    @GET("/from/playEpgItemApi/getPlayList.do")
    Observable<PlayListModel> getPlayList(@Query("auditoriumId") String auditoriumId);

    /**
     * 同场好友
     *
     * @param showId       节目单id    true
     * @param auditoriumId 影厅id      true
     * @param roomNum      包房号      true
     * @param suffix
     * @return {@link Observable<NearFriendsModel>}
     */
    @GET("/from/friendsApi/getNearFriends.do")
    Observable<NearFriendsModel> getNearFriendList(@Query("showId") String showId,
                                                   @Query("auditoriumId") String auditoriumId,
                                                   @Query("roomNum") String roomNum,
                                                   @QueryMap() Map<String, String> suffix);

    //我的好友
    @GET("/from/friendsApi/getMyFriends.do")
    Observable<FriendListModel> getFriendList(@Query("userId") String userId,
                                              @Query("deviceId") String deviceId,
                                              @Query("appId") String appId,
                                              @Query("deviceType") String deviceType,
                                              @Query("token") String token);

    //我的好友（用户）
    @GET("/from/friendsApi/getMyFriends.do")
    Observable<UserFriendsContent> getUserFriendsContent(@QueryMap() Map<String, String> suffix);

    //删除好友
    @GET("/from/friendsApi/deleteMyFriend.do")
    Observable<UserDeleteFriendsContent> getDeleteUserFriendsContent(@Query("deviceId") String deviceId, @Query("friendId") String friendId, @Query("userId") String userId);

    //我的消息
    @GET("/from/advicesApi/getMyAdvices.do")
    Observable<UserMessageContent> getUserMessageContent(@QueryMap() Map<String, String> suffix);

    //删除消息
    @GET("/from/advicesApi/deleteMyAdvices.do")
    Observable<UserDeleteMessageContent> getDeleteUserMessageContent(@Query("messageId") String messageId, @Query("userId") String userId);

    //我的订单
    @GET("/from/cinemaOrderApi/getMyOrder.do")
    Observable<UserOrderContent> getUserOrderContent(@Query("deviceId") String deviceId, @Query("userId") String userId);


    //确认订单
    @GET("/from/cinemaOrderApi/addOrder.do")
    Observable<TicketSeatOrderConfirm> getOrderConfirm(
            @Query("auditoriumId") String auditoriumId,
            @Query("showId") String showId,
            @Query("seats") String seats,
            @Query("roomNum") String roomNum,
            @QueryMap() Map<String, String> suffix
    );


    //未使用影票
    @GET("/from/cinemaOrderApi/getAssetTicket.do")
    Observable<UserTicketsContent> getUserTicketsContent(@Query("deviceId") String deviceId, @Query("userId") String userId);

    //兑换影票
    @GET("/from/giftApi/exchangeHistory.do")
    Observable<ExchangeTicketsContent> getExchangeTicketsContent(@Query("deviceId") String deviceId, @Query("userId") String userId);

    //兑换
    @GET("/from/giftApi/exchangeTicket.do")
    Observable<ExchangeContent> getExchangeContent(@Query("deviceId") String deviceId, @Query("ticketNum") String ticketNum, @Query("userId") String userId);

    //赠送好友
    @GET("/from/giftApi/sendFriendTicket.do")
    Observable<GiveTickets> getGiveFriend(@Query("friendId") String friendId,
                                          @Query("ticketId") String ticketId,
                                          @Query("appId") String appId,
                                          @Query("deviceType") String deviceType,
                                          @Query("token") String token,
                                          @Query("userId") String userId);


    // 场内座位信息
    @GET("/from/venueApi/getSeatList.do")
    Observable<AddFriendModle> getSameSeat(
            @Query("roomNum") String roomNum,
            @Query("showId") String showId,
            @Query("auditoriumId") String auditoriumId,
            @Query("appId") String appId,
            @Query("token") String token,
            @QueryMap() Map<String, String> suffix);


    //验证好友
    @GET("/from/friendsApi/isFriend.do")
    Observable<ConfirmFriend> getisFriend(
            @Query("friendId") String friendId,
            @QueryMap() Map<String, String> suffix);


    // 邀请添加好友
    @GET("/from/friendsApi/addFriend.do")
    Observable<AddFriend> getInviteFriend(
            @Query("friendId") String friendId,
            @QueryMap() Map<String, String> suffix);


    //微信支付
    @POST("/open/api2/unifypay/prepay")
    Observable<WXPay> getWeiXinPay(@Query("appId") String appId,
                                   @Query("out_trade_no") String out_trade_no,
                                   @Query("body") String body,
                                   @Query("total_fee") int total_fee,
                                   @Query("attach.orderId") String orderId,
                                   @Query("notify_url") String notify_url,
                                   @Query("type") int type,
                                   @Query("account") String account,
                                   @Query("timestamp") String timestamp,
                                   @Query("ver") String ver,
                                   @Query("sign") String sign);

    //支付宝支付
    @POST("/open/api2/unifypay/prepay")
    Observable<ALiPay> getALiPay(@Query("appId") String appId,
                                 @Query("out_trade_no") String out_trade_no,
                                 @Query("body") String body,
                                 @Query("total_fee") int total_fee,
                                 @Query("attach.orderId") String orderId,
                                 @Query("notify_url") String notify_url,
                                 @Query("type") int type,
                                 @Query("account") String account,
                                 @Query("timestamp") String timestamp,
                                 @Query("ver") String ver,
                                 @Query("sign") String sign);


    //同意好友添加
    @GET("/from/friendsApi/agreeFriend.do")
    Observable<UserAgreeFriendsContent> getAgreeFriendsContent(@Query("adviceId") String adviceId);

    //用户等级
    @GET("/from/userMsgApi/getUserMsg.do")
    Observable<UserLevelContent> getUserLevelContent(@Query("deviceId") String deviceId, @Query("userId") String userId);
}
