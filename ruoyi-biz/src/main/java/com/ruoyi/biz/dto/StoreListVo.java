package com.ruoyi.biz.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@ApiModel("店铺列表-响应")
@Data
public class StoreListVo {

    @ApiModelProperty("店铺ID")
    private Long storeId;

    @ApiModelProperty("店铺名称")
    private String storeName;

    @ApiModelProperty("营业状态")
    private String businessStatus;

    @ApiModelProperty("打包费")
    private BigDecimal packAmount;

    @ApiModelProperty("配送费")
    private BigDecimal deliveryAmount;

    @ApiModelProperty("创建时间")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date createTime;

    @ApiModelProperty("创建人")
    private String createBy;
}
