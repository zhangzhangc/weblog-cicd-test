package com.zc.weblog.web.service;

import com.zc.weblog.common.utils.Response;
import com.zc.weblog.web.model.vo.tag.FindTagArticlePageListReqVO;

/**
 * @author zc
 * @date 2024/8/25 19:55
 */
public interface TagService {

    /**
     * 获取标签列表
     * @return
     */
    Response findTagList();

    /**
     * 获取标签下文章分页列表
     * @param findTagArticlePageListReqVO
     * @return
     */
    Response findTagPageList(FindTagArticlePageListReqVO findTagArticlePageListReqVO);
}
