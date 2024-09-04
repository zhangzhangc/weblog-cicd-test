package com.zc.weblog.common.domain.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.zc.weblog.common.config.InsertBatchMapper;
import com.zc.weblog.common.domain.dos.ArticleTagRelDO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author zc
 * @date 2024/8/24 17:48
 */
@Mapper
public interface ArticleTagRelMapper extends InsertBatchMapper<ArticleTagRelDO> {
    /**
     * 根据文章 ID 删除关联记录
     * @param articleId
     * @return
     */
    default int deleteByArticleId(Long articleId) {
        return delete(Wrappers.<ArticleTagRelDO>lambdaQuery()
                .eq(ArticleTagRelDO::getArticleId, articleId));
    }


    /**
     * 根据文章 ID 来查询
     * @param articleId
     * @return
     */
    default List<ArticleTagRelDO> selectByArticleId(Long articleId) {
        return selectList(Wrappers.<ArticleTagRelDO>lambdaQuery()
                .eq(ArticleTagRelDO::getArticleId, articleId));
    }

    /**
     * 根据标签 ID 查询
     * @param tagId
     * @return
     */
    default ArticleTagRelDO selectOneByTagId(Long tagId) {
        return selectOne(Wrappers.<ArticleTagRelDO>lambdaQuery()
                .eq(ArticleTagRelDO::getTagId, tagId)
                .last("LIMIT 1"));
    }

    /**
     * 根据文章 ID 集合批量查询
     * @param articleIds
     * @return
     */
    default List<ArticleTagRelDO> selectByArticleIds(List<Long> articleIds) {
        return selectList(Wrappers.<ArticleTagRelDO>lambdaQuery()
                .in(ArticleTagRelDO::getArticleId, articleIds));
    }

    /**
     * 查询该标签 ID 下所有关联记录
     * @param tagId
     * @return
     */
    default List<ArticleTagRelDO> selectByTagId(Long tagId) {
        return selectList(Wrappers.<ArticleTagRelDO>lambdaQuery()
                .eq(ArticleTagRelDO::getTagId, tagId));
    }
}


