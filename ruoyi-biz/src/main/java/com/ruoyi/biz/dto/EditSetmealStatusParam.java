package com.ruoyi.biz.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
@ApiModel("修改套餐状态-请求")
public class EditSetmealStatusParam {

    @NotEmpty(message = "套餐状态不可为空")
    @ApiModelProperty(value = "套餐状态", required = true)
    private String saleStatus;
}
