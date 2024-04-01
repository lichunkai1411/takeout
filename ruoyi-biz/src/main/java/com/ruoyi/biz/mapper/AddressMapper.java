package com.ruoyi.biz.mapper;

import java.util.List;
import com.ruoyi.biz.domain.Address;

/**
 * 收货地址Mapper接口
 * 
 * @author ruoyi
 * @date 2024-04-01
 */
public interface AddressMapper 
{
    /**
     * 查询收货地址
     * 
     * @param addressId 收货地址主键
     * @return 收货地址
     */
    public Address selectAddressByAddressId(Long addressId);

    /**
     * 查询收货地址列表
     * 
     * @param address 收货地址
     * @return 收货地址集合
     */
    public List<Address> selectAddressList(Address address);

    /**
     * 新增收货地址
     * 
     * @param address 收货地址
     * @return 结果
     */
    public int insertAddress(Address address);

    /**
     * 修改收货地址
     * 
     * @param address 收货地址
     * @return 结果
     */
    public int updateAddress(Address address);

    /**
     * 删除收货地址
     * 
     * @param addressId 收货地址主键
     * @return 结果
     */
    public int deleteAddressByAddressId(Long addressId);

    /**
     * 批量删除收货地址
     * 
     * @param addressIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteAddressByAddressIds(Long[] addressIds);
}
