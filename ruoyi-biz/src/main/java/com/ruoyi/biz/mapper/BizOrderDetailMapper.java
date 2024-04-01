package com.ruoyi.biz.mapper;

import java.util.List;
import com.ruoyi.biz.domain.BizOrderDetail;

/**
 * 订单明细Mapper接口
 * 
 * @author ruoyi
 * @date 2024-04-01
 */
public interface BizOrderDetailMapper 
{
    /**
     * 查询订单明细
     * 
     * @param orderDetailId 订单明细主键
     * @return 订单明细
     */
    public BizOrderDetail selectBizOrderDetailByOrderDetailId(Long orderDetailId);

    /**
     * 查询订单明细列表
     * 
     * @param bizOrderDetail 订单明细
     * @return 订单明细集合
     */
    public List<BizOrderDetail> selectBizOrderDetailList(BizOrderDetail bizOrderDetail);

    /**
     * 新增订单明细
     * 
     * @param bizOrderDetail 订单明细
     * @return 结果
     */
    public int insertBizOrderDetail(BizOrderDetail bizOrderDetail);

    /**
     * 修改订单明细
     * 
     * @param bizOrderDetail 订单明细
     * @return 结果
     */
    public int updateBizOrderDetail(BizOrderDetail bizOrderDetail);

    /**
     * 删除订单明细
     * 
     * @param orderDetailId 订单明细主键
     * @return 结果
     */
    public int deleteBizOrderDetailByOrderDetailId(Long orderDetailId);

    /**
     * 批量删除订单明细
     * 
     * @param orderDetailIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteBizOrderDetailByOrderDetailIds(Long[] orderDetailIds);
}
