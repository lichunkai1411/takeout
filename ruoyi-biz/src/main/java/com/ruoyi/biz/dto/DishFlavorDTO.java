package com.ruoyi.biz.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;


@ApiModel("菜品口味-响应")
@Data
public class DishFlavorDTO {

    @NotEmpty(message = "口味类型不可为空")
    @ApiModelProperty(value = "口味类型")
    private String flavorType;

    @NotEmpty(message = "可选口味不可为空")
    @ApiModelProperty(value = "可选口味")
    private String flavorOpt;

    @NotNull(message = "菜品ID不可为空")
    @ApiModelProperty(value = "菜品ID")
    private Long dishId;
}
