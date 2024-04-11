package com.ruoyi.web.controller.biz;

import com.ruoyi.biz.domain.Setmeal;
import com.ruoyi.biz.domain.SetmealDish;
import com.ruoyi.biz.dto.*;
import com.ruoyi.biz.mapper.SetmealDishMapper;
import com.ruoyi.biz.mapper.SetmealMapper;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.common.utils.SecurityUtils;
import com.ruoyi.common.utils.bean.BeanUtils;
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
    private final SetmealDishMapper setmealDishMapper;

    public SetmealController(SetmealMapper setMealMapper, SetmealDishMapper setmealDishMapper) {
        this.setMealMapper = setMealMapper;
        this.setmealDishMapper = setmealDishMapper;
    }

    @PreAuthorize("@ss.hasPermi('biz:setmeal:info')")
    @ApiOperation("获取套餐详情")
    @GetMapping("/setmeal/{id}")
    // 返回详情中缺少菜品信息
    public AjaxResult getInfo(@PathVariable Long id) {
        return AjaxResult.success(setMealMapper.selectSetmealBySetmealId(id));
    }

    @PreAuthorize("@ss.hasPermi('biz:setmeal:list')")
    @ApiOperation("获取套餐列表")
    @GetMapping("/setmeals")
    public TableDataInfo getList(SetmealListParam param) {
        // 只能获取本店铺下的套餐
        Long storeId = SecurityUtils.getLoginUser().getUser().getStoreId();
        startPage();
        List<SetmealListVo> list = setMealMapper.selectSetmealList(param,storeId);
        return getDataTable(list);
    }

    @PreAuthorize("@ss.hasPermi('biz:setmeal:add')")
    @Log(title = "套餐管理", businessType = BusinessType.INSERT,operatorType = MANAGE)
    @ApiOperation("添加套餐")
    @PostMapping("/setmeals")
    public AjaxResult addSetmeal(@Valid @RequestBody AddSetmealParam param) {
        Setmeal setMeal = new Setmeal();
        // 只能添加本店铺下的套餐
        Long storeId = SecurityUtils.getLoginUser().getUser().getStoreId();
        BeanUtils.copyBeanProp(param,setMeal);
        setMeal.setStoreId(storeId);
        setMeal.setCreateBy(SecurityUtils.getUsername());
        setMeal.setCreateTime(DateUtils.getNowDate());
        setMeal.setSaleStatus("biz_sale_status_disable");
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
        // 只能修改本店铺下的套餐信息
        Long storeId = SecurityUtils.getLoginUser().getUser().getStoreId();
        if (!storeId.equals(setMeal.getStoreId())) {
            return AjaxResult.error("只能修改本店铺的套餐信息");
        }
        setMealMapper.deleteSetmealDishBySetmealId(id);
        BeanUtils.copyBeanProp(param,setMeal);
        setMeal.setUpdateTime(DateUtils.getNowDate());
        setMeal.setUpdateBy(SecurityUtils.getUsername());
        setMealMapper.updateSetmeal(setMeal);
        return AjaxResult.success();
    }

    @PreAuthorize("@ss.hasPermi('biz:setmeal:remove')")
    @Log(title = "套餐管理", businessType = BusinessType.DELETE,operatorType = MANAGE)
    @ApiOperation("批量删除套餐")
    @DeleteMapping("/setmeals")
    public AjaxResult remove(@RequestBody SetMealIdsParam param) {
        for (Long id : param.getIds()) {
            Setmeal setMeal = setMealMapper.selectSetmealBySetmealId(id);
            if (setMeal == null) {
                return AjaxResult.error("套餐不存在");
            }
            // 只能删除本店铺下的套餐信息
            Long storeId = SecurityUtils.getLoginUser().getUser().getStoreId();
            if (!storeId.equals(setMeal.getStoreId())) {
                return AjaxResult.error("只能删除本店铺的套餐信息");
            }
            // 在售状态下，不可删除套餐
            if ("biz_sale_status_enable".equals(setMeal.getSaleStatus())) {
                return AjaxResult.error("在售状态下，不可删除套餐");
            }
            setMealMapper.deleteSetmealById(id);
            setmealDishMapper.deleteSetmealDishBySetmealId(id);
        }
        return AjaxResult.success();
    }

    @PreAuthorize("@ss.hasPermi('biz:setmeal:editSaleStatus')")
    @Log(title = "套餐管理", businessType = BusinessType.UPDATE,operatorType = MANAGE)
    @ApiOperation("售卖状态")
    @PutMapping("/setmeals/saleStatus/{id}")
    public AjaxResult changeSaleStatus(@PathVariable Long id, @Valid @RequestBody EditSetmealStatusParam param) {
        Setmeal setMeal = setMealMapper.selectSetmealBySetmealId(id);
        if (setMeal == null) {
            return AjaxResult.error("套餐不存在");
        }
        // 只能修改本店铺下的套餐状态
        if (!setMeal.getStoreId().equals(SecurityUtils.getLoginUser().getUser().getStoreId())) {
            return AjaxResult.error("只能修改本店铺的套餐状态");
        }
        setMeal.setSaleStatus(param.getSaleStatus());
        setMeal.setUpdateTime(DateUtils.getNowDate());
        setMeal.setUpdateBy(SecurityUtils.getUsername());
        setMealMapper.updateSetmeal(setMeal);
        return AjaxResult.success();
    }
}
