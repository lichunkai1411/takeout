package com.ruoyi.biz.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
@ApiModel("菜品ID参数")
public class DishIdsParam {

    @NotNull(message = "菜品ID不可为空")
    @ApiModelProperty(value = "菜品ID")
    private Long[] ids;
}
