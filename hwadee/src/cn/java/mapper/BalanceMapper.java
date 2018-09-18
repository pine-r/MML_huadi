package cn.java.mapper;

import cn.java.entity.Balance;

public interface BalanceMapper {
    int deleteByPrimaryKey(Integer balanceId);

    int insert(Balance record);

    int insertSelective(Balance record);

    Balance selectByPrimaryKey(Integer balanceId);

    int updateByPrimaryKeySelective(Balance record);

    int updateByPrimaryKey(Balance record);
}