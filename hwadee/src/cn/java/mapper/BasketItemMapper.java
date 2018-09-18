package cn.java.mapper;

import cn.java.entity.BasketItem;

public interface BasketItemMapper {
    int deleteByPrimaryKey(Integer basketItemId);

    int insert(BasketItem record);

    int insertSelective(BasketItem record);

    BasketItem selectByPrimaryKey(Integer basketItemId);

    int updateByPrimaryKeySelective(BasketItem record);

    int updateByPrimaryKey(BasketItem record);
}