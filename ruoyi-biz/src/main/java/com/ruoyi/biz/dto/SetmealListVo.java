package com.ruoyi.biz.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

@ApiModel("套餐列表-响应")
@Data
public class SetmealListVo {

    @ApiModelProperty("套餐ID")
    private Long setmealId;

    @ApiModelProperty("套餐名称")
    private String setmealName;

    @ApiModelProperty("套餐价格")
    private BigDecimal setmealPrice;

    @ApiModelProperty("套餐图片")
    private String setmealImage;

    @ApiModelProperty("售卖状态")
    private String saleStatus;

    @ApiModelProperty("分类ID")
    private Long categoryId;

    @ApiModelProperty("创建时间")
    private String createTime;

    @ApiModelProperty("更新时间")
    private String updateTime;


}
