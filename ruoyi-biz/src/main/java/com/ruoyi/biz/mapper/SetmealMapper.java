package com.ruoyi.biz.mapper;

import com.ruoyi.biz.domain.Setmeal;
import com.ruoyi.biz.domain.SetmealDish;
import com.ruoyi.biz.dto.SetmealInfo;
import com.ruoyi.biz.dto.SetmealListParam;
import com.ruoyi.biz.dto.SetmealListVo;
import com.ruoyi.biz.dto.SetmealVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 套餐Mapper接口
 */
public interface SetmealMapper {

    /**
     * 通过套餐ID查询套餐
     */
    Setmeal selectSetmealBySetmealId(Long setmealId);

    /**
     * 查询套餐列表
     */
    List<SetmealListVo> selectSetmealList(@Param("param") SetmealListParam param, @Param("storeId") Long storeId);

    /**
     * 新增套餐
     */
    int insertSetmeal(Setmeal setmeal);

    /**
     * 修改套餐
     */
    int updateSetmeal(Setmeal setmeal);

    /**
     * 通过套餐ID删除套餐
     */
    void deleteSetmealById(Long id);

    /**
     * 通过分类ID查询套餐详情
     */
    List<SetmealInfo> selectSetmealInfoByCategoryId(Long id);

    /**
     * 通过分类ID查询套餐详情
     */
    List<SetmealDish> selectSetmealDishInfoByDishId(Long id);

    /**
     * 通过套餐ID删除套餐菜品
     */
    void deleteSetmealDishBySetmealId(Long id);

    /**
     * 通过套餐ID查询套餐及菜品信息
     */
    SetmealVo selectSetmealVOBySetmealId(Long setmealId);
}
