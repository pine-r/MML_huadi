package cn.java.service;

import com.github.pagehelper.PageInfo;

import cn.java.common.ServerResponse;
import cn.java.entity.Shipping;

public interface IShippingService {

	ServerResponse add(Integer userId, Shipping shipping);
	
	ServerResponse<String> del(Integer userId, Integer shippingId);
	
	 ServerResponse update(Integer userId, Shipping shipping);
	 
	 ServerResponse<Shipping> select(Integer userId, Integer shippingId);
	 
	 ServerResponse<PageInfo> list(Integer userId,int pageNum,int pageSize);
	
	
}
