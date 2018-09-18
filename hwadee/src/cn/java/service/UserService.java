package cn.java.service;

import cn.java.common.ServerResponse;
import cn.java.entity.User;

public interface UserService {
	User selectByUsername(String id);//根据用户手机号获取用户信息
	
	void addUsers(User user);//添加用户

	User checkLogin(String phone);//登陆验证

	int updatePassword(String phone,String password);//修改自身用户密码

	int updateInformation(User user);//修改用户信息
	

}
