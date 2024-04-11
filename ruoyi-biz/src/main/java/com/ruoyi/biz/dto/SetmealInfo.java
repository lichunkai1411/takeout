package com.ruoyi.biz.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

@ApiModel("套餐信息-响应")
@Data
public class SetmealInfo {

    @ApiModelProperty("套餐ID")
    private Long setmealId;

    @ApiModelProperty("套餐名称")
    private String setmealName;

    @ApiModelProperty("套餐价格")
    private BigDecimal setmealPrice;

    @ApiModelProperty("套餐图片")
    private String setmealImage;
}
