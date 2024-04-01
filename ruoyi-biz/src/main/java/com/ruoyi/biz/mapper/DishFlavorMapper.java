package com.ruoyi.biz.mapper;

import java.util.List;
import com.ruoyi.biz.domain.DishFlavor;

/**
 * 菜品口味Mapper接口
 * 
 * @author ruoyi
 * @date 2024-04-01
 */
public interface DishFlavorMapper 
{
    /**
     * 查询菜品口味
     * 
     * @param dishId 菜品口味主键
     * @return 菜品口味
     */
    public DishFlavor selectDishFlavorByDishId(Long dishId);

    /**
     * 查询菜品口味列表
     * 
     * @param dishFlavor 菜品口味
     * @return 菜品口味集合
     */
    public List<DishFlavor> selectDishFlavorList(DishFlavor dishFlavor);

    /**
     * 新增菜品口味
     * 
     * @param dishFlavor 菜品口味
     * @return 结果
     */
    public int insertDishFlavor(DishFlavor dishFlavor);

    /**
     * 修改菜品口味
     * 
     * @param dishFlavor 菜品口味
     * @return 结果
     */
    public int updateDishFlavor(DishFlavor dishFlavor);

    /**
     * 删除菜品口味
     * 
     * @param dishId 菜品口味主键
     * @return 结果
     */
    public int deleteDishFlavorByDishId(Long dishId);

    /**
     * 批量删除菜品口味
     * 
     * @param dishIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteDishFlavorByDishIds(Long[] dishIds);
}
