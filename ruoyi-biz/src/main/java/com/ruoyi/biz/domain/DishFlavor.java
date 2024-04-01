package com.ruoyi.biz.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 菜品口味对象 biz_dish_flavor
 * 
 * @author ruoyi
 * @date 2024-04-01
 */
public class DishFlavor extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 菜品ID */
    private Long dishId;

    /** 口味类型 */
    private String flavorType;

    /** 可选口味 */
    @Excel(name = "可选口味")
    private String flavorOpt;

    public void setDishId(Long dishId) 
    {
        this.dishId = dishId;
    }

    public Long getDishId() 
    {
        return dishId;
    }
    public void setFlavorType(String flavorType) 
    {
        this.flavorType = flavorType;
    }

    public String getFlavorType() 
    {
        return flavorType;
    }
    public void setFlavorOpt(String flavorOpt) 
    {
        this.flavorOpt = flavorOpt;
    }

    public String getFlavorOpt() 
    {
        return flavorOpt;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("dishId", getDishId())
            .append("flavorType", getFlavorType())
            .append("flavorOpt", getFlavorOpt())
            .toString();
    }
}
