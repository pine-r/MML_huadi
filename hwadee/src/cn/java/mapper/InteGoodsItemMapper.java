package cn.java.mapper;
import cn.java.entity.InteGoodsItem;

public interface InteGoodsItemMapper {
    int deleteByPrimaryKey(Integer inteGoodsItemId);

    int insert(InteGoodsItem record);

    int insertSelective(InteGoodsItem record);

    InteGoodsItem selectByPrimaryKey(Integer inteGoodsItemId);

    int updateByPrimaryKeySelective(InteGoodsItem record);

    int updateByPrimaryKey(InteGoodsItem record);
}