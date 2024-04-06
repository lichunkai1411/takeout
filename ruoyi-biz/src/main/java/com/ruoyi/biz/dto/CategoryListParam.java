package com.ruoyi.biz.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel("分类列表-请求")
@Data
public class CategoryListParam {
    @ApiModelProperty("分类名称")
    private String categoryName;

    @ApiModelProperty("分类类型")
    private String categoryType;

    @ApiModelProperty("页数")
    private Integer pageNum;

    @ApiModelProperty("每页条数")
    private Integer pageSize;
}
