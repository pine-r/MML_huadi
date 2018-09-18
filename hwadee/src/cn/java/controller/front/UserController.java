package cn.java.controller.front;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.sun.xml.internal.ws.transport.http.server.ServerAdapter;

import cn.java.common.Const;
import cn.java.common.ServerResponse;
import cn.java.entity.User;
import cn.java.service.UserService;
import cn.java.utils.Constants;
import cn.java.utils.Md5;
@Controller
//@RequestMapping("/front")
public class UserController {
	@Autowired
	private UserService userService;
	/**
	 * 用户注册
	 * @param phone
	 * @param password
	 * @param nickname
	 * @return
	 */
	@RequestMapping(value="/registerIn")
	public @ResponseBody
	ServerResponse
	/*void*/ registerIn(@RequestParam String phone,
			@RequestParam String password, @RequestParam String userName) {
		//testparam
//		String phone="13458318595";
//		String password="xadzkd201230";
//		String userName="qq664076268";
		Map<String, Object> map = new HashMap<String, Object>();
		ServerResponse<User> response;

		try {
			if (!phone.equals("") && phone.length() == 11
					&& !password.equals("")) {
				if(userService.selectByUsername(phone)!=null)
					return response=ServerResponse.createByErrorMessage("账号已存在");
				String passwordMd5=Md5.GetMD5Code(password);

				User user = new User(userName, phone,passwordMd5);
				userService.addUsers(user);
				response=ServerResponse.createBySuccessMessage("注册成功");
			} else {
				response=ServerResponse.createByErrorMessage("注册失败");
			}
		} catch (Exception e) {
			response=ServerResponse.createByErrorMessage("注册失败");
			return response;
		}
		return response;
	}
	/**
	 * 检查用户是否已经注册
	 * @param phone
	 * @return
	 */
	@RequestMapping(value="/checkUserIsExist")
	public @ResponseBody
	ServerResponse<User> checkUserIsExist(@RequestParam String phone) {
		ServerResponse<User> response;
		if (userService.selectByUsername(phone) != null) {
			response=ServerResponse.createByErrorMessage("已经被注册~！");
		} else {
			response=ServerResponse.createBySuccessMessage("可以注册!");
		}
//		System.out.println(response);
		return response;
	}
	/**
	 * 用户登陆
	 * @param phone
	 * @param password
	 * @return
	 * @throws IOException 
	 */
	@RequestMapping(value="/toLogin")
	@ResponseBody
	public ServerResponse<User> toLogin(@RequestParam String phone,@RequestParam String password,HttpSession session) {
		ServerResponse<User> response;
		if (phone!=null&&password!=null&&!phone.trim().equals("") && !password.trim().equals("")) {
			User user = userService.checkLogin(phone);
			if (user != null) {
				if (user.getPassword().equals(Md5.GetMD5Code(password))) {
//					map.put("type", user.getType());
					response=ServerResponse.createBySuccess("登陆成功", user);
		            session.setAttribute(Const.CURRENT_USER,response.getData());
		            System.out.println(session.getAttribute(Const.CURRENT_USER));
		            return response;
				} else {
					return response=ServerResponse.createByErrorMessage("登陆失败");
				}
			} else {
				return response=ServerResponse.createByErrorMessage("登陆失败");

			}
		}
		else
			return response=ServerResponse.createByErrorMessage("登陆失败");
	}
	
//	@RequestMapping(value="/toLogin")
//	@ResponseBody
//	public ServerResponse<User> toLogin(@RequestParam String phone,@RequestParam String password,HttpServletResponse res,HttpSession session) throws IOException {
//		ServerResponse<User> response;
//		if (phone!=null&&password!=null&&!phone.trim().equals("") && !password.trim().equals("")) {
//			User user = userService.checkLogin(phone);
//			if (user != null) {
//				if (user.getPassword().equals(Md5.GetMD5Code(password))) {
////					map.put("type", user.getType());
//					response=ServerResponse.createBySuccess("登陆成功", user);
//		            session.setAttribute(Const.CURRENT_USER,response.getData());
////		            System.out.println(session.getAttribute(Const.CURRENT_USER));
////		            Gson gson = new Gson(); 
////		            String result = gson.toJson(response);
////		            res.getWriter().write(result);
//		            return ;
//				} else {
//					
//					res.getWriter().write("登陆失败");
//				}
//			} else {
//				res.getWriter().write("登陆失败");
//
//			}
//		}
//		else
//			res.getWriter().write("登陆失败");
//	}
//	
	/**
	 * 退出登录
	 * @param request
	 * @return
	 */
	@RequestMapping(value="/logout")
	@ResponseBody
	public  ServerResponse<User> logout(HttpServletRequest request){	
		if(request.getSession().getAttribute(Const.CURRENT_USER)!=null) {
		request.getSession().removeAttribute(Const.CURRENT_USER);
		ServerResponse res;
//		需要写html
		return res=ServerResponse.createBySuccess();
		}
		else
			return ServerResponse.createByError();
	}
	/**
	 * 取得用户信息
	 * @param phone
	 * @return 
	 */
	@SuppressWarnings("unused")
	@RequestMapping(value="/getUser",method=RequestMethod.POST)
	public @ResponseBody
	ServerResponse<User> getUser(HttpSession session) {
		User user = (User) session.getAttribute(Const.CURRENT_USER);
		ServerResponse<User> response;
		if(user!=null) {
			System.out.println(user);
		return response=ServerResponse.createBySuccess(user);
		}
		else {
			System.out.println(session.getAttribute(Const.CURRENT_USER));
			return response=ServerResponse.createByErrorMessage("信息取得失败");
		}
	}
	/**
	 * 用户更改密码
	 * @param phone
	 * @param newPassword
	 * @return
	 */
	@RequestMapping(value = "/resetPassword")
	@ResponseBody
	public ServerResponse<User> resetPassword(@RequestParam String phone,@RequestParam String password,
			@RequestParam String newPassword,HttpSession session) {
		ServerResponse<User> response;
		User user=(User)session.getAttribute(Const.CURRENT_USER);
		System.out.println(user);
		try {						
//			User users = userService.selectByUsername(phone);
			if (user != null&&user.getPassword().equals(Md5.GetMD5Code(password))) {
				 //对密码做md5加密
				System.out.println("1111111111111111111");
				int result=userService.updatePassword(phone,Md5.GetMD5Code(newPassword));
				System.out.println("2222222222222222222");
				if(result!=0) {
					response=ServerResponse.createBySuccess("修改成功", user);
					System.out.println(response.getMsg());
//					return "redirect:/index.shtml";
					return response;
					
				}
				else {
					response=ServerResponse.createByErrorMessage("修改失败");
					System.out.println(response.getMsg());
					return response;
				}
			} else {
				response=ServerResponse.createByErrorMessage("未登录");
				System.out.println(response.getMsg());
				return response;
//				return "redirect:/login.shtml";
			}
		} catch (Exception e) {
			e.getStackTrace();
			return response=ServerResponse.createByErrorMessage("error");
//			return "redirect:/index.shtml";
		}
//		return "redirect:/index.shtml";
	}
	@RequestMapping(value = "/updateInformation",method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse<User> updateInformation(User user,HttpSession session){
        User currentUser = (User)session.getAttribute(Const.CURRENT_USER);
        ServerResponse<User> response;
        if(currentUser == null){
            return response=ServerResponse.createByErrorMessage("用户未登录");
        }
        user.setUserPhone(currentUser.getUserPhone());
        user.setPassword(currentUser.getPassword());
        int result=userService.updateInformation(user);
        if(result!=0){
            response=ServerResponse.createBySuccess("更新成功", userService.selectByUsername(user.getUserPhone()));
            session.setAttribute(Const.CURRENT_USER,response.getData());
            return response;
        }
        
        return response=ServerResponse.createByErrorMessage("更新失败~");
    }
}
	