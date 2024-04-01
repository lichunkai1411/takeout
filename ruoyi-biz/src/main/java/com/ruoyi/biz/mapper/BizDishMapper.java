package com.ruoyi.biz.mapper;

import java.util.List;
import com.ruoyi.biz.domain.BizDish;

/**
 * 菜品Mapper接口
 * 
 * @author ruoyi
 * @date 2024-04-01
 */
public interface BizDishMapper 
{
    /**
     * 查询菜品
     * 
     * @param dishId 菜品主键
     * @return 菜品
     */
    public BizDish selectBizDishByDishId(Long dishId);

    /**
     * 查询菜品列表
     * 
     * @param bizDish 菜品
     * @return 菜品集合
     */
    public List<BizDish> selectBizDishList(BizDish bizDish);

    /**
     * 新增菜品
     * 
     * @param bizDish 菜品
     * @return 结果
     */
    public int insertBizDish(BizDish bizDish);

    /**
     * 修改菜品
     * 
     * @param bizDish 菜品
     * @return 结果
     */
    public int updateBizDish(BizDish bizDish);

    /**
     * 删除菜品
     * 
     * @param dishId 菜品主键
     * @return 结果
     */
    public int deleteBizDishByDishId(Long dishId);

    /**
     * 批量删除菜品
     * 
     * @param dishIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteBizDishByDishIds(Long[] dishIds);
}
