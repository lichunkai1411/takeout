package com.ruoyi.biz.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NonNull;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@ApiModel("套餐菜品关系-响应")
@Data
public class SetmealDishDTO {

    @NotNull(message = "套餐ID不可为空")
    @ApiModelProperty(value = "套餐ID", required = true)
    private Long setmealId;

    @NotNull(message = "菜品ID不可为空")
    @ApiModelProperty(value = "菜品ID", required = true)
    private Long dishId;

    @NotEmpty(message = "菜品份数不可为空")
    @ApiModelProperty(value = "菜品份数", required = true)
    private Integer copies;
}
