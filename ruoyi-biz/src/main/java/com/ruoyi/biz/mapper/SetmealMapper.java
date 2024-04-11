package com.ruoyi.biz.mapper;

import java.util.List;
import com.ruoyi.biz.domain.Setmeal;
import com.ruoyi.biz.domain.SetmealDish;
import com.ruoyi.biz.dto.SetmealInfo;
import com.ruoyi.biz.dto.SetmealListParam;
import com.ruoyi.biz.dto.SetmealListVo;
import org.apache.ibatis.annotations.Param;

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
    public List<SetmealListVo> selectSetmealList(@Param("param") SetmealListParam param, @Param("storeId") Long storeId);

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


    List<SetmealDish> selectSetmealByDishIds(Long[] ids);

    void deleteSetmealById(Long id);

    List<SetmealInfo> selectSetmealInfoByCategoryId(Long id);

    List<SetmealDish> selectSetmealDishInfoByDishId(Long id);

    void deleteSetmealDishBySetmealId(Long id);
}
