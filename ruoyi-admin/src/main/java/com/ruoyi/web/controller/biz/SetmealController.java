package com.ruoyi.web.controller.biz;

import com.ruoyi.biz.domain.Setmeal;
import com.ruoyi.biz.mapper.SetmealMapper;
import com.ruoyi.common.core.domain.AjaxResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 套餐管理
 *
 * @author lck
 * @date 2024-04-02
 */
@RestController
@RequestMapping("/biz/setmeal")
public class SetmealController {

    private final SetmealMapper setMealMapper;

    public SetmealController(SetmealMapper setMealMapper) {
        this.setMealMapper = setMealMapper;
    }

    // 查询套餐详情
    @RequestMapping("/get")
    public AjaxResult get(Long setMealId) {
        return AjaxResult.success(setMealMapper.selectSetmealBySetmealId(setMealId));
    }

    // 查询套餐列表
    @RequestMapping("/list")
    public AjaxResult list(Setmeal setMeal) {
        return AjaxResult.success(setMealMapper.selectSetmealList(setMeal));
    }

    // 添加套餐
    @RequestMapping("/add")
    public AjaxResult add(Setmeal setMeal) {
        setMealMapper.insertSetmeal(setMeal);
        return AjaxResult.success();
    }

    // 修改套餐
    @RequestMapping("/edit")
    public AjaxResult edit(Setmeal setMeal) {
        setMealMapper.updateSetmeal(setMeal);
        return AjaxResult.success();
    }

    // 删除套餐
    @RequestMapping("/remove")
    public AjaxResult remove(Long setMealId) {
        setMealMapper.deleteSetmealBySetmealId(setMealId);
        return AjaxResult.success();
    }
}
