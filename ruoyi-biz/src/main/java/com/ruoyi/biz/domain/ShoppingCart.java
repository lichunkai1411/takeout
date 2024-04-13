package com.ruoyi.biz.domain;

import com.ruoyi.common.core.domain.BaseEntity;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 购物车对象 biz_shopping_cart
 */
@Data
@Builder
@EqualsAndHashCode(callSuper = true)
public class ShoppingCart extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /**
     * 购物车ID
     */
    private Long shopId;

    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 商品ID
     */
    private Long productId;

    /**
     * 商品类型
     */
    private String productType;

    /**
     * 商品数量
     */
    private Long productNumber;

    /**
     * 菜品口味
     */
    private String dishFlavor;
}
