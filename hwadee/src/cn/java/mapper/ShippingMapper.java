package cn.java.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.java.entity.Shipping;

public interface ShippingMapper {
    int deleteByPrimaryKey(Integer addressId);

    int insert(Shipping record);

    int insertSelective(Shipping record);

    Shipping selectByPrimaryKey(Integer addressId);

    int updateByPrimaryKeySelective(Shipping record);

    int updateByPrimaryKey(Shipping record);
    
    
    int deleteByShippingIdUserId(@Param("userId")Integer userId,@Param("shippingId")Integer shippingId);
    
    
    int updateByShipping(Shipping record);
    
    Shipping selectByShippingIdUserId(@Param("userId")Integer userId,@Param("shippingId")Integer shippingId);
    
    List<Shipping> selectByUserId(@Param("userId")Integer userId);
}