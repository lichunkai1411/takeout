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
 */
public interface CategoryMapper {
    /**
     * 通过分类ID查询分类
     */
    Category selectCategoryByCategoryId(Long categoryId);

    /**
     * 查询分类列表
     */
    List<CategoryListVo> selectCategoryList(@Param("param") CategoryListParam param, @Param("storeId") Long storeId);

    /**
     * 新增分类
     */
    int insertCategory(Category category);

    /**
     * 修改分类
     */
    int updateCategory(Category category);

    /**
     * 通过分类ID删除分类
     */
    int deleteCategoryByCategoryId(Long categoryId);

    /**
     * 通过查询条件获取所有分类
     */
    List<CategoryAllVo> getAll(@Param("param") CategoryAllParam param, @Param("storeId") Long storeId);
}
