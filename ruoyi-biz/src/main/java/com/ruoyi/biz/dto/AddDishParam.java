package com.ruoyi.biz.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import javax.validation.constraints.NotEmpty;
import java.util.List;

@ApiModel("添加菜品-请求")
@Data
public class AddDishParam {

    @NotEmpty(message = "菜品图片不可为空")
    @ApiModelProperty(value = "菜品图片", required = true)
    private String dishImage;

    @ApiModelProperty(value = "菜品描述")
    private String description;

    @ApiModelProperty(value = "菜品口味")
    private List<DishFlavorDTO> dishFlavors;


}
