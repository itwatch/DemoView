package com.hnshangyu.huirongfa.util;

/**
 * Created by jwy on 2016/12/26.
 */

public class ActivityJumper {

    /*public static void JumpToGuide(Context context){
        Intent intent = new Intent();
        intent.setClass(context, GuideActivity.class);
        context.startActivity(intent);
        ((Activity) context).finish();
        ((Activity) context).overridePendingTransition(R.anim.anim_right, R.anim.anim_right_to_left);
    }

    //跳转主界面
    public static void JumpToHome(Context mContext) {
        Intent intent = new Intent();
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.setClass(mContext, MainActivity.class);
        mContext.startActivity(intent);
        ((Activity) mContext).finish();
        ((Activity) mContext).overridePendingTransition(R.anim.anim_right, R.anim.anim_right_to_left);
    }
    //跳转影厅界面
    public static void JumpToAuditorium(Context mContext, String auditoriumId) {
        Intent intent = new Intent();
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.putExtra("auditoriumId", auditoriumId);
        intent.setClass(mContext, AuditoriumActivity.class);
        mContext.startActivity(intent);
        ((Activity) mContext).overridePendingTransition(R.anim.anim_right, R.anim.anim_right_to_left);
    }

    //跳转播放界面
    public static void JumpToPlayer(Context mContext, String auditoriumId, String auditorium, String title,
                                    String des) {
        Intent intent = new Intent();
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.putExtra("id", auditoriumId);
        intent.putExtra("auditorium", auditorium);
        intent.putExtra("title", title);
        intent.putExtra("des", des);
        intent.setClass(mContext, PlayerActivity.class);
        mContext.startActivity(intent);
        ((Activity) mContext).overridePendingTransition(R.anim.anim_right, R.anim.anim_right_to_left);
    }

    //跳转搜索界面
    public static void JumpToSearch(Context mContext) {
        Intent intent = new Intent();
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.setClass(mContext, SearchActivity.class);
        mContext.startActivity(intent);
        ((Activity) mContext).overridePendingTransition(R.anim.anim_right, R.anim.anim_right_to_left);
    }

    //跳转个人中心界面
    public static void JumpToUser(Context mContext,String id) {
        Intent intent = new Intent();
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.putExtra("id", id);
        intent.setClass(mContext, UserActivity.class);
        mContext.startActivity(intent);
        ((Activity) mContext).overridePendingTransition(R.anim.anim_right, R.anim.anim_right_to_left);
    }

    *//**
     * 选择好友页面
     *
     * @param mContext context
     * @param ticketId 影票id
     * @param playTime 放映时间
     * @param title    电影标题
     * @param number   影票兑换码
     *//*
    public static void JumpToSendFriend(Context mContext, String ticketId, String playTime, String title, String number,String downloadUrl) {
        Intent intent = new Intent();
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.putExtra("ticketId", ticketId);
        intent.putExtra("playTime", playTime);
        intent.putExtra("title", title);
        intent.putExtra("number", number);
        intent.putExtra("downloadUrl",downloadUrl);
        intent.setClass(mContext, GiveTicketsActivity.class);
        mContext.startActivity(intent);
        ((Activity) mContext).overridePendingTransition(R.anim.anim_right, R.anim.anim_right_to_left);
    }

    //跳转个人选座界面
    public static void JumpToChooseSeat(Context mContext, String auditoriumId, String auditorium,
                                        String showId, String des, String title, String jumpId) {
        Intent intent = new Intent();
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.putExtra("auditoriumId", auditoriumId);
        intent.putExtra("auditorium", auditorium);
        intent.putExtra("showId", showId);
        intent.putExtra("des", des);
        intent.putExtra("title", title);
        intent.putExtra("jumpId", jumpId);
        intent.setClass(mContext, TicketSelectActivity.class);
        ((Activity) mContext).startActivity(intent);
        ((Activity) mContext).overridePendingTransition(R.anim.anim_right, R.anim.anim_right_to_left);
    }

    //跳转4天购票界面
    public static void JumpToBuyTickets(Context mContext, String auditoriumId, String movieId) {
        Intent intent = new Intent();
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.putExtra("auditoriumId", auditoriumId);
        intent.putExtra("movieId", movieId);
        intent.setClass(mContext, BuyMovieActivity.class);
        mContext.startActivity(intent);
        ((Activity) mContext).overridePendingTransition(R.anim.anim_right, R.anim.anim_right_to_left);
    }

    //跳转web界面
    public static void JumpToWeb(Context mContext, String loadURL, String auditoriumId, String movieId,
                                 String auditorium, String title, String des) {
        Intent intent = new Intent();
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.putExtra("loadURL", loadURL);
        intent.putExtra("auditoriumId", auditoriumId);
        intent.putExtra("movieId", movieId);
        intent.putExtra("auditorium", auditorium);
        intent.putExtra("title", title);
        intent.putExtra("des", des);
        intent.setClass(mContext, WebViewActivity.class);
        mContext.startActivity(intent);
        ((Activity) mContext).overridePendingTransition(R.anim.anim_right, R.anim.anim_right_to_left);
    }

    //跳转兑换影票界面
    public static void JumpToExchangeTickets(Context mContext) {
        Intent intent = new Intent();
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.setClass(mContext, ExchangeTicketsActivity.class);
        mContext.startActivity(intent);
        ((Activity) mContext).overridePendingTransition(R.anim.anim_right, R.anim.anim_right_to_left);
    }

    //退出界面
    public static void JumpToFinish(Context mContext) {
        ((Activity) mContext).finish();
        ((Activity) mContext).overridePendingTransition(R.anim.anim_right_to_left, R.anim.anim_left_to_right);
    }

    //跳转未使用影票界面
    public static void JumpToUserTickets(Context mContext) {
        Intent intent = new Intent();
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.setClass(mContext, UserTicketsActivity.class);
        mContext.startActivity(intent);
        ((Activity) mContext).overridePendingTransition(R.anim.anim_right, R.anim.anim_right_to_left);
    }

    //跳转个人编辑界面
    public static void JumpToUserEdit(Context mContext) {
        Intent intent = new Intent();
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.setClass(mContext, UserEditInfoActivity.class);
        mContext.startActivity(intent);
        ((Activity) mContext).overridePendingTransition(R.anim.anim_right, R.anim.anim_right_to_left);
    }

    //跳转我的订单
    public static void JumpToUserOrder(Context mContext) {
        Intent intent = new Intent();
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.setClass(mContext, UserOrderActivity.class);
        mContext.startActivity(intent);
        ((Activity) mContext).overridePendingTransition(R.anim.anim_right, R.anim.anim_right_to_left);
    }




    //跳转我的消息
    public static void JumpToUserMessage(Context mContext) {
        Intent intent = new Intent();
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.setClass(mContext, UserMessageActivity.class);
        mContext.startActivity(intent);
        ((Activity) mContext).overridePendingTransition(R.anim.anim_right, R.anim.anim_right_to_left);
    }

    //跳转我的好友
    public static void JumpToUserFriends(Context mContext) {
        Intent intent = new Intent();
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.setClass(mContext, UserFriendsActivity.class);
        mContext.startActivity(intent);
        ((Activity) mContext).overridePendingTransition(R.anim.anim_right, R.anim.anim_right_to_left);
    }

    //跳转关于我们
    public static void JumpToAboutUs(Context mContext) {
        Intent intent = new Intent();
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.setClass(mContext, AboutUsActivity.class);
        mContext.startActivity(intent);
        ((Activity) mContext).overridePendingTransition(R.anim.anim_right, R.anim.anim_right_to_left);
    }

    //跳转设置
    public static void JumpToSetting(Context mContext) {
        Intent intent = new Intent();
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.setClass(mContext, SettingActivity.class);
        mContext.startActivity(intent);
        ((Activity) mContext).overridePendingTransition(R.anim.anim_right, R.anim.anim_right_to_left);
    }

    //跳转修改昵称
    public static void JumpToNickName(Context mContext) {
        Intent intent = new Intent();
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.setClass(mContext, ModifyNickNameActivity.class);
        mContext.startActivity(intent);
        ((Activity) mContext).overridePendingTransition(R.anim.anim_right, R.anim.anim_right_to_left);
    }

    //跳转绑定手机
    public static void JumpToBindPhone(Context mContext) {
        Intent intent = new Intent();
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.setClass(mContext, UserBindPhoneNumberActivity.class);
        mContext.startActivity(intent);
        ((Activity) mContext).overridePendingTransition(R.anim.anim_right, R.anim.anim_right_to_left);
    }

    //跳转修改绑定
    public static void JumpToOldPhone(Context mContext) {
        Intent intent = new Intent();
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.setClass(mContext, UserOldPhoneActivity.class);
        mContext.startActivity(intent);
        ((Activity) mContext).overridePendingTransition(R.anim.anim_right, R.anim.anim_right_to_left);
    }*/
}
