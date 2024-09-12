package com.zc.weblog.web.controller;

import com.zc.weblog.common.aspect.ApiOperationLog;
import com.zc.weblog.common.utils.Response;
import com.zc.weblog.web.model.vo.comment.FindCommentListReqVO;
import com.zc.weblog.web.model.vo.comment.FindQQUserInfoReqVO;
import com.zc.weblog.web.model.vo.comment.PublishCommentReqVO;
import com.zc.weblog.web.service.CommentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zc
 * @date 2024/9/11 16:28
 */
@RestController
@RequestMapping("/comment")
@Api(tags = "评论")
public class CommentController {

    @Autowired
    private CommentService commentService;

    @PostMapping("/qq/userInfo")
    @ApiOperation(value = "获取 QQ 用户信息")
    @ApiOperationLog(description = "获取 QQ 用户信息")
    public Response findQQUserInfo(@RequestBody @Validated FindQQUserInfoReqVO findQQUserInfoReqVO) {
        return commentService.findQQUserInfo(findQQUserInfoReqVO);
    }


    @PostMapping("/publish")
    @ApiOperation(value = "发布评论")
    @ApiOperationLog(description = "发布评论")
    public Response publishComment(@RequestBody @Validated PublishCommentReqVO publishCommentReqVO) {
        return commentService.publishComment(publishCommentReqVO);
    }



    @PostMapping("/list")
    @ApiOperation(value = "获取页面所有评论")
    @ApiOperationLog(description = "获取页面所有评论")
    public Response findPageComments(@RequestBody @Validated FindCommentListReqVO findCommentListReqVO) {
        return commentService.findCommentList(findCommentListReqVO);
    }

}