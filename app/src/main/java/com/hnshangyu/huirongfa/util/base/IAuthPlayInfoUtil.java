package com.hnshangyu.huirongfa.util.base;


import com.hnshangyu.huirongfa.model.MoviePlayInfo;

import java.util.List;

/**
 * 影片认证操作 工具接口
 */
public interface IAuthPlayInfoUtil {

    /**
     * 播放页面 认证信息回调接口
     */
    interface AuthPlayInfoCallback {
        /**
         * 鉴权失败
         */
        void toAuthFail(String code, String message);

        /**
         * 健全成功
         */
        void toAuthSuccess();

        /**
         * 开启播放功能
         */
        void toPlay(List<MoviePlayInfo.DataBean.PlayListBean> playList);

        /**
         * 连接聊天室
         */
        void toChat(String roomId);

        /**
         * 异常信息处理
         *
         * @param code    错误码
         * @param message 错误提示信息
         */
        void onError(String code, String message);

        /**
         * 初始化播放页面view
         */
        void showPlayerViewFragment();

        /**
         * 显示没有正在播放的影片页面
         */
        void showHaveNoMovie();
    }

    /**
     * 检查VideoInfo认证情况
     */
    void checkAuth();

    /**
     * 初始化页面数据
     *
     * @param auditoriumId 影厅ID
     */
    void initPageData(String auditoriumId);

    /**
     * 设置工具回调监听
     *
     * @param callback 回调接口
     */
    void setCallback(AuthPlayInfoCallback callback);

    /**
     * 取消所有操作
     */
    void cancel();

}
