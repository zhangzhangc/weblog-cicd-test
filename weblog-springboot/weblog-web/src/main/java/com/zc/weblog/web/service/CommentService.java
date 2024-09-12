package com.zc.weblog.web.service;

import com.zc.weblog.common.utils.Response;
import com.zc.weblog.web.model.vo.comment.FindCommentListReqVO;
import com.zc.weblog.web.model.vo.comment.FindQQUserInfoReqVO;
import com.zc.weblog.web.model.vo.comment.PublishCommentReqVO;

/**
 * @author zc
 * @date 2024/9/11 16:25
 */
public interface CommentService {


    /**
     * 根据 QQ 号获取用户信息
     * @param findQQUserInfoReqVO
     * @return
     */
    Response findQQUserInfo(FindQQUserInfoReqVO findQQUserInfoReqVO);


    /**
     * 发布评论
     * @param publishCommentReqVO
     * @return
     */
    Response publishComment(PublishCommentReqVO publishCommentReqVO);


    /**
     * 查询页面所有评论
     * @param findCommentListReqVO
     * @return
     */
    Response findCommentList(FindCommentListReqVO findCommentListReqVO);
}
