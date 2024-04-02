package com.ruoyi.web.controller.biz;

import com.ruoyi.biz.domain.Dish;
import com.ruoyi.biz.mapper.DishMapper;
import com.ruoyi.common.core.domain.AjaxResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 菜品管理
 *
 * @author lck
 * @date 2024-04-02
 */
@RestController
@RequestMapping("/biz/dish")
public class DishController {

    private final DishMapper dishMapper;

    public DishController(DishMapper dishMapper) {
        this.dishMapper = dishMapper;
    }

    // 查询菜品详情
        @RequestMapping("/get")
        public AjaxResult get(Long dishId) {
            return AjaxResult.success(dishMapper.selectDishByDishId(dishId));
        }

        // 查询菜品列表
        @RequestMapping("/list")
        public AjaxResult list(Dish dish) {
            return AjaxResult.success(dishMapper.selectDishList(dish));
        }

        // 添加菜品
        @RequestMapping("/add")
        public AjaxResult add(Dish dish) {
            dishMapper.insertDish(dish);
            return AjaxResult.success();
        }

        // 修改菜品
        @RequestMapping("/edit")
        public AjaxResult edit(Dish dish) {
            dishMapper.updateDish(dish);
            return AjaxResult.success();
        }

        // 删除菜品
        @RequestMapping("/remove")
        public AjaxResult remove(Long dishId) {
            dishMapper.deleteDishByDishId(dishId);
            return AjaxResult.success();
        }
}
