package com.ruoyi.biz.mapper;

import com.ruoyi.biz.domain.Category;
import com.ruoyi.biz.dto.CategoryAllParam;
import com.ruoyi.biz.dto.CategoryAllVo;
import com.ruoyi.biz.dto.CategoryListParam;
import com.ruoyi.biz.dto.CategoryListVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 分类Mapper接口
 *
 * @author ruoyi
 * @date 2024-04-01
 */
public interface CategoryMapper {
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
     * @param param 分类
     * @return 分类集合
     */
    public List<CategoryListVo> selectCategoryList(CategoryListParam param);

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

    List<Category> selectCategoryByType(String categoryType);

    int selectCountDishByCategoryId(Long id);

    int selectCountSetMealByCategoryId(Long id);

    List<CategoryAllVo> getAll(@Param("param") CategoryAllParam param, @Param("storeId") Long storeId);
}
