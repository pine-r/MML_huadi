package cn.java.mapper;

import cn.java.entity.GoodsItem;

public interface GoodsItemMapper {
    int deleteByPrimaryKey(Integer goodsItemId);

    int insert(GoodsItem record);

    int insertSelective(GoodsItem record);

    GoodsItem selectByPrimaryKey(Integer goodsItemId);

    int updateByPrimaryKeySelective(GoodsItem record);

    int updateByPrimaryKey(GoodsItem record);
}