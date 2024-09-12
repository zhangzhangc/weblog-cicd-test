package com.zc.weblog.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author zc
 * @date 2024/9/8 13:37
 */
@Getter
@AllArgsConstructor
public enum WikiCatalogLevelEnum {

    // 一级目录
    ONE(1),
    // 二级目录
    TWO(2);

    private Integer value;

}
