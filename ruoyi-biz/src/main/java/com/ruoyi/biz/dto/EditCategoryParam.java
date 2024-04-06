package com.ruoyi.biz.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@ApiModel("修改分类-请求")
@Data
public class EditCategoryParam {


    @NotEmpty(message = "分类名称不可为空")
    @ApiModelProperty(value = "分类名称",required = true)
    private String categoryName;

    @NotNull(message = "分类排序不可为空")
    @ApiModelProperty(value = "分类排序",required = true)
    private Long categorySort;

    @NotEmpty(message = "分类类型不可为空")
    @ApiModelProperty(value = "分类类型",required = true)
    private String categoryType;

}
