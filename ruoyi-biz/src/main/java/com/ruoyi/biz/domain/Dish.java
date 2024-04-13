package com.ruoyi.biz.domain;

import com.ruoyi.common.core.domain.BaseEntity;
import lombok.*;

import java.math.BigDecimal;

/**
 * 菜品对象 biz_dish
 */
@Data
@Builder
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
public class Dish extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /**
     * 菜品ID
     */
    private Long dishId;

    /**
     * 分类ID
     */
    private Long categoryId;

    /**
     * 店铺ID
     */
    private Long storeId;

    /**
     * 菜品名称
     */
    private String dishName;

    /**
     * 菜品价格
     */
    private BigDecimal dishPrice;

    /**
     * 菜品图片
     */
    private String dishImage;

    /**
     * 菜品描述
     */
    private String description;

    /**
     * 售卖状态
     */
    private String saleStatus;
}
