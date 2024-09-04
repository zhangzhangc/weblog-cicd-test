package com.zc.weblog.web.service;

import com.zc.weblog.common.utils.Response;
import com.zc.weblog.web.model.vo.archive.FindArchiveArticlePageListReqVO;

/**
 * @author zc
 * @date 2024/8/26 14:04
 */
public interface ArchiveService {

    /**
     * 获取文章归档分页数据
     * @param findArchiveArticlePageListReqVO
     * @return
     */
    Response findArchivePageList(FindArchiveArticlePageListReqVO findArchiveArticlePageListReqVO);
}
