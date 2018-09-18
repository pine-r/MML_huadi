package cn.java.controller.front;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageInfo;

import cn.java.common.Const;
import cn.java.common.ResponseCode;
import cn.java.common.ServerResponse;
import cn.java.entity.Shipping;
import cn.java.entity.User;
import cn.java.service.IShippingService;

@Controller
@RequestMapping("/shipping")
public class ShippingController {
	@Autowired
	private IShippingService iShippingService;
	
	@RequestMapping("/add")
	@ResponseBody
	public ServerResponse add(HttpSession session,Shipping shipping) {
		User user=(User)session.getAttribute(Const.CURRENT_USER);
	
		System.out.println("用户是"+user);
		if(user==null) {
			return ServerResponse.createByErrorCodeMessage(ResponseCode.NEED_LOGIN.getCode(), ResponseCode.NEED_LOGIN.getDesc());
		}
		return iShippingService.add(user.getUserId(), shipping);
	}

	@RequestMapping("/del")
	@ResponseBody
	public ServerResponse del(HttpSession session,Integer shippingId) {
		User user=(User)session.getAttribute(Const.CURRENT_USER);
		if(user==null) {
			return ServerResponse.createByErrorCodeMessage(ResponseCode.NEED_LOGIN.getCode(), ResponseCode.NEED_LOGIN.getDesc());
			
		}
	
		return iShippingService.del(user.getUserId(), shippingId);
	}
	
		
	@RequestMapping("/update")
	@ResponseBody
	public ServerResponse update(HttpSession session,Shipping shipping){
		User user=(User)session.getAttribute(Const.CURRENT_USER);
		if(user==null) {
			return ServerResponse.createByErrorCodeMessage(ResponseCode.NEED_LOGIN.getCode(), ResponseCode.NEED_LOGIN.getDesc());
			
		}
	
		return iShippingService.update(user.getUserId(), shipping);
	}
	
	@RequestMapping("/select")
	@ResponseBody
	public ServerResponse<Shipping> select(HttpSession session,Integer shippingId) {
		User user=(User)session.getAttribute(Const.CURRENT_USER);
		System.out.println("");
		if(user==null) {
			return ServerResponse.createByErrorCodeMessage(ResponseCode.NEED_LOGIN.getCode(), ResponseCode.NEED_LOGIN.getDesc());
			
		}
	
		return iShippingService.select(user.getUserId(), shippingId);
	}
	
	
	  @RequestMapping("/list")
	    @ResponseBody
	    public ServerResponse<PageInfo> list(@RequestParam(value = "pageNum",defaultValue = "1") int pageNum,
	                                         @RequestParam(value = "pageSize",defaultValue = "10")int pageSize,
	                                         HttpSession session){
	        User user = (User)session.getAttribute(Const.CURRENT_USER);
	        if(user ==null){
	            return ServerResponse.createByErrorCodeMessage(ResponseCode.NEED_LOGIN.getCode(),ResponseCode.NEED_LOGIN.getDesc());
	        }
	     return iShippingService.list(user.getUserId(), pageNum, pageSize);
	    }

}
