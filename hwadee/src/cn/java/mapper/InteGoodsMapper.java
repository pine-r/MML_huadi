package cn.java.mapper;

import cn.java.entity.InteGoods;

public interface InteGoodsMapper {
    int deleteByPrimaryKey(Integer inteGoodsId);

    int insert(InteGoods record);

    int insertSelective(InteGoods record);

    InteGoods selectByPrimaryKey(Integer inteGoodsId);

    int updateByPrimaryKeySelective(InteGoods record);

    int updateByPrimaryKey(InteGoods record);
}