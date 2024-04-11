package com.ruoyi.biz.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.List;

@ApiModel("编辑套餐-请求")
@Data
public class EditSetmealParam {

    @NotEmpty(message = "套餐名称不可为空")
    @ApiModelProperty(value = "套餐名称", required = true)
    private String setmealName;

    @NotNull(message = "套餐分类ID不可为空")
    @ApiModelProperty(value = "套餐分类ID", required = true)
    private Long categoryId;

    @NotNull(message = "套餐价格不可为空")
    @ApiModelProperty(value = "套餐价格", required = true)
    private BigDecimal setmealPrice;

    @NotEmpty(message = "套餐菜品关系不可为空")
    @ApiModelProperty(value = "套餐菜品关系")
    private List<SetmealDishDTO> setmealDishes;

    @NotEmpty(message = "套餐图片不可为空")
    @ApiModelProperty(value = "套餐图片", required = true)
    private String setmealImage;

    @ApiModelProperty(value = "套餐描述")
    private String description;
}
