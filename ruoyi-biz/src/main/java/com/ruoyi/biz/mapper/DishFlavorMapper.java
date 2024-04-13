package com.ruoyi.biz.mapper;

import java.util.List;
import com.ruoyi.biz.domain.DishFlavor;

/**
 * 菜品口味Mapper接口
 */
public interface DishFlavorMapper 
{
    /**
     * 通过菜品ID查询菜品口味
     */
    DishFlavor selectDishFlavorByDishId(Long dishId);

    /**
     * 查询菜品口味列表
     */
    List<DishFlavor> selectDishFlavorList(DishFlavor dishFlavor);

    /**
     * 新增菜品口味
     */
    int insertDishFlavor(DishFlavor dishFlavor);

    /**
     * 修改菜品口味
     */
    int updateDishFlavor(DishFlavor dishFlavor);

    /**
     * 通过菜品ID删除菜品口味
     */
    int deleteDishFlavorByDishId(Long dishId);

    /**
     * 通过菜品ID批量删除菜品口味
     */
    int deleteDishFlavorByDishIds(Long[] dishIds);
}
