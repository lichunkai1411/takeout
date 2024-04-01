package com.ruoyi.biz.domain;

import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 菜品对象 biz_dish
 * 
 * @author ruoyi
 * @date 2024-04-01
 */
public class Dish extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 菜品ID */
    private Long dishId;

    /** 分类ID */
    @Excel(name = "分类ID")
    private Long categoryId;

    /** 菜品名称 */
    @Excel(name = "菜品名称")
    private String dishName;

    /** 菜品价格 */
    @Excel(name = "菜品价格")
    private BigDecimal dishPrice;

    /** 菜品图片 */
    @Excel(name = "菜品图片")
    private String dishImage;

    /** 菜品描述 */
    @Excel(name = "菜品描述")
    private String description;

    /** 售卖状态 */
    @Excel(name = "售卖状态")
    private String saleStatus;

    public void setDishId(Long dishId) 
    {
        this.dishId = dishId;
    }

    public Long getDishId() 
    {
        return dishId;
    }
    public void setCategoryId(Long categoryId) 
    {
        this.categoryId = categoryId;
    }

    public Long getCategoryId() 
    {
        return categoryId;
    }
    public void setDishName(String dishName) 
    {
        this.dishName = dishName;
    }

    public String getDishName() 
    {
        return dishName;
    }
    public void setDishPrice(BigDecimal dishPrice) 
    {
        this.dishPrice = dishPrice;
    }

    public BigDecimal getDishPrice() 
    {
        return dishPrice;
    }
    public void setDishImage(String dishImage) 
    {
        this.dishImage = dishImage;
    }

    public String getDishImage() 
    {
        return dishImage;
    }
    public void setDescription(String description) 
    {
        this.description = description;
    }

    public String getDescription() 
    {
        return description;
    }
    public void setSaleStatus(String saleStatus) 
    {
        this.saleStatus = saleStatus;
    }

    public String getSaleStatus() 
    {
        return saleStatus;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("dishId", getDishId())
            .append("categoryId", getCategoryId())
            .append("dishName", getDishName())
            .append("dishPrice", getDishPrice())
            .append("dishImage", getDishImage())
            .append("description", getDescription())
            .append("saleStatus", getSaleStatus())
            .append("createTime", getCreateTime())
            .append("createBy", getCreateBy())
            .append("updateTime", getUpdateTime())
            .append("updateBy", getUpdateBy())
            .toString();
    }
}
