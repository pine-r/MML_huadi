package cn.java.mapper;

import cn.java.entity.BalanceRecord;

public interface BalanceRecordMapper {
    int deleteByPrimaryKey(Integer balanceChangeId);

    int insert(BalanceRecord record);

    int insertSelective(BalanceRecord record);

    BalanceRecord selectByPrimaryKey(Integer balanceChangeId);

    int updateByPrimaryKeySelective(BalanceRecord record);

    int updateByPrimaryKey(BalanceRecord record);
}