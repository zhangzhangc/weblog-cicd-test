package com.zc.weblog.admin.service;

import com.zc.weblog.common.utils.Response;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author zc
 * @date 2024/8/23 21:53
 */
public interface AdminFileService {
    /**
     * 上传文件
     * @param file
     * @return
     */
    Response uploadFile(MultipartFile file);
}
