package cn.java.mapper;

import cn.java.entity.PayMethod;

public interface PayMethodMapper {
    int deleteByPrimaryKey(Integer payMethodId);

    int insert(PayMethod record);

    int insertSelective(PayMethod record);

    PayMethod selectByPrimaryKey(Integer payMethodId);

    int updateByPrimaryKeySelective(PayMethod record);

    int updateByPrimaryKey(PayMethod record);
}