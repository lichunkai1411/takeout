package com.ruoyi.biz.domain;

import com.ruoyi.common.core.domain.BaseEntity;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;

/**
 * 店铺对象 biz_store
 */
@Data
@Builder
@EqualsAndHashCode(callSuper = true)
public class Store extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /**
     * 店铺ID
     */
    private Long storeId;

    /**
     * 店铺名称
     */
    private String storeName;

    /**
     * 营业状态
     */
    private String businessStatus;

    /**
     * 打包费
     */
    private BigDecimal packAmount;

    /**
     * 配送费
     */
    private BigDecimal deliveryAmount;
}
