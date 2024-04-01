package com.ruoyi.biz.mapper;

import java.util.List;
import com.ruoyi.biz.domain.Store;

/**
 * 店铺Mapper接口
 * 
 * @author ruoyi
 * @date 2024-04-01
 */
public interface StoreMapper 
{
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
     * @param store 店铺
     * @return 店铺集合
     */
    public List<Store> selectStoreList(Store store);

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

    /**
     * 删除店铺
     * 
     * @param storeId 店铺主键
     * @return 结果
     */
    public int deleteStoreByStoreId(Long storeId);

    /**
     * 批量删除店铺
     * 
     * @param storeIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteStoreByStoreIds(Long[] storeIds);
}
