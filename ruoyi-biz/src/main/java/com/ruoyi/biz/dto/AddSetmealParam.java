package com.ruoyi.biz.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@ApiModel("添加套餐-请求")
@Data
public class AddSetmealParam {

    @NotEmpty(message = "套餐名称不可为空")
    @ApiModelProperty(value = "套餐名称", required = true)
    private String setmealName;

    @NotNull(message = "套餐价格不可为空")
    @ApiModelProperty(value = "套餐价格", required = true)
    private BigDecimal setmealPrice;

    @NotEmpty(message = "套餐图片不可为空")
    @ApiModelProperty(value = "套餐图片", required = true)
    private String setmealImage;

    @NotEmpty(message = "售卖状态不可为空")
    @ApiModelProperty(value = "售卖状态", required = true)
    private String saleStatus;

    @NotNull(message = "套餐分类ID不可为空")
    @ApiModelProperty(value = "套餐分类ID", required = true)
    private Long categoryId;

}
