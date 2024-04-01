package com.ruoyi.biz.mapper;

import java.util.List;
import com.ruoyi.biz.domain.SetmealDish;

/**
 * 套餐菜品Mapper接口
 * 
 * @author ruoyi
 * @date 2024-04-01
 */
public interface SetmealDishMapper 
{
    /**
     * 查询套餐菜品
     * 
     * @param setmealId 套餐菜品主键
     * @return 套餐菜品
     */
    public SetmealDish selectSetmealDishBySetmealId(Long setmealId);

    /**
     * 查询套餐菜品列表
     * 
     * @param setmealDish 套餐菜品
     * @return 套餐菜品集合
     */
    public List<SetmealDish> selectSetmealDishList(SetmealDish setmealDish);

    /**
     * 新增套餐菜品
     * 
     * @param setmealDish 套餐菜品
     * @return 结果
     */
    public int insertSetmealDish(SetmealDish setmealDish);

    /**
     * 修改套餐菜品
     * 
     * @param setmealDish 套餐菜品
     * @return 结果
     */
    public int updateSetmealDish(SetmealDish setmealDish);

    /**
     * 删除套餐菜品
     * 
     * @param setmealId 套餐菜品主键
     * @return 结果
     */
    public int deleteSetmealDishBySetmealId(Long setmealId);

    /**
     * 批量删除套餐菜品
     * 
     * @param setmealIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteSetmealDishBySetmealIds(Long[] setmealIds);
}