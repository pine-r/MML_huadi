package cn.java.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.java.entity.OrderItem;

public interface OrderItemMapper {
    int deleteByPrimaryKey(Integer orderItemId);

    int insert(OrderItem record);

    int insertSelective(OrderItem record);

    OrderItem selectByPrimaryKey(Integer orderItemId);

    int updateByPrimaryKeySelective(OrderItem record);

    int updateByPrimaryKey(OrderItem record);

	List<OrderItem> getByOrderNumUserId(@Param("orderNum") Long orderNum,@Param("userId") Integer userId);
	
	 void batchInsert(@Param("orderItemList") List<OrderItem> orderItemList);

	List<OrderItem> getByOrderNum(Long orderNum);
}