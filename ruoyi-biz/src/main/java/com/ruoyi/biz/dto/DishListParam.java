package com.ruoyi.biz.dto;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel("菜品列表-请求")
@Data
public class DishListParam {

    @ApiModelProperty("菜品名称")
    private String dishName;

    @ApiModelProperty("菜品分类ID")
    private String categoryId;

    @ApiModelProperty("售卖状态")
    private String saleStatus;

    @ApiModelProperty("页数")
    private Integer pageNum;

    @ApiModelProperty("每页条数")
    private Integer pageSize;
}
