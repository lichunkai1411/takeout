package com.ruoyi.biz.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 购物车对象 biz_shopping_cart
 * 
 * @author ruoyi
 * @date 2024-04-01
 */
public class ShoppingCart extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 购物车ID */
    private Long shopId;

    /** 用户ID */
    @Excel(name = "用户ID")
    private Long userId;

    /** 商品ID */
    @Excel(name = "商品ID")
    private Long productId;

    /** 商品类型 */
    @Excel(name = "商品类型")
    private String productType;

    /** 商品数量 */
    @Excel(name = "商品数量")
    private Long productNumber;

    /** 菜品口味 */
    @Excel(name = "菜品口味")
    private String dishFlavor;

    public void setShopId(Long shopId) 
    {
        this.shopId = shopId;
    }

    public Long getShopId() 
    {
        return shopId;
    }
    public void setUserId(Long userId) 
    {
        this.userId = userId;
    }

    public Long getUserId() 
    {
        return userId;
    }
    public void setProductId(Long productId) 
    {
        this.productId = productId;
    }

    public Long getProductId() 
    {
        return productId;
    }
    public void setProductType(String productType) 
    {
        this.productType = productType;
    }

    public String getProductType() 
    {
        return productType;
    }
    public void setProductNumber(Long productNumber) 
    {
        this.productNumber = productNumber;
    }

    public Long getProductNumber() 
    {
        return productNumber;
    }
    public void setDishFlavor(String dishFlavor) 
    {
        this.dishFlavor = dishFlavor;
    }

    public String getDishFlavor() 
    {
        return dishFlavor;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("shopId", getShopId())
            .append("userId", getUserId())
            .append("productId", getProductId())
            .append("productType", getProductType())
            .append("productNumber", getProductNumber())
            .append("dishFlavor", getDishFlavor())
            .toString();
    }
}
