package com.ruoyi.biz.mapper;

import java.util.List;
import com.ruoyi.biz.domain.Dish;
import com.ruoyi.biz.dto.DishFlavorDTO;
import com.ruoyi.biz.dto.DishInfoVo;
import com.ruoyi.biz.dto.DishListParam;
import com.ruoyi.biz.dto.DishListVo;
import org.apache.ibatis.annotations.Param;

/**
 * 菜品Mapper接口
 */
public interface DishMapper 
{
    /**
     * 通过菜品ID查询菜品
     */
    Dish selectDishByDishId(Long dishId);

    /**
     * 查询菜品列表
     */
    List<DishListVo> selectDishList(@Param("param") DishListParam param, @Param("storeId") Long storeId);

    /**
     * 新增菜品
     */
    int insertDish(Dish dish);

    /**
     * 修改菜品
     */
    int updateDish(Dish dish);

    /**
     * 新增菜品口味
     */
    void insertDishFlavor(List<DishFlavorDTO> flavors);

    /**
     * 通过菜品ID删除菜品
     */
    void deleteDishByIds(Long[] ids);

    /**
     * 通过分类ID查询菜品详情
     */
    List<DishInfoVo> selectDishInfoByCategoryId(Long id);

    /**
     * 通过菜品ID删除菜品
     */
    void deleteDishByDishId(Long id);
}
