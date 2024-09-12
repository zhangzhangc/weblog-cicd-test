package com.zc.weblog.web.service;

import com.zc.weblog.common.utils.Response;
import com.zc.weblog.web.model.vo.wiki.FindWikiArticlePreNextReqVO;
import com.zc.weblog.web.model.vo.wiki.FindWikiCatalogListReqVO;

/**
 * @author zc
 * @date 2024/9/8 14:49
 */

public interface WikiService {

    /**
     * 获取知识库
     * @return
     */
    Response findWikiList();

    /**
     * 获取知识库目录
     * @param findWikiCatalogListReqVO
     * @return
     */
    Response findWikiCatalogList(FindWikiCatalogListReqVO findWikiCatalogListReqVO);

    /**
     * 获取上下页
     * @param findWikiArticlePreNextReqVO
     * @return
     */
    Response findArticlePreNext(FindWikiArticlePreNextReqVO findWikiArticlePreNextReqVO);

}
