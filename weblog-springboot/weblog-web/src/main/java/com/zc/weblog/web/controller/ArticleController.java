package com.zc.weblog.web.controller;

import com.zc.weblog.common.aspect.ApiOperationLog;
import com.zc.weblog.common.utils.Response;
import com.zc.weblog.web.model.vo.article.FindArticleDetailReqVO;
import com.zc.weblog.web.model.vo.article.FindIndexArticlePageListReqVO;
import com.zc.weblog.web.service.ArticleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zc
 * @date 2024/8/25 19:46
 */
@RestController
@Api(tags = "文章")
@RequestMapping("/article")
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @PostMapping("/list")
    @ApiOperation(value = "获取首页文章分页数据")
    @ApiOperationLog(description = "获取首页文章分页数据")
    public Response findArticlePageList(@RequestBody FindIndexArticlePageListReqVO findIndexArticlePageListReqVO) {
        return articleService.findArticlePageList(findIndexArticlePageListReqVO);
    }


    @PostMapping("/detail")
    @ApiOperation(value = "获取文章详情")
    @ApiOperationLog(description = "获取文章详情")
    public Response findArticleDetail(@RequestBody FindArticleDetailReqVO findArticleDetailReqVO) {
        return articleService.findArticleDetail(findArticleDetailReqVO);
    }

}

