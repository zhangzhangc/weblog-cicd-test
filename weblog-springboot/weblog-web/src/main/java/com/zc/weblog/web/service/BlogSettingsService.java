package com.zc.weblog.web.service;

import com.zc.weblog.common.utils.Response;

/**
 * @author zc
 * @date 2024/8/25 19:58
 */
public interface BlogSettingsService {
    /**
     * 获取博客设置信息
     * @return
     */
    Response findDetail();
}
