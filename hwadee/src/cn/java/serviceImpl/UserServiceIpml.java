package cn.java.serviceImpl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.java.common.ServerResponse;
import cn.java.entity.User;
import cn.java.mapper.UserMapper;
import cn.java.service.UserService;

@Service("userService")
public class UserServiceIpml implements UserService {
	@Autowired
	private UserMapper userMapper; 
	@Override
	public User selectByUsername(String phone) {
		// TODO Auto-generated method stub
		return userMapper.selectByPhone(phone);
	}

	@Override
	public void addUsers(User user) {
		// TODO Auto-generated method stub
		userMapper.insertSelective(user);
	}

	@Override
	public User checkLogin(String phone) {
		// TODO Auto-generated method stub
		return userMapper.selectByPhone(phone);
	}

	@Override
	public int updatePassword(String phone,String password) {
		// TODO Auto-generated method stub
		Map<String,String> map=new HashMap<String,String>();
		map.put("userPhone", phone);
		map.put("password", password);
		return userMapper.updatePassword(map);
	}

	@Override
	public int updateInformation(User user) {
		// TODO Auto-generated method stub
		
		return userMapper.updateByPrimaryKeySelective(user);
	}
	

}
