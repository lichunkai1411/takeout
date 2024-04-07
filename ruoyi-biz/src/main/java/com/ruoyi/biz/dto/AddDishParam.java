package com.ruoyi.biz.dto;

import com.ruoyi.biz.domain.DishFlavor;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@ApiModel("添加菜品-请求")
@Data
public class AddDishParam {

    @NotNull(message = "分类ID不可为空")
    @ApiModelProperty(value = "分类ID", required = true)
    private Long categoryId;

    @NotEmpty(message = "菜品名称不可为空")
    @ApiModelProperty(value = "菜品名称", required = true)
    private String dishName;

    @NotNull(message = "菜品价格不可为空")
    @ApiModelProperty(value = "菜品价格", required = true)
    private BigDecimal dishPrice;

    @NotEmpty(message = "菜品图片不可为空")
    @ApiModelProperty(value = "菜品图片", required = true)
    private String dishImage;

    @NotEmpty(message = "售卖状态不可为空")
    @ApiModelProperty(value = "售卖状态", required = true)
    private String saleStatus;

    @ApiModelProperty(value = "菜品描述")
    private String description;

    @ApiModelProperty(value = "菜品口味")
    private List<DishFlavorDTO> flavors = new ArrayList<>();


}
