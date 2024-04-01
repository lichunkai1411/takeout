package com.ruoyi.biz.mapper;

import java.util.List;
import com.ruoyi.biz.domain.Category;

/**
 * 分类Mapper接口
 * 
 * @author ruoyi
 * @date 2024-04-01
 */
public interface CategoryMapper 
{
    /**
     * 查询分类
     * 
     * @param categoryId 分类主键
     * @return 分类
     */
    public Category selectCategoryByCategoryId(Long categoryId);

    /**
     * 查询分类列表
     * 
     * @param category 分类
     * @return 分类集合
     */
    public List<Category> selectCategoryList(Category category);

    /**
     * 新增分类
     * 
     * @param category 分类
     * @return 结果
     */
    public int insertCategory(Category category);

    /**
     * 修改分类
     * 
     * @param category 分类
     * @return 结果
     */
    public int updateCategory(Category category);

    /**
     * 删除分类
     * 
     * @param categoryId 分类主键
     * @return 结果
     */
    public int deleteCategoryByCategoryId(Long categoryId);

    /**
     * 批量删除分类
     * 
     * @param categoryIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCategoryByCategoryIds(Long[] categoryIds);
}
