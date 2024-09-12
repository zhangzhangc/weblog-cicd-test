package com.zc.weblog.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author zc
 * @date 2024/9/8 13:37
 */
@Getter
@AllArgsConstructor
public enum ArticleTypeEnum {

    NORMAL(1, "普通"),
    WIKI(2, "收录于知识库");

    private Integer value;
    private String description;

}
