package com.ruoyi.biz.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
@ApiModel("修改分类状态-请求")
public class EditCategoryStatusParam {

    @NotEmpty(message = "分类状态不可为空")
    @ApiModelProperty(value = "分类状态", required = true)
    private String categoryStatus;
}
