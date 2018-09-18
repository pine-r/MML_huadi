package cn.java.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.java.entity.Goods;

public interface GoodsMapper {
    int deleteByPrimaryKey(Integer goodsId);

    int insert(Goods record);

    int insertSelective(Goods record);

    Goods selectByPrimaryKey(Integer goodsId);

    int updateByPrimaryKeySelective(Goods record);

    int updateByPrimaryKey(Goods record);

	List<Goods> selectList();

	List<Goods> selectByNameAndGoodsId(@Param("goodsName") String goodsName, @Param("goodsId") Integer goodsId);

	List<Goods> selectByNameAndCategoryIds(@Param("keyword") String keyword,@Param("categoryIdList") List<Integer> categoryIdList);
}