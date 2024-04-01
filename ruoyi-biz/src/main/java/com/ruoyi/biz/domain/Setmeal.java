package com.ruoyi.biz.domain;

import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 套餐对象 biz_setmeal
 * 
 * @author ruoyi
 * @date 2024-04-01
 */
public class Setmeal extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 套餐ID */
    private Long setmealId;

    /** 套餐分类 */
    @Excel(name = "套餐分类")
    private Long categoryId;

    /** 套餐名称 */
    @Excel(name = "套餐名称")
    private String setmealName;

    /** 套餐价格 */
    @Excel(name = "套餐价格")
    private BigDecimal setmealPrice;

    /** 套餐图片 */
    @Excel(name = "套餐图片")
    private String setmealImage;

    /** 售卖状态 */
    @Excel(name = "售卖状态")
    private String saleStatus;

    /** 套餐描述 */
    @Excel(name = "套餐描述")
    private String description;

    public void setSetmealId(Long setmealId) 
    {
        this.setmealId = setmealId;
    }

    public Long getSetmealId() 
    {
        return setmealId;
    }
    public void setCategoryId(Long categoryId) 
    {
        this.categoryId = categoryId;
    }

    public Long getCategoryId() 
    {
        return categoryId;
    }
    public void setSetmealName(String setmealName) 
    {
        this.setmealName = setmealName;
    }

    public String getSetmealName() 
    {
        return setmealName;
    }
    public void setSetmealPrice(BigDecimal setmealPrice) 
    {
        this.setmealPrice = setmealPrice;
    }

    public BigDecimal getSetmealPrice() 
    {
        return setmealPrice;
    }
    public void setSetmealImage(String setmealImage) 
    {
        this.setmealImage = setmealImage;
    }

    public String getSetmealImage() 
    {
        return setmealImage;
    }
    public void setSaleStatus(String saleStatus) 
    {
        this.saleStatus = saleStatus;
    }

    public String getSaleStatus() 
    {
        return saleStatus;
    }
    public void setDescription(String description) 
    {
        this.description = description;
    }

    public String getDescription() 
    {
        return description;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("setmealId", getSetmealId())
            .append("categoryId", getCategoryId())
            .append("setmealName", getSetmealName())
            .append("setmealPrice", getSetmealPrice())
            .append("setmealImage", getSetmealImage())
            .append("saleStatus", getSaleStatus())
            .append("description", getDescription())
            .append("createTime", getCreateTime())
            .append("createBy", getCreateBy())
            .append("updateTime", getUpdateTime())
            .append("updateBy", getUpdateBy())
            .toString();
    }
}
