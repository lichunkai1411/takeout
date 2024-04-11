package com.ruoyi.biz.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
@ApiModel("套餐ID参数")
public class SetMealIdsParam {

    @NotNull(message = "套餐ID不可为空")
    @ApiModelProperty(value = "套餐ID")
    private Long[] ids;
}
