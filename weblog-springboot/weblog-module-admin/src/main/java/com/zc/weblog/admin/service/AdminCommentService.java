package com.zc.weblog.admin.service;

import com.zc.weblog.admin.model.vo.comment.DeleteCommentReqVO;
import com.zc.weblog.admin.model.vo.comment.ExamineCommentReqVO;
import com.zc.weblog.admin.model.vo.comment.FindCommentPageListReqVO;
import com.zc.weblog.common.utils.Response;

/**
 * @author zc
 * @date 2024/9/11 17:25
 */
public interface AdminCommentService {

    /**
     * 查询评论分页数据
     * @param findCommentPageListReqVO
     * @return
     */
    Response findCommentPageList(FindCommentPageListReqVO findCommentPageListReqVO);

    /**
     * 删除评论
     * @param deleteCommentReqVO
     * @return
     */
    Response deleteComment(DeleteCommentReqVO deleteCommentReqVO);


    /**
     * 评论审核
     * @param examineCommentReqVO
     * @return
     */
    Response examine(ExamineCommentReqVO examineCommentReqVO);
}
