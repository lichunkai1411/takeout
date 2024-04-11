package com.ruoyi.biz.domain;

import com.ruoyi.common.core.domain.BaseEntity;
import lombok.*;

/**
 * 菜品口味对象 biz_dish_flavor
 */
@Data
@ToString
@Builder
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
public class DishFlavor extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /**
     * 菜品ID
     */
    private Long dishId;

    /**
     * 口味类型
     */
    private String flavorType;

    /**
     * 可选口味
     */
    private String flavorOpt;
}
