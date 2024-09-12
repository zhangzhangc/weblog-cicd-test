package com.zc.weblog.admin.model.vo.wiki;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

/**
 * @author zc
 * @date 2024/9/8 13:35
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ApiModel(value = "删除知识库 VO")
public class DeleteWikiReqVO {

    @NotNull(message = "知识库 ID 不能为空")
    private Long id;
}
