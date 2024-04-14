package com.ruoyi.biz.mapper;

import java.util.List;
import com.ruoyi.biz.domain.ShoppingCart;

/**
 * 购物车Mapper接口
 */
public interface ShoppingCartMapper 
{

    /**
     * 通过购物车ID查询购物车
     */
    ShoppingCart selectShoppingCartByShopId(Long shopId);

    /**
     * 查询购物车列表
     */
    List<ShoppingCart> selectShoppingCartList(ShoppingCart shoppingCart);

    /**
     * 新增购物车
     */
    int insertShoppingCart(ShoppingCart shoppingCart);

    /**
     * 修改购物车
     */
    int updateShoppingCart(ShoppingCart shoppingCart);

    /**
     * 通过购物车ID删除购物车
     */
    int deleteShoppingCartByShopId(Long shopId);

    /**
     * 通过购物车ID批量删除购物车
     */
    int deleteShoppingCartByShopIds(Long[] shopIds);
}
