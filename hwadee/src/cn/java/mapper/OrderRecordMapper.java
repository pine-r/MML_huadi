package cn.java.mapper;

import cn.java.entity.OrderRecord;

public interface OrderRecordMapper {
    int deleteByPrimaryKey(Integer orderId);

    int insert(OrderRecord record);

    int insertSelective(OrderRecord record);

    OrderRecord selectByPrimaryKey(Integer orderId);

    int updateByPrimaryKeySelective(OrderRecord record);

    int updateByPrimaryKey(OrderRecord record);
}