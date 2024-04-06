package com.ruoyi.biz.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@ApiModel("添加店铺-请求")
@Data
public class AddStoreParam {

    @NotEmpty(message = "店铺名称不可为空")
    @ApiModelProperty(value = "店铺名称", required = true)
    private String storeName;

    @NotEmpty(message = "营业状态不可为空")
    @ApiModelProperty(value = "营业状态", required = true)
    private String businessStatus;

    @NotNull(message = "打包费不可为空")
    @ApiModelProperty(value = "打包费", required = true)
    private BigDecimal packAmount;

    @NotNull(message = "配送费不可为空")
    @ApiModelProperty(value = "配送费", required = true)
    private BigDecimal deliveryAmount;
}
