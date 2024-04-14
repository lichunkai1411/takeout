package com.ruoyi.biz.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel("套餐列表-请求")
public class SetmealListParam {

    @ApiModelProperty("套餐名称")
    private String setmealName;

    @ApiModelProperty("售卖状态")
    private String saleStatus;

    @ApiModelProperty("套餐分类")
    private Long categoryName;

    @ApiModelProperty(value = "店铺ID", hidden = true)
    private Long storeId;

    @ApiModelProperty("页数")
    private Integer pageNum;

    @ApiModelProperty("每页条数")
    private Integer pageSize;
}
