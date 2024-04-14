package com.ruoyi.biz.mapper;

import com.ruoyi.biz.domain.OrderDetail;

import java.util.List;

/**
 * 订单明细Mapper接口
 */
public interface OrderDetailMapper {

    /**
     * 通过订单明细ID查询订单明细
     */
    OrderDetail selectOrderDetailByOrderDetailId(Long orderDetailId);

    /**
     * 查询订单明细列表
     */
    List<OrderDetail> selectOrderDetailList(OrderDetail orderDetail);

    /**
     * 新增订单明细
     */
    int insertOrderDetail(OrderDetail orderDetail);

    /**
     * 修改订单明细
     */
    int updateOrderDetail(OrderDetail orderDetail);

    /**
     * 通过订单明细ID删除订单明细
     */
    int deleteOrderDetailByOrderDetailId(Long orderDetailId);

    /**
     * 通过订单明细ID批量删除订单明细
     */
    int deleteOrderDetailByOrderDetailIds(Long[] orderDetailIds);
}
