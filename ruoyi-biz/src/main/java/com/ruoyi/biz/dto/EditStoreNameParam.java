package com.ruoyi.biz.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotEmpty;

@ApiModel("修改店铺名称-请求")
@Data
public class EditStoreNameParam {

    @NotEmpty(message = "店铺名称不可为空")
    @ApiModelProperty(value = "店铺名称", required = true)
    private String storeName;
}
