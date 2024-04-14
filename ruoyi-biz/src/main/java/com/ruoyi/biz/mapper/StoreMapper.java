package com.ruoyi.biz.mapper;

import com.ruoyi.biz.domain.Store;
import com.ruoyi.biz.dto.StoreListParam;
import com.ruoyi.biz.dto.StoreListVo;

import java.util.List;

/**
 * 店铺Mapper接口
 */
public interface StoreMapper {

    /**
     * 通过店铺ID获取单个店铺信息
     */
    Store selectStoreByStoreId(Long storeId);

    /**
     * 查询店铺列表
     */
    List<StoreListVo> selectStoreList(StoreListParam param);

    /**
     * 新增店铺
     */
    int insertStore(Store store);

    /**
     * 修改店铺
     */
    int updateStore(Store store);
}
