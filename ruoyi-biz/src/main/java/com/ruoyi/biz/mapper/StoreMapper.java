package com.ruoyi.biz.mapper;

import com.ruoyi.biz.domain.Store;
import com.ruoyi.biz.dto.StoreListParam;
import com.ruoyi.biz.dto.StoreListVo;

import java.util.List;

/**
 * 店铺Mapper接口
 *
 * @author ruoyi
 * @date 2024-04-01
 */
public interface StoreMapper {
    /**
     * 查询店铺
     *
     * @param storeId 店铺主键
     * @return 店铺
     */
    public Store selectStoreByStoreId(Long storeId);

    /**
     * 查询店铺列表
     *
     * @param param 店铺列表-请求
     * @return 店铺集合
     */
    public List<StoreListVo> selectStoreList(StoreListParam param);

    /**
     * 新增店铺
     *
     * @param store 店铺
     * @return 结果
     */
    public int insertStore(Store store);

    /**
     * 修改店铺
     *
     * @param store 店铺
     * @return 结果
     */
    public int updateStore(Store store);

}
