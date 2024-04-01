package com.ruoyi.biz.mapper;

import java.util.List;
import com.ruoyi.biz.domain.BizDishFlavor;

/**
 * 菜品口味Mapper接口
 * 
 * @author ruoyi
 * @date 2024-04-01
 */
public interface BizDishFlavorMapper 
{
    /**
     * 查询菜品口味
     * 
     * @param dishId 菜品口味主键
     * @return 菜品口味
     */
    public BizDishFlavor selectBizDishFlavorByDishId(Long dishId);

    /**
     * 查询菜品口味列表
     * 
     * @param bizDishFlavor 菜品口味
     * @return 菜品口味集合
     */
    public List<BizDishFlavor> selectBizDishFlavorList(BizDishFlavor bizDishFlavor);

    /**
     * 新增菜品口味
     * 
     * @param bizDishFlavor 菜品口味
     * @return 结果
     */
    public int insertBizDishFlavor(BizDishFlavor bizDishFlavor);

    /**
     * 修改菜品口味
     * 
     * @param bizDishFlavor 菜品口味
     * @return 结果
     */
    public int updateBizDishFlavor(BizDishFlavor bizDishFlavor);

    /**
     * 删除菜品口味
     * 
     * @param dishId 菜品口味主键
     * @return 结果
     */
    public int deleteBizDishFlavorByDishId(Long dishId);

    /**
     * 批量删除菜品口味
     * 
     * @param dishIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteBizDishFlavorByDishIds(Long[] dishIds);
}
