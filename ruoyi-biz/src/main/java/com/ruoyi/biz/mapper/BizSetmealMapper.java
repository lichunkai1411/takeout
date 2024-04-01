package com.ruoyi.biz.mapper;

import java.util.List;
import com.ruoyi.biz.domain.BizSetmeal;

/**
 * 套餐Mapper接口
 * 
 * @author ruoyi
 * @date 2024-04-01
 */
public interface BizSetmealMapper 
{
    /**
     * 查询套餐
     * 
     * @param setmealId 套餐主键
     * @return 套餐
     */
    public BizSetmeal selectBizSetmealBySetmealId(Long setmealId);

    /**
     * 查询套餐列表
     * 
     * @param bizSetmeal 套餐
     * @return 套餐集合
     */
    public List<BizSetmeal> selectBizSetmealList(BizSetmeal bizSetmeal);

    /**
     * 新增套餐
     * 
     * @param bizSetmeal 套餐
     * @return 结果
     */
    public int insertBizSetmeal(BizSetmeal bizSetmeal);

    /**
     * 修改套餐
     * 
     * @param bizSetmeal 套餐
     * @return 结果
     */
    public int updateBizSetmeal(BizSetmeal bizSetmeal);

    /**
     * 删除套餐
     * 
     * @param setmealId 套餐主键
     * @return 结果
     */
    public int deleteBizSetmealBySetmealId(Long setmealId);

    /**
     * 批量删除套餐
     * 
     * @param setmealIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteBizSetmealBySetmealIds(Long[] setmealIds);
}
