package com.ruoyi.biz.mapper;

import java.util.List;
import com.ruoyi.biz.domain.Dish;
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

    void insertDishFlavor(List<DishFlavorDTO> flavors);

    void deleteDishByIds(Long[] ids, Long storeId);

    void deleteDishFlavorByIds(Long[] ids);

    void updateDishSaleStatus(Dish dish);
}
