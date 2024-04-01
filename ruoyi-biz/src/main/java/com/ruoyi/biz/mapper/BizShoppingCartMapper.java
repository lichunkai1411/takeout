package com.ruoyi.biz.mapper;

import java.util.List;
import com.ruoyi.biz.domain.BizShoppingCart;

/**
 * 购物车Mapper接口
 * 
 * @author ruoyi
 * @date 2024-04-01
 */
public interface BizShoppingCartMapper 
{
    /**
     * 查询购物车
     * 
     * @param shopId 购物车主键
     * @return 购物车
     */
    public BizShoppingCart selectBizShoppingCartByShopId(Long shopId);

    /**
     * 查询购物车列表
     * 
     * @param bizShoppingCart 购物车
     * @return 购物车集合
     */
    public List<BizShoppingCart> selectBizShoppingCartList(BizShoppingCart bizShoppingCart);

    /**
     * 新增购物车
     * 
     * @param bizShoppingCart 购物车
     * @return 结果
     */
    public int insertBizShoppingCart(BizShoppingCart bizShoppingCart);

    /**
     * 修改购物车
     * 
     * @param bizShoppingCart 购物车
     * @return 结果
     */
    public int updateBizShoppingCart(BizShoppingCart bizShoppingCart);

    /**
     * 删除购物车
     * 
     * @param shopId 购物车主键
     * @return 结果
     */
    public int deleteBizShoppingCartByShopId(Long shopId);

    /**
     * 批量删除购物车
     * 
     * @param shopIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteBizShoppingCartByShopIds(Long[] shopIds);
}
