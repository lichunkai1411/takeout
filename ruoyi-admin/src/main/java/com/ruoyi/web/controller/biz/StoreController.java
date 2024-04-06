package com.ruoyi.web.controller.biz;

import com.ruoyi.biz.domain.Store;
import com.ruoyi.biz.dto.AddStoreParam;
import com.ruoyi.biz.dto.EditStoreParam;
import com.ruoyi.biz.dto.StoreListParam;
import com.ruoyi.biz.dto.StoreListVo;
import com.ruoyi.biz.mapper.StoreMapper;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.common.utils.SecurityUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.List;

@Api("店铺管理")
@RestController
@RequestMapping("/biz")
public class StoreController extends BaseController {

    private final StoreMapper storeMapper;

    public StoreController(StoreMapper storeMapper) {
        this.storeMapper = storeMapper;
    }

    @ApiOperation("获取店铺详情")
    @GetMapping("/stores/{id}")
    public AjaxResult getInfo(@PathVariable Long id) {
        return AjaxResult.success(storeMapper.selectStoreByStoreId(id));
    }

    @ApiOperation("获取店铺列表")
    @GetMapping("/stores")
    public TableDataInfo getList(StoreListParam param) {
        startPage();
        List<StoreListVo> list = storeMapper.selectStoreList(param);
        return getDataTable(list);
    }

    @ApiOperation("添加店铺")
    @PostMapping("/stores")
    public AjaxResult addStore(@Valid @RequestBody AddStoreParam param) {
        Store store = new Store();
        store.setStoreName(param.getStoreName());
        store.setBusinessStatus(param.getBusinessStatus());
        store.setPackAmount(param.getPackAmount());
        store.setDeliveryAmount(param.getDeliveryAmount());
        store.setCreateTime(DateUtils.getNowDate());
        store.setCreateBy(SecurityUtils.getUsername());
        storeMapper.insertStore(store);
        return AjaxResult.success();
    }

    @ApiOperation("修改店铺")
    @PutMapping("/stores/{id}")
    public AjaxResult editStore(@PathVariable Long id, @Valid @RequestBody EditStoreParam param) {
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
}
