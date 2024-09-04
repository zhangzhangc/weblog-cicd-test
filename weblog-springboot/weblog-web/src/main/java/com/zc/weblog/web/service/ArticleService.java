package com.zc.weblog.web.service;

import com.zc.weblog.common.utils.Response;
import com.zc.weblog.web.model.vo.article.FindArticleDetailReqVO;
import com.zc.weblog.web.model.vo.article.FindIndexArticlePageListReqVO;

/**
 * @author zc
 * @date 2024/8/25 19:12
 */
public interface ArticleService {
    /**
     * 获取首页文章分页数据
     * @param findIndexArticlePageListReqVO
     * @return
     */
    Response findArticlePageList(FindIndexArticlePageListReqVO findIndexArticlePageListReqVO);

    /**
     * 获取文章详情
     * @param findArticleDetailReqVO
     * @return
     */
    Response findArticleDetail(FindArticleDetailReqVO findArticleDetailReqVO);
}

