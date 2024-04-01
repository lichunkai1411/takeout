package com.ruoyi.biz.mapper;

import java.util.List;
import com.ruoyi.biz.domain.BizStore;

/**
 * 店铺Mapper接口
 * 
 * @author ruoyi
 * @date 2024-04-01
 */
public interface BizStoreMapper 
{
    /**
     * 查询店铺
     * 
     * @param storeId 店铺主键
     * @return 店铺
     */
    public BizStore selectBizStoreByStoreId(Long storeId);

    /**
     * 查询店铺列表
     * 
     * @param bizStore 店铺
     * @return 店铺集合
     */
    public List<BizStore> selectBizStoreList(BizStore bizStore);

    /**
     * 新增店铺
     * 
     * @param bizStore 店铺
     * @return 结果
     */
    public int insertBizStore(BizStore bizStore);

    /**
     * 修改店铺
     * 
     * @param bizStore 店铺
     * @return 结果
     */
    public int updateBizStore(BizStore bizStore);

    /**
     * 删除店铺
     * 
     * @param storeId 店铺主键
     * @return 结果
     */
    public int deleteBizStoreByStoreId(Long storeId);

    /**
     * 批量删除店铺
     * 
     * @param storeIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteBizStoreByStoreIds(Long[] storeIds);
}
