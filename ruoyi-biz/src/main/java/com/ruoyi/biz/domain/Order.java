package com.ruoyi.biz.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.ruoyi.common.core.domain.BaseEntity;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 订单对象 biz_order
 */
@Data
@Builder
@EqualsAndHashCode(callSuper = true)
public class Order extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /**
     * 订单ID
     */
    private Long orderId;

    /**
     * 商家ID
     */
    private Long storeId;

    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 下单时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date orderTime;

    /**
     * 期望配送时间
     */
    private String desiredDeliveryTime;

    /**
     * 预计送达时间
     */
    private String estimatedDeliveryTime;

    /**
     * 打包费
     */
    private BigDecimal packAmount;

    /**
     * 配送费
     */
    private BigDecimal deliveryAmount;

    /**
     * 总费用
     */
    private BigDecimal totalAmount;

    /**
     * 餐具数量
     */
    private Long tablewareNumber;

    /**
     * 订单号
     */
    private String orderNumber;

    /**
     * 订单状态
     */
    private String orderStatus;

    /**
     * 总件数
     */
    private Long totalProduct;

    /**
     * 付款时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date payTime;

    /**
     * 付款方式
     */
    private String payMethod;

    /**
     * 拒单原因
     */
    private String rejectReason;

    /**
     * 接单时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date acceptTime;

    /**
     * 配送时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date deliveryTime;

    /**
     * 完成时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date finishTime;

    /**
     * 取消原因
     */
    private String cancelReason;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 收货人
     */
    private String consignee;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 性别
     */
    private String sex;

    /**
     * 省份编码
     */
    private String provinceCode;

    /**
     * 省份编码
     */
    private String provinceName;

    /**
     * 城市编码
     */
    private String cityCode;

    /**
     * 城市名称
     */
    private String cityName;

    /**
     * 区县编码
     */
    private String districtCode;

    /**
     * 区县名称
     */
    private String districtName;

    /**
     * 详细地址
     */
    private String detailAddress;

    /**
     * 标签
     */
    private String label;
}
