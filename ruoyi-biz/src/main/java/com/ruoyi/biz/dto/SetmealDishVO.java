package com.ruoyi.biz.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

@Data
@ApiModel("套餐菜品信息-响应")
public class SetmealDishVO {

    @ApiModelProperty("菜品ID")
    private Long dishId;

    @ApiModelProperty("菜品名称")
    private String dishName;

    @ApiModelProperty("菜品价格")
    private BigDecimal dishPrice;

    @ApiModelProperty("份数")
    private Integer copies;
}
