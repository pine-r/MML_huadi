package cn.java.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.java.entity.Order;

public interface OrderMapper {
    int deleteByPrimaryKey(Integer orderId);

    int insert(Order record);

    int insertSelective(Order record);

    Order selectByPrimaryKey(Integer orderId);

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);

	Order selectByUserIdAndOrderNum(@Param("userId") Integer userId,@Param("orderNum") Long orderNum);

	Order selectByOrderNum(Long orderNum);

	List<Order> selectByUserId(Integer userId);

	List<Order> selectAllOrder();


}