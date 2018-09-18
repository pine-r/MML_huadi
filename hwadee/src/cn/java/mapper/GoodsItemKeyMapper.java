package cn.java.mapper;

import cn.java.entity.GoodsItemKey;

public interface GoodsItemKeyMapper {
    int deleteByPrimaryKey(Integer keyId);

    int insert(GoodsItemKey record);

    int insertSelective(GoodsItemKey record);

    GoodsItemKey selectByPrimaryKey(Integer keyId);

    int updateByPrimaryKeySelective(GoodsItemKey record);

    int updateByPrimaryKey(GoodsItemKey record);
}