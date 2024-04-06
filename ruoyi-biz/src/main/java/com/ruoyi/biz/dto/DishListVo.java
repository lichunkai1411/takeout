package com.ruoyi.biz.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel("菜品列表-响应")
@Data
public class DishListVo {

    @ApiModelProperty("菜品ID")
    private Long dishId;

    @ApiModelProperty("菜品名称")
    private String dishName;

    @ApiModelProperty("分类ID")
    private String categoryId;

    @ApiModelProperty("销卖状态")
    private String saleStatus;

    @ApiModelProperty("菜品价格")
    private String dishPrice;

    @ApiModelProperty("菜品图片")
    private String dishImage;

    @ApiModelProperty("菜品描述")
    private String description;

    @ApiModelProperty("更新时间")
    private String updateTime;
}
