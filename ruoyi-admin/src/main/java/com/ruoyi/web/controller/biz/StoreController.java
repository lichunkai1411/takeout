package com.ruoyi.web.controller.biz;

import com.ruoyi.biz.domain.Store;
import com.ruoyi.biz.dto.*;
import com.ruoyi.biz.mapper.StoreMapper;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.common.utils.SecurityUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

import static com.ruoyi.common.enums.OperatorType.MANAGE;

@Api("店铺管理")
@RestController
@RequestMapping("/biz")
public class StoreController extends BaseController {

    private final StoreMapper storeMapper;

    public StoreController(StoreMapper storeMapper) {
        this.storeMapper = storeMapper;
    }

    @PreAuthorize("@ss.hasPermi('biz:store:info')")
    @ApiOperation("获取店铺详情")
    @GetMapping("/stores/{id}")
    public AjaxResult getInfo(@PathVariable Long id) {
        return AjaxResult.success(storeMapper.selectStoreByStoreId(id));
    }

    @PreAuthorize("@ss.hasPermi('biz:store:list')")
    @ApiOperation("获取店铺列表")
    @GetMapping("/stores")
    public TableDataInfo getList(StoreListParam param) {
        startPage();
        List<StoreListVo> list = storeMapper.selectStoreList(param);
        return getDataTable(list);
    }

    @PreAuthorize("@ss.hasPermi('biz:store:add')")
    @Log(title = "店铺管理", businessType = BusinessType.INSERT, operatorType = MANAGE)
    @ApiOperation("添加店铺")
    @PostMapping("/stores")
    public AjaxResult addStore(@Valid @RequestBody AddStoreParam param) {
        Store store = Store.builder()
                .storeName(param.getStoreName())
                .businessStatus(param.getBusinessStatus())
                .packAmount(param.getPackAmount())
                .deliveryAmount(param.getDeliveryAmount())
                .build();
        store.setCreateTime(DateUtils.getNowDate());
        store.setCreateBy(SecurityUtils.getUsername());
        storeMapper.insertStore(store);
        return AjaxResult.success();
    }

    @PreAuthorize("@ss.hasPermi('biz:store:editName')")
    @Log(title = "店铺管理", businessType = BusinessType.UPDATE, operatorType = MANAGE)
    @ApiOperation("修改店铺名称")
    @PutMapping("/stores/{id}/editName")
    public AjaxResult editStoreName(@PathVariable Long id, @Valid @RequestBody EditStoreNameParam param) {
        Store store = storeMapper.selectStoreByStoreId(id);
        if (store == null) {
            return error("未找到店铺信息");
        }
        store.setStoreName(param.getStoreName());
        store.setUpdateTime(DateUtils.getNowDate());
        store.setUpdateBy(SecurityUtils.getUsername());
        storeMapper.updateStore(store);
        return AjaxResult.success();
    }

    @PreAuthorize("@ss.hasPermi('biz:store:editInfo')")
    @Log(title = "店铺管理", businessType = BusinessType.UPDATE, operatorType = MANAGE)
    @ApiOperation("修改店铺详细信息")
    @PutMapping("/stores/{id}/editInfo")
    public AjaxResult editStoreInfo(@PathVariable Long id, @Valid @RequestBody EditStoreInfoParam param) {
        Store store = storeMapper.selectStoreByStoreId(id);
        if (store == null) {
            return error("未找到店铺信息");
        }
        store.setBusinessStatus(param.getBusinessStatus());
        store.setPackAmount(param.getPackAmount());
        store.setDeliveryAmount(param.getDeliveryAmount());
        store.setUpdateTime(DateUtils.getNowDate());
        store.setUpdateBy(SecurityUtils.getUsername());
        storeMapper.updateStore(store);
        return AjaxResult.success();
    }
}
