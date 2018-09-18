package cn.java.mapper;

import cn.java.entity.ShipMethod;

public interface ShipMethodMapper {
    int deleteByPrimaryKey(Integer shipMethodId);

    int insert(ShipMethod record);

    int insertSelective(ShipMethod record);

    ShipMethod selectByPrimaryKey(Integer shipMethodId);

    int updateByPrimaryKeySelective(ShipMethod record);

    int updateByPrimaryKey(ShipMethod record);
}