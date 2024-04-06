package com.ruoyi.biz.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Date;

@ApiModel("添加分类-请求")
@Data
public class AddCategoryParam {

    @NotEmpty(message = "分类名称不可为空")
    @ApiModelProperty(value = "分类名称",required = true)
    private String categoryName;

    @NotNull(message = "分类排序不可为空")
    @ApiModelProperty(value = "分类排序",required = true)
    private Long categorySort;

    @NotEmpty(message = "分类类型不可为空")
    @ApiModelProperty(value = "分类类型",required = true)
    private String categoryType;

    @NotEmpty(message = "分类状态不可为空")
    @ApiModelProperty(value = "分类状态",required = true)
    private String categoryStatus;
}
