package com.zc.weblog.admin.service;

/**
 * @author zc
 * @date 2024/9/4 10:01
 */
public interface AdminStatisticsService {
    /**
     * 统计各分类下文章总数
     */
    void statisticsCategoryArticleTotal();

    /**
     * 统计各标签下文章总数
     */
    void statisticsTagArticleTotal();
}
