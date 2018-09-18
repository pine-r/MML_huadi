package cn.java.mapper;

import cn.java.entity.Integral;

public interface IntegralMapper {
    int deleteByPrimaryKey(Integer inteChangeId);

    int insert(Integral record);

    int insertSelective(Integral record);

    Integral selectByPrimaryKey(Integer inteChangeId);

    int updateByPrimaryKeySelective(Integral record);

    int updateByPrimaryKey(Integral record);
}