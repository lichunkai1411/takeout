package com.ruoyi.web.controller.biz;

import com.ruoyi.biz.mapper.StoreMapper;
import com.ruoyi.common.core.controller.BaseController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 店铺Controller
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


}
