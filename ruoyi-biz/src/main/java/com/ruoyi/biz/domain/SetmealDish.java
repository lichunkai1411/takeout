package com.ruoyi.biz.domain;

import com.ruoyi.common.core.domain.BaseEntity;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 套餐菜品对象 biz_setmeal_dish
 */
@Data
@Builder
@EqualsAndHashCode(callSuper = true)
public class SetmealDish extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /**
     * 套餐ID
     */
    private Long setmealId;

    /**
     * 菜品ID
     */
    private Long dishId;

    /**
     * 份数
     */
    private Long copies;
}
