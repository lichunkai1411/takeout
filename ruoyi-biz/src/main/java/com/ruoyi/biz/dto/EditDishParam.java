package com.ruoyi.biz.dto;

import io.swagger.annotations.ApiModel;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@ApiModel("修改菜品-请求")
@Data
public class EditDishParam {

    @NotNull(message = "分类ID不可为空")
    private Long categoryId;

    @NotEmpty(message = "菜品名称不可为空")
    private String dishName;

    @NotNull(message = "菜品价格不可为空")
    private BigDecimal dishPrice;

    @NotEmpty(message = "菜品图片不可为空")
    private String dishImage;

}
