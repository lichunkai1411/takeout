package com.ruoyi.biz.mapper;

import java.util.List;
import com.ruoyi.biz.domain.OrderDetail;

/**
 * 订单明细Mapper接口
 * 
 * @author ruoyi
 * @date 2024-04-01
 */
public interface OrderDetailMapper 
{
    /**
     * 查询订单明细
     * 
     * @param orderDetailId 订单明细主键
     * @return 订单明细
     */
    public OrderDetail selectOrderDetailByOrderDetailId(Long orderDetailId);

    /**
     * 查询订单明细列表
     * 
     * @param orderDetail 订单明细
     * @return 订单明细集合
     */
    public List<OrderDetail> selectOrderDetailList(OrderDetail orderDetail);

    /**
     * 新增订单明细
     * 
     * @param orderDetail 订单明细
     * @return 结果
     */
    public int insertOrderDetail(OrderDetail orderDetail);

    /**
     * 修改订单明细
     * 
     * @param orderDetail 订单明细
     * @return 结果
     */
    public int updateOrderDetail(OrderDetail orderDetail);

    /**
     * 删除订单明细
     * 
     * @param orderDetailId 订单明细主键
     * @return 结果
     */
    public int deleteOrderDetailByOrderDetailId(Long orderDetailId);

    /**
     * 批量删除订单明细
     * 
     * @param orderDetailIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteOrderDetailByOrderDetailIds(Long[] orderDetailIds);
}
