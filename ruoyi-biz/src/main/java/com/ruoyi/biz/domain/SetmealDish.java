package com.ruoyi.biz.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 套餐菜品对象 biz_setmeal_dish
 * 
 * @author ruoyi
 * @date 2024-04-01
 */
public class SetmealDish extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 套餐ID */
    private Long setmealId;

    /** 菜品ID */
    private Long dishId;

    /** 份数 */
    @Excel(name = "份数")
    private Long copies;

    public void setSetmealId(Long setmealId) 
    {
        this.setmealId = setmealId;
    }

    public Long getSetmealId() 
    {
        return setmealId;
    }
    public void setDishId(Long dishId) 
    {
        this.dishId = dishId;
    }

    public Long getDishId() 
    {
        return dishId;
    }
    public void setCopies(Long copies) 
    {
        this.copies = copies;
    }

    public Long getCopies() 
    {
        return copies;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("setmealId", getSetmealId())
            .append("dishId", getDishId())
            .append("copies", getCopies())
            .toString();
    }
}
