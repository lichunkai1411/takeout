package com.ruoyi.biz.mapper;

import com.ruoyi.biz.domain.SetmealDish;

import java.util.List;

/**
 * 套餐菜品Mapper接口
 */
public interface SetmealDishMapper {

    /**
     * 通过套餐ID查询套餐菜品
     */
    SetmealDish selectSetmealDishBySetmealId(Long setmealId);

    /**
     * 查询套餐菜品列表
     */
    List<SetmealDish> selectSetmealDishList(SetmealDish setmealDish);

    /**
     * 新增套餐菜品
     */
    int insertSetmealDish(SetmealDish setmealDish);

    /**
     * 修改套餐菜品
     */
    int updateSetmealDish(SetmealDish setmealDish);

    /**
     * 通过套餐ID删除套餐菜品
     */
    int deleteSetmealDishBySetmealId(Long setmealId);

    /**
     * 通过套餐ID批量删除套餐菜品
     */
    int deleteSetmealDishBySetmealIds(Long[] setmealIds);
}
