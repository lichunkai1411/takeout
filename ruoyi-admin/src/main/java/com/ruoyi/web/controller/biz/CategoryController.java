package com.ruoyi.web.controller.biz;

import com.ruoyi.biz.domain.Category;
import com.ruoyi.biz.mapper.CategoryMapper;
import com.ruoyi.common.core.domain.AjaxResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 分类管理
 *
 * @author lck
 * @date 2024-04-02
 */
@RestController
@RequestMapping("/biz/category")
public class CategoryController {

    private final CategoryMapper categoryMapper;

    public CategoryController(CategoryMapper categoryMapper) {
        this.categoryMapper = categoryMapper;
    }

    // 查询分类详情
    @RequestMapping("/get")
    public AjaxResult get(Long categoryId) {
        return AjaxResult.success(categoryMapper.selectCategoryByCategoryId(categoryId));
    }

    // 查询分类列表
    @RequestMapping("/list")
    public AjaxResult list(Category category) {
        return AjaxResult.success(categoryMapper.selectCategoryList(category));
    }

    // 添加分类
    @RequestMapping("/add")
    public AjaxResult add(Category category) {
        categoryMapper.insertCategory(category);
        return AjaxResult.success();
    }

    // 修改分类
    @RequestMapping("/edit")
    public AjaxResult edit(Category category) {
        categoryMapper.updateCategory(category);
        return AjaxResult.success();
    }

    // 删除分类
    @RequestMapping("/remove")
    public AjaxResult remove(Long categoryId) {
        categoryMapper.deleteCategoryByCategoryId(categoryId);
        return AjaxResult.success();
    }
}
