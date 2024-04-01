package com.ruoyi.biz.domain;

import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 订单对象 biz_order
 * 
 * @author ruoyi
 * @date 2024-04-01
 */
public class Order extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 订单ID */
    private Long orderId;

    /** 商家ID */
    @Excel(name = "商家ID")
    private Long storeId;

    /** 用户ID */
    @Excel(name = "用户ID")
    private Long userId;

    /** 下单时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "下单时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date orderTime;

    /** 期望配送时间 */
    @Excel(name = "期望配送时间")
    private String desiredDeliveryTime;

    /** 预计送达时间 */
    @Excel(name = "预计送达时间")
    private String estimatedDeliveryTime;

    /** 打包费 */
    @Excel(name = "打包费")
    private BigDecimal packAmount;

    /** 配送费 */
    @Excel(name = "配送费")
    private BigDecimal deliveryAmount;

    /** 总费用 */
    @Excel(name = "总费用")
    private BigDecimal totalAmount;

    /** 餐具数量 */
    @Excel(name = "餐具数量")
    private Long tablewareNumber;

    /** 订单号 */
    @Excel(name = "订单号")
    private String orderNumber;

    /** 订单状态 */
    @Excel(name = "订单状态")
    private String orderStatus;

    /** 总件数 */
    @Excel(name = "总件数")
    private Long totalProduct;

    /** 付款时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "付款时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date payTime;

    /** 付款方式 */
    @Excel(name = "付款方式")
    private String payMethod;

    /** 拒单原因 */
    @Excel(name = "拒单原因")
    private String rejectReason;

    /** 接单时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "接单时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date acceptTime;

    /** 配送时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "配送时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date deliveryTime;

    /** 完成时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "完成时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date finishTime;

    /** 取消原因 */
    @Excel(name = "取消原因")
    private String cancelReason;

    /** 用户名 */
    @Excel(name = "用户名")
    private String userName;

    /** 收货人 */
    @Excel(name = "收货人")
    private String consignee;

    /** 手机号 */
    @Excel(name = "手机号")
    private String phone;

    /** 性别 */
    @Excel(name = "性别")
    private String sex;

    /** 省份编码 */
    @Excel(name = "省份编码")
    private String provinceCode;

    /** 省份编码 */
    @Excel(name = "省份编码")
    private String provinceName;

    /** 城市编码 */
    @Excel(name = "城市编码")
    private String cityCode;

    /** 城市名称 */
    @Excel(name = "城市名称")
    private String cityName;

    /** 区县编码 */
    @Excel(name = "区县编码")
    private String districtCode;

    /** 区县名称 */
    @Excel(name = "区县名称")
    private String districtName;

    /** 详细地址 */
    @Excel(name = "详细地址")
    private String detailAddress;

    /** 标签 */
    @Excel(name = "标签")
    private String label;

    public void setOrderId(Long orderId) 
    {
        this.orderId = orderId;
    }

    public Long getOrderId() 
    {
        return orderId;
    }
    public void setStoreId(Long storeId) 
    {
        this.storeId = storeId;
    }

    public Long getStoreId() 
    {
        return storeId;
    }
    public void setUserId(Long userId) 
    {
        this.userId = userId;
    }

    public Long getUserId() 
    {
        return userId;
    }
    public void setOrderTime(Date orderTime) 
    {
        this.orderTime = orderTime;
    }

    public Date getOrderTime() 
    {
        return orderTime;
    }
    public void setDesiredDeliveryTime(String desiredDeliveryTime) 
    {
        this.desiredDeliveryTime = desiredDeliveryTime;
    }

    public String getDesiredDeliveryTime() 
    {
        return desiredDeliveryTime;
    }
    public void setEstimatedDeliveryTime(String estimatedDeliveryTime) 
    {
        this.estimatedDeliveryTime = estimatedDeliveryTime;
    }

    public String getEstimatedDeliveryTime() 
    {
        return estimatedDeliveryTime;
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
    public void setTotalAmount(BigDecimal totalAmount) 
    {
        this.totalAmount = totalAmount;
    }

    public BigDecimal getTotalAmount() 
    {
        return totalAmount;
    }
    public void setTablewareNumber(Long tablewareNumber) 
    {
        this.tablewareNumber = tablewareNumber;
    }

    public Long getTablewareNumber() 
    {
        return tablewareNumber;
    }
    public void setOrderNumber(String orderNumber) 
    {
        this.orderNumber = orderNumber;
    }

    public String getOrderNumber() 
    {
        return orderNumber;
    }
    public void setOrderStatus(String orderStatus) 
    {
        this.orderStatus = orderStatus;
    }

    public String getOrderStatus() 
    {
        return orderStatus;
    }
    public void setTotalProduct(Long totalProduct) 
    {
        this.totalProduct = totalProduct;
    }

    public Long getTotalProduct() 
    {
        return totalProduct;
    }
    public void setPayTime(Date payTime) 
    {
        this.payTime = payTime;
    }

    public Date getPayTime() 
    {
        return payTime;
    }
    public void setPayMethod(String payMethod) 
    {
        this.payMethod = payMethod;
    }

    public String getPayMethod() 
    {
        return payMethod;
    }
    public void setRejectReason(String rejectReason) 
    {
        this.rejectReason = rejectReason;
    }

    public String getRejectReason() 
    {
        return rejectReason;
    }
    public void setAcceptTime(Date acceptTime) 
    {
        this.acceptTime = acceptTime;
    }

    public Date getAcceptTime() 
    {
        return acceptTime;
    }
    public void setDeliveryTime(Date deliveryTime) 
    {
        this.deliveryTime = deliveryTime;
    }

    public Date getDeliveryTime() 
    {
        return deliveryTime;
    }
    public void setFinishTime(Date finishTime) 
    {
        this.finishTime = finishTime;
    }

    public Date getFinishTime() 
    {
        return finishTime;
    }
    public void setCancelReason(String cancelReason) 
    {
        this.cancelReason = cancelReason;
    }

    public String getCancelReason() 
    {
        return cancelReason;
    }
    public void setUserName(String userName) 
    {
        this.userName = userName;
    }

    public String getUserName() 
    {
        return userName;
    }
    public void setConsignee(String consignee) 
    {
        this.consignee = consignee;
    }

    public String getConsignee() 
    {
        return consignee;
    }
    public void setPhone(String phone) 
    {
        this.phone = phone;
    }

    public String getPhone() 
    {
        return phone;
    }
    public void setSex(String sex) 
    {
        this.sex = sex;
    }

    public String getSex() 
    {
        return sex;
    }
    public void setProvinceCode(String provinceCode) 
    {
        this.provinceCode = provinceCode;
    }

    public String getProvinceCode() 
    {
        return provinceCode;
    }
    public void setProvinceName(String provinceName) 
    {
        this.provinceName = provinceName;
    }

    public String getProvinceName() 
    {
        return provinceName;
    }
    public void setCityCode(String cityCode) 
    {
        this.cityCode = cityCode;
    }

    public String getCityCode() 
    {
        return cityCode;
    }
    public void setCityName(String cityName) 
    {
        this.cityName = cityName;
    }

    public String getCityName() 
    {
        return cityName;
    }
    public void setDistrictCode(String districtCode) 
    {
        this.districtCode = districtCode;
    }

    public String getDistrictCode() 
    {
        return districtCode;
    }
    public void setDistrictName(String districtName) 
    {
        this.districtName = districtName;
    }

    public String getDistrictName() 
    {
        return districtName;
    }
    public void setDetailAddress(String detailAddress) 
    {
        this.detailAddress = detailAddress;
    }

    public String getDetailAddress() 
    {
        return detailAddress;
    }
    public void setLabel(String label) 
    {
        this.label = label;
    }

    public String getLabel() 
    {
        return label;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("orderId", getOrderId())
            .append("storeId", getStoreId())
            .append("userId", getUserId())
            .append("orderTime", getOrderTime())
            .append("desiredDeliveryTime", getDesiredDeliveryTime())
            .append("estimatedDeliveryTime", getEstimatedDeliveryTime())
            .append("packAmount", getPackAmount())
            .append("deliveryAmount", getDeliveryAmount())
            .append("totalAmount", getTotalAmount())
            .append("remark", getRemark())
            .append("tablewareNumber", getTablewareNumber())
            .append("orderNumber", getOrderNumber())
            .append("orderStatus", getOrderStatus())
            .append("totalProduct", getTotalProduct())
            .append("payTime", getPayTime())
            .append("payMethod", getPayMethod())
            .append("rejectReason", getRejectReason())
            .append("acceptTime", getAcceptTime())
            .append("deliveryTime", getDeliveryTime())
            .append("finishTime", getFinishTime())
            .append("cancelReason", getCancelReason())
            .append("userName", getUserName())
            .append("consignee", getConsignee())
            .append("phone", getPhone())
            .append("sex", getSex())
            .append("provinceCode", getProvinceCode())
            .append("provinceName", getProvinceName())
            .append("cityCode", getCityCode())
            .append("cityName", getCityName())
            .append("districtCode", getDistrictCode())
            .append("districtName", getDistrictName())
            .append("detailAddress", getDetailAddress())
            .append("label", getLabel())
            .toString();
    }
}
