package com.hnshangyu.huirongfa.util.base;

/**
 * 影片CheckKey管理 工具类
 */
public interface IMovieCheckKeyUtil {
    void setMovieCheck(String auditoriumId, String movieId, String checkKey);

    String getMovieCheck(String auditoriumId, String movieId);
}
