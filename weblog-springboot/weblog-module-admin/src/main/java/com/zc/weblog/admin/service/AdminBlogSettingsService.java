package com.zc.weblog.admin.service;

import com.zc.weblog.admin.model.vo.blogsettings.UpdateBlogSettingsReqVO;
import com.zc.weblog.common.utils.Response;

/**
 * @author zc
 * @date 2024/8/24 12:19
 */
public interface AdminBlogSettingsService {
    /**
     * 更新博客设置信息
     * @param updateBlogSettingsReqVO
     * @return
     */
    Response updateBlogSettings(UpdateBlogSettingsReqVO updateBlogSettingsReqVO);

    /**
     * 获取博客设置详情
     * @return
     */
    Response findDetail();
}
