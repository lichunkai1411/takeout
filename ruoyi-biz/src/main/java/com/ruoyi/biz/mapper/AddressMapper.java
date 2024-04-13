package com.ruoyi.biz.mapper;

import java.util.List;
import com.ruoyi.biz.domain.Address;

/**
 * 收货地址Mapper接口
 */
public interface AddressMapper 
{
    /**
     * 通过收货地址ID查询收货地址
     */
    Address selectAddressByAddressId(Long addressId);

    /**
     * 查询收货地址列表
     */
    List<Address> selectAddressList(Address address);

    /**
     * 新增收货地址
     */
    int insertAddress(Address address);

    /**
     * 修改收货地址
     */
    int updateAddress(Address address);

    /**
     * 通过收货地址ID删除收货地址
     */
    int deleteAddressByAddressId(Long addressId);

    /**
     * 通过收货地址ID批量删除收货地址
     */
    int deleteAddressByAddressIds(Long[] addressIds);
}
