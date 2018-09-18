package cn.java.mapper;

import cn.java.entity.Consume;

public interface ConsumeMapper {
    int deleteByPrimaryKey(Integer consumeChangeId);

    int insert(Consume record);

    int insertSelective(Consume record);

    Consume selectByPrimaryKey(Integer consumeChangeId);

    int updateByPrimaryKeySelective(Consume record);

    int updateByPrimaryKey(Consume record);
}