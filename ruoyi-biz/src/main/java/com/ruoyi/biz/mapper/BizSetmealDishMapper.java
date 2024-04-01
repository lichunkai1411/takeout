package com.ruoyi.biz.mapper;

import java.util.List;
import com.ruoyi.biz.domain.BizSetmealDish;

/**
 * 套餐菜品Mapper接口
 * 
 * @author ruoyi
 * @date 2024-04-01
 */
public interface BizSetmealDishMapper 
{
    /**
     * 查询套餐菜品
     * 
     * @param setmealId 套餐菜品主键
     * @return 套餐菜品
     */
    public BizSetmealDish selectBizSetmealDishBySetmealId(Long setmealId);

    /**
     * 查询套餐菜品列表
     * 
     * @param bizSetmealDish 套餐菜品
     * @return 套餐菜品集合
     */
    public List<BizSetmealDish> selectBizSetmealDishList(BizSetmealDish bizSetmealDish);

    /**
     * 新增套餐菜品
     * 
     * @param bizSetmealDish 套餐菜品
     * @return 结果
     */
    public int insertBizSetmealDish(BizSetmealDish bizSetmealDish);

    /**
     * 修改套餐菜品
     * 
     * @param bizSetmealDish 套餐菜品
     * @return 结果
     */
    public int updateBizSetmealDish(BizSetmealDish bizSetmealDish);

    /**
     * 删除套餐菜品
     * 
     * @param setmealId 套餐菜品主键
     * @return 结果
     */
    public int deleteBizSetmealDishBySetmealId(Long setmealId);

    /**
     * 批量删除套餐菜品
     * 
     * @param setmealIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteBizSetmealDishBySetmealIds(Long[] setmealIds);
}
