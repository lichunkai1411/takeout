package com.ruoyi.biz.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import javax.validation.constraints.NotEmpty;

@ApiModel("获取所有分类-请求")
@Data
public class CategoryAllParam {

    @ApiModelProperty("分类名称")
    private String categoryName;

    @NotEmpty(message = "分类类型不可为空")
    @ApiModelProperty("分类类型")
    private String categoryType;
}
