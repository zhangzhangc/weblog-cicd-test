package com.zc.weblog.common.domain.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zc.weblog.common.domain.dos.BlogSettingsDO;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author zc
 * @date 2024/8/24 12:11
 */
@Mapper
public interface BlogSettingsMapper extends BaseMapper<BlogSettingsDO> {
}

