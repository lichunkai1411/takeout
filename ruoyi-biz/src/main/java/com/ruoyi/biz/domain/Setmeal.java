package com.ruoyi.biz.domain;

import com.ruoyi.common.core.domain.BaseEntity;
import lombok.*;

import java.math.BigDecimal;

/**
 * 套餐对象 biz_setmeal
 */
@Data
@ToString
@Builder
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
public class Setmeal extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /**
     * 套餐ID
     */
    private Long setmealId;

    /**
     * 店铺ID
     */
    private Long storeId;

    /**
     * 套餐分类
     */
    private Long categoryId;

    /**
     * 套餐名称
     */
    private String setmealName;

    /**
     * 套餐价格
     */
    private BigDecimal setmealPrice;

    /**
     * 套餐图片
     */
    private String setmealImage;

    /**
     * 售卖状态
     */
    private String saleStatus;

    /**
     * 套餐描述
     */
    private String description;
}
