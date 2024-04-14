package com.ruoyi.biz.mapper;

import com.ruoyi.biz.domain.Order;

import java.util.List;

/**
 * 订单Mapper接口
 */
public interface OrderMapper {

    /**
     * 通过订单ID查询订单
     */
    Order selectOrderByOrderId(Long orderId);

    /**
     * 查询订单列表
     */
    List<Order> selectOrderList(Order order);

    /**
     * 新增订单
     */
    int insertOrder(Order order);

    /**
     * 修改订单
     */
    int updateOrder(Order order);

    /**
     * 通过订单ID删除订单
     */
    int deleteOrderByOrderId(Long orderId);

    /**
     * 通过订单ID批量删除订单
     */
    int deleteOrderByOrderIds(Long[] orderIds);
}
