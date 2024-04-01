package com.ruoyi.biz.domain;

import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 订单明细对象 biz_order_detail
 * 
 * @author ruoyi
 * @date 2024-04-01
 */
public class BizOrderDetail extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 订单明细ID */
    private Long orderDetailId;

    /** 订单ID */
    @Excel(name = "订单ID")
    private Long orderId;

    /** 商品ID */
    @Excel(name = "商品ID")
    private Long productId;

    /** 商品类型 */
    @Excel(name = "商品类型")
    private String productType;

    /** 商品图片 */
    @Excel(name = "商品图片")
    private String productImage;

    /** 商品名称 */
    @Excel(name = "商品名称")
    private String productName;

    /** 商品价格 */
    @Excel(name = "商品价格")
    private BigDecimal productPrice;

    /** 商品数量 */
    @Excel(name = "商品数量")
    private Long productNumber;

    public void setOrderDetailId(Long orderDetailId) 
    {
        this.orderDetailId = orderDetailId;
    }

    public Long getOrderDetailId() 
    {
        return orderDetailId;
    }
    public void setOrderId(Long orderId) 
    {
        this.orderId = orderId;
    }

    public Long getOrderId() 
    {
        return orderId;
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
    public void setProductImage(String productImage) 
    {
        this.productImage = productImage;
    }

    public String getProductImage() 
    {
        return productImage;
    }
    public void setProductName(String productName) 
    {
        this.productName = productName;
    }

    public String getProductName() 
    {
        return productName;
    }
    public void setProductPrice(BigDecimal productPrice) 
    {
        this.productPrice = productPrice;
    }

    public BigDecimal getProductPrice() 
    {
        return productPrice;
    }
    public void setProductNumber(Long productNumber) 
    {
        this.productNumber = productNumber;
    }

    public Long getProductNumber() 
    {
        return productNumber;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("orderDetailId", getOrderDetailId())
            .append("orderId", getOrderId())
            .append("productId", getProductId())
            .append("productType", getProductType())
            .append("productImage", getProductImage())
            .append("productName", getProductName())
            .append("productPrice", getProductPrice())
            .append("productNumber", getProductNumber())
            .toString();
    }
}
