package com.ruoyi.biz.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@ApiModel("店铺列表-请求")
@Data
public class StoreListParam {

    @ApiModelProperty("店铺名称")
    private String storeName;

    @ApiModelProperty("营业状态")
    private String businessStatus;

    @ApiModelProperty("创建时间开始")
    private Date createTimeStart;

    @ApiModelProperty("创建时间结束")
    private Date createTimeEnd;

    @ApiModelProperty("页数")
    private Integer pageNum;

    @ApiModelProperty("每页条数")
    private Integer pageSize;
}
