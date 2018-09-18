package cn.java.mapper;

import java.util.Map;

import cn.java.entity.User;

public interface UserMapper {
    int deleteByPhone(String userPhone);

    int insert(User record);

    int insertSelective(User record);

    User selectByPhone(String userPhone);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

	int updatePassword(Map<String, String> map);
}