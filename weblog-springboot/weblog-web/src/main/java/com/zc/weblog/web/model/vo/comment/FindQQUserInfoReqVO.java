package com.zc.weblog.web.model.vo.comment;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

/**
 * @author zc
 * @date 2024/9/11 16:23
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FindQQUserInfoReqVO {

    @NotBlank(message = "QQ 号不能为空")
    private String qq;

}
