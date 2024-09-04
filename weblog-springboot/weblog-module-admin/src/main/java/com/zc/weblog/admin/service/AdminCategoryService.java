package com.zc.weblog.admin.service;

import com.zc.weblog.admin.model.vo.category.AddCategoryReqVO;
import com.zc.weblog.admin.model.vo.category.DeleteCategoryReqVO;
import com.zc.weblog.admin.model.vo.category.FindCategoryPageListReqVO;
import com.zc.weblog.common.utils.PageResponse;
import com.zc.weblog.common.utils.Response;

/**
 * @author zc
 * @date 2024/7/29 17:44
 */
public interface AdminCategoryService {
    /**
     * 添加分类
     * @param addCategoryReqVO
     * @return
     */
    Response addCategory(AddCategoryReqVO addCategoryReqVO);

    /**
     * 分类分页数据查询
     * @param findCategoryPageListReqVO
     * @return
     */
    PageResponse findCategoryPageList(FindCategoryPageListReqVO findCategoryPageListReqVO);

    /**
     * 删除分类
     * @param deleteCategoryReqVO
     * @return
     */
    Response deleteCategory(DeleteCategoryReqVO deleteCategoryReqVO);


    /**
     * 获取文章分类的 Select 列表数据
     * @return
     */
    Response findCategorySelectList();

}
