package com.ruoyi.biz.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
@ApiModel("套餐详情-响应")
public class SetmealVo {

    @ApiModelProperty("套餐ID")
    private Long setmealId;

    @ApiModelProperty("套餐名称")
    private String setmealName;

    @ApiModelProperty("套餐价格")
    private BigDecimal setmealPrice;

    @ApiModelProperty("套餐图片")
    private String setmealImage;

    @ApiModelProperty("套餐描述")
    private String description;

    @ApiModelProperty("套餐菜品信息")
    private List<SetmealDishVO> setmealDishes;
}
