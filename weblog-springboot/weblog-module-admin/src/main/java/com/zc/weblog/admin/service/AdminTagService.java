package com.zc.weblog.admin.service;

import com.zc.weblog.admin.model.vo.category.AddCategoryReqVO;
import com.zc.weblog.admin.model.vo.category.DeleteCategoryReqVO;
import com.zc.weblog.admin.model.vo.category.FindCategoryPageListReqVO;
import com.zc.weblog.admin.model.vo.tag.AddTagReqVO;
import com.zc.weblog.admin.model.vo.tag.DeleteTagReqVO;
import com.zc.weblog.admin.model.vo.tag.FindTagPageListReqVO;
import com.zc.weblog.admin.model.vo.tag.SearchTagsReqVO;
import com.zc.weblog.common.utils.PageResponse;
import com.zc.weblog.common.utils.Response;

/**
 * @author zc
 * @date 2024/7/29 17:44
 */
public interface AdminTagService {
    /**
     * 添加标签集合
     * @param addTagReqVO
     * @return
     */
    Response addTags(AddTagReqVO addTagReqVO);

    /**
     * 查询标签分页
     * @param findTagPageListReqVO
     * @return
     */
    PageResponse findTagPageList(FindTagPageListReqVO findTagPageListReqVO);

    /**
     * 删除标签
     * @param deleteTagReqVO
     * @return
     */
    Response deleteTag(DeleteTagReqVO deleteTagReqVO);

    /**
     * 根据标签关键词模糊查询
     * @param searchTagsReqVO
     * @return
     */
    Response searchTags(SearchTagsReqVO searchTagsReqVO);

    /**
     * 查询标签 Select 列表数据
     * @return
     */
    Response findTagSelectList();


}
