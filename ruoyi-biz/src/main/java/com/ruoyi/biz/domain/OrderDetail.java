package com.ruoyi.biz.domain;

import com.ruoyi.common.core.domain.BaseEntity;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;

/**
 * 订单明细对象 biz_order_detail
 */
@Data
@Builder
@EqualsAndHashCode(callSuper = true)
public class OrderDetail extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /**
     * 订单明细ID
     */
    private Long orderDetailId;

    /**
     * 订单ID
     */
    private Long orderId;

    /**
     * 商品ID
     */
    private Long productId;

    /**
     * 商品类型
     */
    private String productType;

    /**
     * 商品图片
     */
    private String productImage;

    /**
     * 商品名称
     */
    private String productName;

    /**
     * 商品价格
     */
    private BigDecimal productPrice;

    /**
     * 商品数量
     */
    private Long productNumber;
}
