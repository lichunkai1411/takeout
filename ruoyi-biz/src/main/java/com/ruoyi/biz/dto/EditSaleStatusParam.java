package com.ruoyi.biz.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotEmpty;

@ApiModel("修改售卖状态参数")
@Data
public class EditSaleStatusParam {

    @NotEmpty(message = "售卖状态不可为空")
    @ApiModelProperty(value = "售卖状态")
    private String saleStatus;
}
