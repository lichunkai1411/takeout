package com.ruoyi.biz.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 分类对象 biz_category
 * 
 * @author ruoyi
 * @date 2024-04-01
 */
public class Category extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 分类ID */
    private Long categoryId;

    /** 店铺ID */
    private Long storeId;

    /** 分类名称 */
    @Excel(name = "分类名称")
    private String categoryName;

    /** 分类类型 */
    @Excel(name = "分类类型")
    private String categoryType;

    /** 分类状态 */
    @Excel(name = "分类状态")
    private String categoryStatus;

    /** 排序 */
    @Excel(name = "排序")
    private Long categorySort;

    public void setCategoryId(Long categoryId) 
    {
        this.categoryId = categoryId;
    }

    public Long getCategoryId() 
    {
        return categoryId;
    }

    public Long getStoreId() {
        return storeId;
    }

    public void setStoreId(Long storeId) {
        this.storeId = storeId;
    }

    public void setCategoryName(String categoryName)
    {
        this.categoryName = categoryName;
    }

    public String getCategoryName() 
    {
        return categoryName;
    }
    public void setCategoryType(String categoryType) 
    {
        this.categoryType = categoryType;
    }

    public String getCategoryType() 
    {
        return categoryType;
    }
    public void setCategoryStatus(String categoryStatus) 
    {
        this.categoryStatus = categoryStatus;
    }

    public String getCategoryStatus() 
    {
        return categoryStatus;
    }
    public void setCategorySort(Long categorySort) 
    {
        this.categorySort = categorySort;
    }

    public Long getCategorySort() 
    {
        return categorySort;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("categoryId", getCategoryId())
            .append("storeId", getStoreId())
            .append("categoryName", getCategoryName())
            .append("categoryType", getCategoryType())
            .append("categoryStatus", getCategoryStatus())
            .append("categorySort", getCategorySort())
            .append("createTime", getCreateTime())
            .append("createBy", getCreateBy())
            .append("updateTime", getUpdateTime())
            .append("updateBy", getUpdateBy())
            .toString();
    }
}
