package cn.java.mapper;

import cn.java.entity.OrderDetail;

public interface OrderDetailMapper {
    int deleteByPrimaryKey(Integer orderGoodsItemId);

    int insert(OrderDetail record);

    int insertSelective(OrderDetail record);

    OrderDetail selectByPrimaryKey(Integer orderGoodsItemId);

    int updateByPrimaryKeySelective(OrderDetail record);

    int updateByPrimaryKey(OrderDetail record);
}