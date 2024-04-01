package com.ruoyi.biz.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 收货地址对象 biz_address
 * 
 * @author ruoyi
 * @date 2024-04-01
 */
public class Address extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 地址ID */
    private Long addressId;

    /** 用户ID */
    @Excel(name = "用户ID")
    private Long userId;

    /** 收货人 */
    @Excel(name = "收货人")
    private String consignee;

    /** 性别 */
    @Excel(name = "性别")
    private String sex;

    /** 手机号 */
    @Excel(name = "手机号")
    private String phone;

    /** 省份编码 */
    @Excel(name = "省份编码")
    private String provinceCode;

    /** 省份名称 */
    @Excel(name = "省份名称")
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
    private String detail;

    /** 标签 */
    @Excel(name = "标签")
    private String label;

    /** 是否默认地址 */
    @Excel(name = "是否默认地址")
    private Integer defaulted;

    public void setAddressId(Long addressId) 
    {
        this.addressId = addressId;
    }

    public Long getAddressId() 
    {
        return addressId;
    }
    public void setUserId(Long userId) 
    {
        this.userId = userId;
    }

    public Long getUserId() 
    {
        return userId;
    }
    public void setConsignee(String consignee) 
    {
        this.consignee = consignee;
    }

    public String getConsignee() 
    {
        return consignee;
    }
    public void setSex(String sex) 
    {
        this.sex = sex;
    }

    public String getSex() 
    {
        return sex;
    }
    public void setPhone(String phone) 
    {
        this.phone = phone;
    }

    public String getPhone() 
    {
        return phone;
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
    public void setDetail(String detail) 
    {
        this.detail = detail;
    }

    public String getDetail() 
    {
        return detail;
    }
    public void setLabel(String label) 
    {
        this.label = label;
    }

    public String getLabel() 
    {
        return label;
    }
    public void setDefaulted(Integer defaulted) 
    {
        this.defaulted = defaulted;
    }

    public Integer getDefaulted() 
    {
        return defaulted;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("addressId", getAddressId())
            .append("userId", getUserId())
            .append("consignee", getConsignee())
            .append("sex", getSex())
            .append("phone", getPhone())
            .append("provinceCode", getProvinceCode())
            .append("provinceName", getProvinceName())
            .append("cityCode", getCityCode())
            .append("cityName", getCityName())
            .append("districtCode", getDistrictCode())
            .append("districtName", getDistrictName())
            .append("detail", getDetail())
            .append("label", getLabel())
            .append("defaulted", getDefaulted())
            .toString();
    }
}
