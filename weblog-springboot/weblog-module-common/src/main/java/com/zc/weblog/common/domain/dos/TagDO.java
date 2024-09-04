package com.zc.weblog.common.domain.dos;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * @author zc
 * @date 2024/7/29 17:37
 */

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    @TableName("t_tag")
    public class TagDO {

        @TableId(type = IdType.AUTO)
        private Long id;

        private String name;

        private LocalDateTime createTime;

        private LocalDateTime updateTime;

        private Boolean isDeleted;

    private Integer articlesTotal;
    }

