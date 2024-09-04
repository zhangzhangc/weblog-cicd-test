package com.zc.weblog.common.domain.mapper;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zc.weblog.common.domain.dos.CategoryDO;
import com.zc.weblog.common.domain.dos.TagDO;
import org.apache.ibatis.annotations.Mapper;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

/**
 * @author zc
 * @date 2024/7/29 17:38
 */
@Mapper
public interface TagMapper extends BaseMapper<TagDO> {
    default Page<TagDO> selectPageList(long current, long size, String name,
                                       LocalDate startDate, LocalDate endDate) {
        // 分页对象
        Page<TagDO> page = new Page<>(current, size);

        // 构建查询条件
        LambdaQueryWrapper<TagDO> wrapper = new LambdaQueryWrapper<>();
        wrapper
                .like(Objects.nonNull(name), TagDO::getName, name) // 模糊查询
                .ge(Objects.nonNull(startDate), TagDO::getCreateTime, startDate) // 大于等于开始时间
                .le(Objects.nonNull(endDate), TagDO::getCreateTime, endDate) // 小于等于结束时间
                .orderByDesc(TagDO::getCreateTime); // order by create_time desc

        return selectPage(page, wrapper);
    }

    /**
     * 根据标签模糊查询
     * @param key
     * @return
     */
    default List<TagDO> selectByKey(String key) {
        LambdaQueryWrapper<TagDO> wrapper = new LambdaQueryWrapper<>();

        // 构造模糊查询的条件
        wrapper.like(TagDO::getName, key).orderByDesc(TagDO::getCreateTime);

        return selectList(wrapper);
    }

//    /**
//     * 根据标签 ID 批量查询
//     * @param tagIds
//     * @return
//     */
//    default List<TagDO> selectByIds(List<Long> tagIds) {
//        return selectList(Wrappers.<TagDO>lambdaQuery()
//                .in(TagDO::getId, tagIds));
//    }
//
//    default List<TagDO> selectByLimit(Long limit) {
//        return selectList(Wrappers.<TagDO>lambdaQuery()
//                .orderByDesc(TagDO::getArticlesTotal) // 按文章总数倒序排列
//                .last(String.format("LIMIT %d", limit))); // 查询指定数量
//    }
    /**
     * 根据标签 ID 批量查询
     * @param tagIds
     * @return
     */
    default List<TagDO> selectByIds(List<Long> tagIds) {
        return selectList(Wrappers.<TagDO>lambdaQuery()
                .in(TagDO::getId, tagIds));
    }
}
