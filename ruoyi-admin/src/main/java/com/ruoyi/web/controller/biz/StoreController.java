package com.ruoyi.web.controller.biz;

import com.ruoyi.biz.domain.Store;
import com.ruoyi.biz.mapper.StoreMapper;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 店铺管理
 *
 * @author lck
 * @date 2024-04-01
 */
@RestController
@RequestMapping("/biz/store")
public class StoreController extends BaseController {

    private final StoreMapper storeMapper;

    public StoreController(StoreMapper storeMapper) {
        this.storeMapper = storeMapper;
    }

    // 查询店铺详情
    @RequestMapping("/get")
    public AjaxResult get(Long storeId) {
        return AjaxResult.success(storeMapper.selectStoreByStoreId(storeId));
    }

    // 查询店铺列表
    @RequestMapping("/list")
    public AjaxResult list(@RequestBody Store store) {
        return AjaxResult.success(storeMapper.selectStoreList(store));
    }
    // 添加店铺
    @RequestMapping("/add")
    public AjaxResult add(@RequestBody Store store) {
        store.setCreateTime(DateUtils.getNowDate());
        storeMapper.insertStore(store);
        return AjaxResult.success();
    }

    // 修改店铺
    @RequestMapping("/edit")
    public AjaxResult edit(@RequestBody Store store) {
        store.setUpdateTime(DateUtils.getNowDate());
        storeMapper.updateStore(store);
        return AjaxResult.success();
    }
}
