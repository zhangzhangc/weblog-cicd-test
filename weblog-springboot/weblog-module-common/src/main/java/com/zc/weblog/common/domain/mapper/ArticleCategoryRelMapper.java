package com.zc.weblog.common.domain.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.zc.weblog.common.domain.dos.ArticleCategoryRelDO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author zc
 * @date 2024/8/24 17:48
 */
@Mapper
public interface ArticleCategoryRelMapper extends BaseMapper<ArticleCategoryRelDO> {
    /**
     * 根据文章 ID 删除关联记录
     * @param articleId
     * @return
     */
    default int deleteByArticleId(Long articleId) {
        return delete(Wrappers.<ArticleCategoryRelDO>lambdaQuery()
                .eq(ArticleCategoryRelDO::getArticleId, articleId));
    }


    /**
     * 根据文章 ID 查询
     * @param articleId
     * @return
     */
    default ArticleCategoryRelDO selectByArticleId(Long articleId) {
        return selectOne(Wrappers.<ArticleCategoryRelDO>lambdaQuery()
                .eq(ArticleCategoryRelDO::getArticleId, articleId));
    }

    /**
     * 根据分类 ID 查询
     * @param categoryId
     * @return
     */
    default ArticleCategoryRelDO selectOneByCategoryId(Long categoryId) {
        return selectOne(Wrappers.<ArticleCategoryRelDO>lambdaQuery()
                .eq(ArticleCategoryRelDO::getCategoryId, categoryId)
                .last("LIMIT 1"));
    }

    /**
     * 根据文章 ID 集合批量查询
     * @param articleIds
     * @return
     */
    default List<ArticleCategoryRelDO> selectByArticleIds(List<Long> articleIds) {
        return selectList(Wrappers.<ArticleCategoryRelDO>lambdaQuery()
                .in(ArticleCategoryRelDO::getArticleId, articleIds));
    }

    /**
     * 根据分类 ID 查询所有的关联记录
     * @param categoryId
     * @return
     */
    default List<ArticleCategoryRelDO> selectListByCategoryId(Long categoryId) {
        return selectList(Wrappers.<ArticleCategoryRelDO>lambdaQuery()
                .eq(ArticleCategoryRelDO::getCategoryId, categoryId));
    }
}

