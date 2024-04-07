package com.ruoyi.biz.mapper;

import java.util.List;
import com.ruoyi.biz.domain.Dish;
import com.ruoyi.biz.domain.DishFlavor;
import com.ruoyi.biz.dto.DishFlavorDTO;
import com.ruoyi.biz.dto.DishListParam;
import com.ruoyi.biz.dto.DishListVo;

/**
 * 菜品Mapper接口
 * 
 * @author ruoyi
 * @date 2024-04-01
 */
public interface DishMapper 
{
    /**
     * 查询菜品
     * 
     * @param dishId 菜品主键
     * @return 菜品
     */
    public Dish selectDishByDishId(Long dishId);

    /**
     * 查询菜品列表
     *
     * @param param 菜品
     * @return 菜品集合
     */
    public List<DishListVo> selectDishList(DishListParam param);

    /**
     * 新增菜品
     * 
     * @param dish 菜品
     * @return 结果
     */
    public int insertDish(Dish dish);

    /**
     * 修改菜品
     * 
     * @param dish 菜品
     * @return 结果
     */
    public int updateDish(Dish dish);

    /**
     * 删除菜品
     * 
     * @param dishId 菜品主键
     * @return 结果
     */
    public int deleteDishByDishId(Long dishId);

    /**
     * 批量删除菜品
     * 
     * @param dishIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteDishByDishIds(Long[] dishIds);

    int selectDishByCategoryId(Long categoryId);

    void insertDishFlavor(DishFlavor dishFlavor);

    void deleteDishFlavorByDishIds(Long[] ids);

    void insertDishFlavorBatch(List<DishFlavorDTO> flavors);
}
