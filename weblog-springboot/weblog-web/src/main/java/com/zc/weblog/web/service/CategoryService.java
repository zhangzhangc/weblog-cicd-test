package com.zc.weblog.web.service;

import com.zc.weblog.common.utils.Response;
import com.zc.weblog.web.model.vo.category.FindCategoryArticlePageListReqVO;
import com.zc.weblog.web.model.vo.category.FindCategoryListReqVO;

/**
 * @author zc
 * @date 2024/8/25 19:51
 */
public interface CategoryService {

    /**
     * 获取分类列表
     * @return
     */
    Response findCategoryList(FindCategoryListReqVO findCategoryListReqVO);

    /**
     * 获取分类下文章分页数据
     * @param findCategoryArticlePageListReqVO
     * @return
     */
    Response findCategoryArticlePageList(FindCategoryArticlePageListReqVO findCategoryArticlePageListReqVO);
}
