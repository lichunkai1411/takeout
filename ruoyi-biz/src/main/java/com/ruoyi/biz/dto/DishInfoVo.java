package com.ruoyi.biz.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

@ApiModel("菜品信息-响应")
@Data
public class DishInfoVo {

    @ApiModelProperty("菜品ID")
    private Long dishId;

    @ApiModelProperty("菜品名称")
    private String dishName;

    @ApiModelProperty("菜品价格")
    private BigDecimal dishPrice;

    @ApiModelProperty("菜品图片")
    private String dishImage;
}
