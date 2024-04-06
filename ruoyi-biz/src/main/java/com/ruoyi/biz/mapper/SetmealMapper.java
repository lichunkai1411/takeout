package com.ruoyi.biz.mapper;

import java.util.List;
import com.ruoyi.biz.domain.Setmeal;
import com.ruoyi.biz.dto.SetmealListParam;
import com.ruoyi.biz.dto.SetmealListVo;

/**
 * 套餐Mapper接口
 * 
 * @author ruoyi
 * @date 2024-04-01
 */
public interface SetmealMapper 
{
    /**
     * 查询套餐
     * 
     * @param setmealId 套餐主键
     * @return 套餐
     */
    public Setmeal selectSetmealBySetmealId(Long setmealId);

    /**
     * 查询套餐列表
     *
     * @param param 套餐
     * @return 套餐集合
     */
    public List<SetmealListVo> selectSetmealList(SetmealListParam param);

    /**
     * 新增套餐
     * 
     * @param setmeal 套餐
     * @return 结果
     */
    public int insertSetmeal(Setmeal setmeal);

    /**
     * 修改套餐
     * 
     * @param setmeal 套餐
     * @return 结果
     */
    public int updateSetmeal(Setmeal setmeal);

    /**
     * 删除套餐
     * 
     * @param setmealId 套餐主键
     * @return 结果
     */
    public int deleteSetmealBySetmealId(Long setmealId);

    /**
     * 批量删除套餐
     * 
     * @param setmealIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteSetmealBySetmealIds(Long[] setmealIds);
}
