package com.ruoyi.biz.domain;

import com.ruoyi.common.core.domain.BaseEntity;
import lombok.*;

/**
 * 分类对象 biz_category
 */
@Data
@Builder
@EqualsAndHashCode(callSuper = true)
public class Category extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /**
     * 分类ID
     */
    private Long categoryId;

    /**
     * 店铺ID
     */
    private Long storeId;

    /**
     * 分类名称
     */
    private String categoryName;

    /**
     * 分类类型
     */
    private String categoryType;

    /**
     * 分类状态
     */
    private String categoryStatus;

    /**
     * 排序
     */
    private Long categorySort;
}
