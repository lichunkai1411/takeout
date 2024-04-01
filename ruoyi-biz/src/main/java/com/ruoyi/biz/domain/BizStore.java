package com.ruoyi.biz.domain;

import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 店铺对象 biz_store
 * 
 * @author ruoyi
 * @date 2024-04-01
 */
public class BizStore extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 店铺ID */
    private Long storeId;

    /** 店铺名称 */
    @Excel(name = "店铺名称")
    private String storeName;

    /** 营业状态 */
    @Excel(name = "营业状态")
    private String businessStatus;

    /** 打包费 */
    @Excel(name = "打包费")
    private BigDecimal packAmount;

    /** 配送费 */
    @Excel(name = "配送费")
    private BigDecimal deliveryAmount;

    public void setStoreId(Long storeId) 
    {
        this.storeId = storeId;
    }

    public Long getStoreId() 
    {
        return storeId;
    }
    public void setStoreName(String storeName) 
    {
        this.storeName = storeName;
    }

    public String getStoreName() 
    {
        return storeName;
    }
    public void setBusinessStatus(String businessStatus) 
    {
        this.businessStatus = businessStatus;
    }

    public String getBusinessStatus() 
    {
        return businessStatus;
    }
    public void setPackAmount(BigDecimal packAmount) 
    {
        this.packAmount = packAmount;
    }

    public BigDecimal getPackAmount() 
    {
        return packAmount;
    }
    public void setDeliveryAmount(BigDecimal deliveryAmount) 
    {
        this.deliveryAmount = deliveryAmount;
    }

    public BigDecimal getDeliveryAmount() 
    {
        return deliveryAmount;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("storeId", getStoreId())
            .append("storeName", getStoreName())
            .append("businessStatus", getBusinessStatus())
            .append("packAmount", getPackAmount())
            .append("deliveryAmount", getDeliveryAmount())
            .append("createTime", getCreateTime())
            .append("createBy", getCreateBy())
            .append("updateTime", getUpdateTime())
            .append("updateBy", getUpdateBy())
            .toString();
    }
}
