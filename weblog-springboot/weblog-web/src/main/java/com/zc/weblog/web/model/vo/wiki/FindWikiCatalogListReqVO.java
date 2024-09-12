package com.zc.weblog.web.model.vo.wiki;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

/**
 * @author zc
 * @date 2024/9/8 14:51
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FindWikiCatalogListReqVO {

    @NotNull(message = "知识库 ID 不能为空")
    private Long id;

}
