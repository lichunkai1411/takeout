package com.ruoyi.web.controller.biz;

import com.ruoyi.biz.domain.Setmeal;
import com.ruoyi.biz.dto.AddSetmealParam;
import com.ruoyi.biz.dto.EditSetmealParam;
import com.ruoyi.biz.dto.SetmealListParam;
import com.ruoyi.biz.dto.SetmealListVo;
import com.ruoyi.biz.mapper.SetmealMapper;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.common.utils.SecurityUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.List;

import static com.ruoyi.common.enums.OperatorType.MANAGE;

@Api("套餐管理")
@RestController
@RequestMapping("/biz")
public class SetmealController extends BaseController {

    private final SetmealMapper setMealMapper;

    public SetmealController(SetmealMapper setMealMapper) {
        this.setMealMapper = setMealMapper;
    }

    @PreAuthorize("@ss.hasPermi('biz:setmeal:info')")
    @ApiOperation("获取套餐详情")
    @GetMapping("/setmeal/{id}")
    public AjaxResult getInfo(@PathVariable Long id) {
        return AjaxResult.success(setMealMapper.selectSetmealBySetmealId(id));
    }

    @PreAuthorize("@ss.hasPermi('biz:setmeal:list')")
    @ApiOperation("获取套餐列表")
    @GetMapping("/setmeals")
    public TableDataInfo getList(SetmealListParam param) {
        startPage();
        List<SetmealListVo> list = setMealMapper.selectSetmealList(param);
        return getDataTable(list);
    }

    @PreAuthorize("@ss.hasPermi('biz:setmeal:add')")
    @Log(title = "套餐管理", businessType = BusinessType.INSERT,operatorType = MANAGE)
    @ApiOperation("添加套餐")
    @PostMapping("/setmeals")
    public AjaxResult addSetmeal(@Valid @RequestBody AddSetmealParam param) {
        Setmeal setMeal = new Setmeal();
        setMeal.setSetmealName(param.getSetmealName());
        setMeal.setSetmealPrice(param.getSetmealPrice());
        setMeal.setSetmealImage(param.getSetmealImage());
        setMeal.setCategoryId(param.getCategoryId());
        setMeal.setSaleStatus(param.getSaleStatus());
        setMeal.setCreateTime(DateUtils.getNowDate());
        setMeal.setCreateBy(SecurityUtils.getUsername());
        setMealMapper.insertSetmeal(setMeal);
        return AjaxResult.success();
    }

    @PreAuthorize("@ss.hasPermi('biz:setmeal:edit')")
    @Log(title = "套餐管理", businessType = BusinessType.UPDATE,operatorType = MANAGE)
    @ApiOperation("修改套餐")
    @PutMapping("/setmeals/{id}")
    public AjaxResult editSetmeal(@PathVariable Long id, @Valid @RequestBody EditSetmealParam param) {
        Setmeal setMeal = setMealMapper.selectSetmealBySetmealId(id);
        if (setMeal == null) {
            return AjaxResult.error("套餐不存在");
        }
        setMeal.setSetmealName(param.getSetmealName());
        setMeal.setSetmealPrice(param.getSetmealPrice());
        setMeal.setSetmealImage(param.getSetmealImage());
        setMeal.setCategoryId(param.getCategoryId());
        setMeal.setUpdateTime(DateUtils.getNowDate());
        setMeal.setUpdateBy(SecurityUtils.getUsername());
        setMealMapper.updateSetmeal(setMeal);
        return AjaxResult.success();
    }

    @PreAuthorize("@ss.hasPermi('biz:setmeal:remove')")
    @Log(title = "套餐管理", businessType = BusinessType.DELETE,operatorType = MANAGE)
    @ApiOperation("删除套餐")
    @DeleteMapping("/setmeals/{id}")
    public AjaxResult remove(@PathVariable Long id) {
        setMealMapper.deleteSetmealBySetmealId(id);
        return AjaxResult.success();
    }

    @PreAuthorize("@ss.hasPermi('biz:setmeal:edit')")
    @Log(title = "套餐管理", businessType = BusinessType.UPDATE,operatorType = MANAGE)
    @ApiOperation("售卖状态")
    @PutMapping("/setmeals/saleStatus/{id}")
    public AjaxResult changeSaleStatus(@PathVariable Long id) {
        Setmeal setMeal = setMealMapper.selectSetmealBySetmealId(id);
        if (setMeal == null) {
            return AjaxResult.error("套餐不存在");
        }
        setMeal.setSaleStatus(setMeal.getSaleStatus().equals("1")  ? "0" : "1");
        setMeal.setUpdateTime(DateUtils.getNowDate());
        setMeal.setUpdateBy(SecurityUtils.getUsername());
        setMealMapper.updateSetmeal(setMeal);
        return AjaxResult.success();
    }
}
