package com.zc.weblog.admin.model.vo.wiki;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * @author zc
 * @date 2024/9/8 14:02
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ApiModel(value = "更新知识库目录数据入参 VO")
public class UpdateWikiCatalogReqVO {

    /**
     * 知识库 ID
     */
    @NotNull(message = "知识库 ID 不能为空")
    private Long id;

    /**
     * 目录
     */
    @Valid
    private List<UpdateWikiCatalogItemReqVO> catalogs;


}
