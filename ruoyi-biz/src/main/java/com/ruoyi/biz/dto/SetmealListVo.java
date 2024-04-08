package com.ruoyi.biz.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@ApiModel("套餐列表-响应")
@Data
public class SetmealListVo {

    @ApiModelProperty("套餐ID")
    private Long setmealId;

    @ApiModelProperty("套餐名称")
    private String setmealName;

    @ApiModelProperty("套餐价格")
    private BigDecimal setmealPrice;

    @ApiModelProperty("套餐图片")
    private String setmealImage;

    @ApiModelProperty("售卖状态")
    private String saleStatus;

    @ApiModelProperty("分类ID")
    private Long categoryId;

    @ApiModelProperty("创建时间")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date createTime;

    @ApiModelProperty("创建人")
    private String createBy;


}
