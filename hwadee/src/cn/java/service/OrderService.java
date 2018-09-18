package cn.java.service;

import java.util.Map;

import com.github.pagehelper.PageInfo;

import cn.java.common.ServerResponse;
import cn.java.vo.OrderVo;

public interface OrderService {
	
	
	ServerResponse createOrder(Integer userId,Integer shippingId);
	
	ServerResponse<String> cancel(Integer userId,Long orderNo);
	
	ServerResponse getOrderBasketGoods(Integer userId);
	 
	 ServerResponse<OrderVo> getOrderDetail(Integer userId,Long orderNum);
	 
	 ServerResponse<PageInfo> getOrderList(Integer userId,int pageNum,int pageSize);
	 
	 
	 
	 //back
	 ServerResponse<PageInfo> manageList(int pageNum,int pageSize);
	 
	 ServerResponse<OrderVo> manageDetail(Long orderNum);
	 
     ServerResponse<PageInfo> manageSearch(Long orderNum,int pageNum,int pageSize);

     ServerResponse<String> manageSendGoods(Long orderNum);
     
     
     
     

	ServerResponse pay(Long orderNo, Integer userId, String path);

	ServerResponse aliCallback(Map<String, String> params);

	ServerResponse queryOrderPayStatus(Integer userId, Long orderNo);

}
