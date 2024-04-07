package com.ruoyi.web.controller.biz;

import com.ruoyi.biz.domain.Category;
import com.ruoyi.biz.dto.AddCategoryParam;
import com.ruoyi.biz.dto.CategoryListParam;
import com.ruoyi.biz.dto.CategoryListVo;
import com.ruoyi.biz.dto.EditCategoryParam;
import com.ruoyi.biz.mapper.CategoryMapper;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.common.utils.DictUtils;
import com.ruoyi.common.utils.SecurityUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

import static com.ruoyi.common.enums.OperatorType.MANAGE;

@Api("分类管理")
@RestController
@RequestMapping("/biz")
public class CategoryController extends BaseController {

    private final CategoryMapper categoryMapper;

    public CategoryController(CategoryMapper categoryMapper) {
        this.categoryMapper = categoryMapper;
    }

    @PreAuthorize("@ss.hasPermi('biz:category:list')")
    @ApiOperation("获取分类列表")
    @GetMapping("/categories")
    public TableDataInfo getList(CategoryListParam param) {
        startPage();
        List<CategoryListVo> list = categoryMapper.selectCategoryList(param);
        return getDataTable(list);
    }

    @PreAuthorize("@ss.hasPermi('biz:category:add')")
    @Log(title = "分类管理", businessType = BusinessType.INSERT, operatorType = MANAGE)
    @ApiOperation("添加分类")
    @PostMapping("/categories")
    public AjaxResult addCategory(@Valid @RequestBody AddCategoryParam param) {
        Category category = new Category();
        category.setCategoryName(param.getCategoryName());
        category.setCategorySort(param.getCategorySort());
        category.setCategoryType(param.getCategoryType());
        category.setCategoryStatus(param.getCategoryStatus());
        category.setCreateTime(DateUtils.getNowDate());
        category.setCreateBy(SecurityUtils.getUsername());
        categoryMapper.insertCategory(category);
        return AjaxResult.success();
    }

    @PreAuthorize("@ss.hasPermi('biz:category:edit')")
    @Log(title = "分类管理", businessType = BusinessType.UPDATE, operatorType = MANAGE)
    @ApiOperation("修改分类")
    @PutMapping("/categories/{id}")
    public AjaxResult editCategory(@PathVariable Long id, @Valid @RequestBody EditCategoryParam param) {
        Category category = categoryMapper.selectCategoryByCategoryId(id);
        if (category == null) {
            return AjaxResult.error("分类不存在");
        }
        category.setCategoryName(param.getCategoryName());
        category.setCategorySort(param.getCategorySort());
        category.setCategoryType(param.getCategoryType());
        category.setUpdateTime(DateUtils.getNowDate());
        category.setUpdateBy(SecurityUtils.getUsername());
        categoryMapper.updateCategory(category);
        return AjaxResult.success();
    }

    @PreAuthorize("@ss.hasPermi('biz:category:remove')")
    @Log(title = "分类管理", businessType = BusinessType.DELETE, operatorType = MANAGE)
    @ApiOperation("删除分类")
    @DeleteMapping("/categories/{id}")
    public AjaxResult remove(@PathVariable Long id) {
        categoryMapper.deleteCategoryByCategoryId(id);
        return AjaxResult.success();
    }

    @PreAuthorize("@ss.hasPermi('biz:category:edit')")
    @Log(title = "分类管理", businessType = BusinessType.UPDATE, operatorType = MANAGE)
    @ApiOperation("分类状态")
    @PutMapping("/categories/{id}/status")
    public AjaxResult changeStatus(@PathVariable Long id) {
        Category category = categoryMapper.selectCategoryByCategoryId(id);
        if (category == null) {
            return AjaxResult.error("分类不存在");
        }
        String currentStatus = DictUtils.getDictValue("biz_category_status", category.getCategoryStatus());
        if ("0".equals(currentStatus) || "禁用".equals(currentStatus)) {
            category.setCategoryStatus("1");
        } else {
            category.setCategoryStatus("0");
        }
        category.setUpdateTime(DateUtils.getNowDate());
        category.setUpdateBy(SecurityUtils.getUsername());
        categoryMapper.updateCategory(category);
        return AjaxResult.success();
    }
}
