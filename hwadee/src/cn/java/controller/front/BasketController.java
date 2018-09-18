package cn.java.controller.front;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.java.common.Const;
import cn.java.common.ResponseCode;
import cn.java.common.ServerResponse;
import cn.java.entity.User;
import cn.java.service.BasketService;
import cn.java.vo.BasketVo;



@Controller
@RequestMapping("/basket/")
public class BasketController {

    @Autowired
    private BasketService basketService;



    @RequestMapping("list")
    @ResponseBody
    public ServerResponse<BasketVo> list(HttpSession session){
        User user = (User)session.getAttribute(Const.CURRENT_USER);
        if(user ==null){
            return ServerResponse.createByErrorCodeMessage(ResponseCode.NEED_LOGIN.getCode(),ResponseCode.NEED_LOGIN.getDesc());
        }
        return basketService.list(user.getUserId());
    }

    @RequestMapping("add")
    @ResponseBody
    public ServerResponse<BasketVo> add(HttpSession session, Integer count, Integer goodsId){
        User user = (User)session.getAttribute(Const.CURRENT_USER);
        if(user ==null){
            return ServerResponse.createByErrorCodeMessage(ResponseCode.NEED_LOGIN.getCode(),ResponseCode.NEED_LOGIN.getDesc());
        }
        return basketService.add(user.getUserId(),goodsId,count);
    }



    @RequestMapping("update")
    @ResponseBody
    public ServerResponse<BasketVo> update(HttpSession session, Integer count, Integer goodsId){
        User user = (User)session.getAttribute(Const.CURRENT_USER);
        if(user ==null){
            return ServerResponse.createByErrorCodeMessage(ResponseCode.NEED_LOGIN.getCode(),ResponseCode.NEED_LOGIN.getDesc());
        }
        return basketService.update(user.getUserId(),goodsId,count);
    }

    @RequestMapping("deleteGoods")
    @ResponseBody
    public ServerResponse<BasketVo> deletegoods(HttpSession session,String goodsIds){
        User user = (User)session.getAttribute(Const.CURRENT_USER);
        if(user ==null){
            return ServerResponse.createByErrorCodeMessage(ResponseCode.NEED_LOGIN.getCode(),ResponseCode.NEED_LOGIN.getDesc());
        }
        return basketService.deleteGoods(user.getUserId(),goodsIds);
    }


    @RequestMapping("selectAll")
    @ResponseBody
    public ServerResponse<BasketVo> selectAll(HttpSession session){
        User user = (User)session.getAttribute(Const.CURRENT_USER);
        if(user ==null){
            return ServerResponse.createByErrorCodeMessage(ResponseCode.NEED_LOGIN.getCode(),ResponseCode.NEED_LOGIN.getDesc());
        }
        return basketService.selectOrUnSelect(user.getUserId(),null,Const.Basket.CHECKED);
    }

    @RequestMapping("unSelectAll")
    @ResponseBody
    public ServerResponse<BasketVo> unSelectAll(HttpSession session){
        User user = (User)session.getAttribute(Const.CURRENT_USER);
        if(user ==null){
            return ServerResponse.createByErrorCodeMessage(ResponseCode.NEED_LOGIN.getCode(),ResponseCode.NEED_LOGIN.getDesc());
        }
        return basketService.selectOrUnSelect(user.getUserId(),null,Const.Basket.UN_CHECKED);
    }



    @RequestMapping("select")
    @ResponseBody
    public ServerResponse<BasketVo> select(HttpSession session,Integer goodsId){
        User user = (User)session.getAttribute(Const.CURRENT_USER);
        if(user ==null){
            return ServerResponse.createByErrorCodeMessage(ResponseCode.NEED_LOGIN.getCode(),ResponseCode.NEED_LOGIN.getDesc());
        }
        return basketService.selectOrUnSelect(user.getUserId(),goodsId,Const.Basket.CHECKED);
    }

    @RequestMapping("unSelect")
    @ResponseBody
    public ServerResponse<BasketVo> unSelect(HttpSession session,Integer goodsId){
        User user = (User)session.getAttribute(Const.CURRENT_USER);
        if(user ==null){
            return ServerResponse.createByErrorCodeMessage(ResponseCode.NEED_LOGIN.getCode(),ResponseCode.NEED_LOGIN.getDesc());
        }
        return basketService.selectOrUnSelect(user.getUserId(),goodsId,Const.Basket.UN_CHECKED);
    }



    @RequestMapping("getBasketGoodsCount")
    @ResponseBody
    public ServerResponse<Integer> getBasketGoodsCount(HttpSession session){
        User user = (User)session.getAttribute(Const.CURRENT_USER);
        if(user ==null){
            return ServerResponse.createBySuccess(0);
        }
		return basketService.getBasketGoodsCount(user.getUserId());
		
    }




    //全选
    //全反选

    //单独选
    //单独反选

    //查询当前用户的购物车里面的产品数量,如果一个产品有10个,那么数量就是10.




}
