package cn.java.mapper;

import cn.java.entity.Coupon;

public interface CouponMapper {
    int deleteByPrimaryKey(Integer coupGoodsId);

    int insert(Coupon record);

    int insertSelective(Coupon record);

    Coupon selectByPrimaryKey(Integer coupGoodsId);

    int updateByPrimaryKeySelective(Coupon record);

    int updateByPrimaryKey(Coupon record);
}