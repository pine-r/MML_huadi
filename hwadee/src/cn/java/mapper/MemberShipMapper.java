package cn.java.mapper;

import cn.java.entity.MemberShip;

public interface MemberShipMapper {
    int deleteByPrimaryKey(Integer memberId);

    int insert(MemberShip record);

    int insertSelective(MemberShip record);

    MemberShip selectByPrimaryKey(Integer memberId);

    int updateByPrimaryKeySelective(MemberShip record);

    int updateByPrimaryKey(MemberShip record);
}