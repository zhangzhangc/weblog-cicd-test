package com.zc.weblog.admin.service;

import com.zc.weblog.admin.model.vo.user.UpdateAdminUserPasswordReqVO;
import com.zc.weblog.common.utils.Response;

/**
 * @author zc
 * @date 2024/6/21 8:59
 */
public interface AdminUserService {
    /**
     * 修改密码
     * @param updateAdminUserPasswordReqVO
     * @return
     */
    Response updatePassword(UpdateAdminUserPasswordReqVO updateAdminUserPasswordReqVO);
    /**
     * 获取当前登录用户信息
     * @return
     */
    Response findUserInfo();
}

