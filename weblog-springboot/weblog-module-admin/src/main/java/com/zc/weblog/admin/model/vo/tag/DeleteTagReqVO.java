package com.zc.weblog.admin.model.vo.tag;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

/**
 * @author: 犬小哈
 * @url: www.quanxiaoha.com
 * @date: 2023-09-15 14:07
 * @description: 删除标签
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ApiModel(value = "删除标签 VO")
public class DeleteTagReqVO {

    @NotNull(message = "标签 ID 不能为空")
    private Long id;

}
