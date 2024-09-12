package com.zc.weblog.admin.model.vo.comment;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * @author zc
 * @date 2024/9/11 17:23
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FindCommentPageListRspVO {

    private Long id;

    private String routerUrl;

    private String avatar;

    private String nickname;

    private String mail;

    private String website;

    private LocalDateTime createTime;

    private String content;

    private Integer status;

    private String reason;
}

