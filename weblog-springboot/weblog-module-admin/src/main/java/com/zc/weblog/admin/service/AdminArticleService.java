package com.zc.weblog.admin.service;

import com.zc.weblog.admin.model.vo.article.*;
import com.zc.weblog.common.utils.Response;

/**
 * @author zc
 * @date 2024/8/24 17:50
 */
public interface AdminArticleService {
    /**
     * 发布文章
     * @param publishArticleReqVO
     * @return
     */
    Response publishArticle(PublishArticleReqVO publishArticleReqVO);

    /**
     * 删除文章
     * @param deleteArticleReqVO
     * @return
     */
    Response deleteArticle(DeleteArticleReqVO deleteArticleReqVO);

    /**
     * 查询文章分页数据
     * @param findArticlePageListReqVO
     * @return
     */
    Response findArticlePageList(FindArticlePageListReqVO findArticlePageListReqVO);

    /**
     * 查询文章详情
     * @param findArticleDetailReqVO
     * @return
     */
    Response findArticleDetail(FindArticleDetailReqVO findArticleDetailReqVO);


    /**
     * 更新文章
     * @param updateArticleReqVO
     * @return
     */
    Response updateArticle(UpdateArticleReqVO updateArticleReqVO);
}
