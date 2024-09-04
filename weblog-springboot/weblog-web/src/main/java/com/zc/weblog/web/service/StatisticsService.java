package com.zc.weblog.web.service;

import com.zc.weblog.common.utils.Response;

/**
 * @author zc
 * @date 2024/9/1 18:47
 */
public interface StatisticsService {

    /**
     * 获取文章总数、分类总数、标签总数、总访问量统计信息
     * @return
     */
    Response findInfo();
}
