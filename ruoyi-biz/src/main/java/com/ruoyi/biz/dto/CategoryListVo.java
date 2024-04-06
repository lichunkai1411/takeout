package com.ruoyi.biz.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@ApiModel("分类列表-响应")
@Data
public class CategoryListVo {
    @ApiModelProperty("分类ID")
    private Long CategoryId;

    @ApiModelProperty("分类类型")
    private String CategoryType;

    @ApiModelProperty("分类名称")
    private String CategoryName;

    @ApiModelProperty("分类状态")
    private String CategoryStatus;

    @ApiModelProperty("分类排序")
    private Integer CategorySort;

    @ApiModelProperty("创建时间")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date createTime;

    @ApiModelProperty("创建人")
    private String createBy;
}
