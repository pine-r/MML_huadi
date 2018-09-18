package cn.java.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.java.entity.Basket;

public interface BasketMapper {
    int deleteByPrimaryKey(Integer basketId);

    int insert(Basket record);

    int insertSelective(Basket record);

    Basket selectByPrimaryKey(Integer basketId);

    int updateByPrimaryKeySelective(Basket record);

    int updateByPrimaryKey(Basket record);

	Basket selectBasketByUserIdGoodsId(@Param("userId") Integer userId,@Param("goodsId") Integer goodsId);

	void deleteByUserIdGoodsIds(@Param("userId") Integer userId,@Param("goodsList") List<String> goodsList);

	Integer selectBasketGoodsCount(@Param("userId")Integer userId);

	int checkedOrUncheckedGoods(@Param("userId") Integer userId, @Param("goodsId") Integer goodsId, @Param("checked") int checked);

	List<Basket> selectBasketByUserId(Integer userId);

	int selectBasketGoodsCheckedStatusByUserId(Integer userId);
	
	List<Basket> selectCheckedBasketByUserId(Integer userId);
}