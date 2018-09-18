package cn.java.controller.admin;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.StringUtils;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.MultipartRequest;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.google.common.collect.Maps;

import cn.java.common.Const;
import cn.java.common.ResponseCode;
import cn.java.common.ServerResponse;
import cn.java.entity.Goods;
import cn.java.entity.User;
import cn.java.mapper.GoodsMapper;
import cn.java.service.FileService;
import cn.java.service.GoodsService;
import cn.java.service.UserService;
import cn.java.utils.PropertiesUtil;
@Controller
@RequestMapping("/admin/goods")
public class GoodsManageController {

    @Autowired
    private UserService userService;
    @Autowired
    private GoodsService goodsService;
    @Autowired
    private FileService fileService;

    @RequestMapping("save")
    @ResponseBody
    public ServerResponse GoodsSave(HttpSession session, Goods goods){
        User user = (User)session.getAttribute(Const.CURRENT_USER);
        if(user == null){
            return ServerResponse.createByErrorCodeMessage(ResponseCode.NEED_LOGIN.getCode(),"用户未登录,请登录管理员");

        }
        if(user.getUserRole()==0){
            //填充我们增加产品的业务逻辑
            return goodsService.saveOrUpdateGoods(goods);
        }else{
            return ServerResponse.createByErrorMessage("无权限操作");
        }
    }

    @RequestMapping("setSaleStatus")
    @ResponseBody
    public ServerResponse setSaleStatus(HttpSession session, Integer goodsId,Integer status){
        User user = (User)session.getAttribute(Const.CURRENT_USER);
        if(user == null){
            return ServerResponse.createByErrorCodeMessage(ResponseCode.NEED_LOGIN.getCode(),"用户未登录,请登录管理员");

        }
        if(user.getUserRole()==0){
            return goodsService.setSaleStatus(goodsId,status);
        }else{
            return ServerResponse.createByErrorMessage("无权限操作");
        }
    }

    @RequestMapping("detail")
    @ResponseBody
    public ServerResponse getDetail(HttpSession session, Integer goodsId){
        User user = (User)session.getAttribute(Const.CURRENT_USER);
        if(user == null){
            return ServerResponse.createByErrorCodeMessage(ResponseCode.NEED_LOGIN.getCode(),"用户未登录,请登录管理员");

        }
        if(user.getUserRole()==0){
            //填充业务
            return goodsService.manageGoodsDetail(goodsId);

        }else{
            return ServerResponse.createByErrorMessage("无权限操作");
        }
    }

    @RequestMapping("list")
    @ResponseBody
    public ServerResponse getList(HttpSession session, @RequestParam(value = "pageNum",defaultValue = "1") int pageNum,@RequestParam(value = "pageSize",defaultValue = "10") int pageSize){
        User user = (User)session.getAttribute(Const.CURRENT_USER);
        if(user == null){
            return ServerResponse.createByErrorCodeMessage(ResponseCode.NEED_LOGIN.getCode(),"用户未登录,请登录管理员");

        }
        if(user.getUserRole()==0){
            //填充业务
            return goodsService.getGoodsList(pageNum,pageSize);
        }else{
            return ServerResponse.createByErrorMessage("无权限操作");
        }
    }

    @RequestMapping("search")
    @ResponseBody
    public ServerResponse GoodsSearch(HttpSession session,String goodsName,Integer goodsId, @RequestParam(value = "pageNum",defaultValue = "1") int pageNum,@RequestParam(value = "pageSize",defaultValue = "10") int pageSize){
        User user = (User)session.getAttribute(Const.CURRENT_USER);
        if(user == null){
            return ServerResponse.createByErrorCodeMessage(ResponseCode.NEED_LOGIN.getCode(),"用户未登录,请登录管理员");

        }
        if(user.getUserRole()==0){
            //填充业务
            return goodsService.searchGoods(goodsName,goodsId,pageNum,pageSize);
        }else{
            return ServerResponse.createByErrorMessage("无权限操作");
        }
    }
/*          ==============================================================================================================        */
    @RequestMapping(value="upload",method=RequestMethod.POST)
    @ResponseBody
    public ServerResponse upload(HttpSession session,@RequestParam(value = "uploadFile",required = false) MultipartFile file,@RequestParam(value="goodsId",required=false) int goodsId,HttpServletRequest request) {
        User user = (User)session.getAttribute(Const.CURRENT_USER);
        if(user == null){
            return ServerResponse.createByErrorCodeMessage(ResponseCode.NEED_LOGIN.getCode(),"用户未登录,请登录管理员");
        }
        if(user.getUserRole()==0){
            String path = request.getSession().getServletContext().getRealPath("upload");
            String targetFileName = fileService.upload(file,path);
            String url = path+"\\"+targetFileName;
            Goods goods=new Goods();
            goods.setGoodsId(goodsId);
            goods.setGoodsSubimages(url+",");
            goodsService.saveOrUpdateGoods(goods);
            Map fileMap = Maps.newHashMap();
            fileMap.put("uri",targetFileName);
            fileMap.put("url",url);
            
            return ServerResponse.createBySuccess(fileMap);
        }else{
            return ServerResponse.createByErrorMessage("无权限操作");
        }
    }
    

    @RequestMapping("richtextImgUpload")
    @ResponseBody
    public Map richtextImgUpload(HttpSession session, @RequestParam(value = "uploadFile",required = false) MultipartFile file,@RequestParam(value="goodsId",required=false) int goodsId, HttpServletRequest request, HttpServletResponse response){
        Map resultMap = new HashMap();
        User user = (User)session.getAttribute(Const.CURRENT_USER);
        if(user == null){
            resultMap.put("success",false);
            resultMap.put("msg","请登录管理员");
            return resultMap;
        }
        //富文本中对于返回值有自己的要求,我们使用是simditor所以按照simditor的要求进行返回
//        {
//            "success": true/false,
//                "msg": "error message", # optional
//            "file_path": "[real file path]"
//        }
        if(user.getUserRole()==0){
            String path = request.getSession().getServletContext().getRealPath("upload");
            String targetFileName = fileService.upload(file,path);
            if(StringUtils.isBlank(targetFileName)){
                resultMap.put("success",false);
                resultMap.put("msg","上传失败");
                return resultMap;
            }
            String url = path+"\\"+targetFileName;
            resultMap.put("success",true);
            resultMap.put("msg","上传成功");
            resultMap.put("file_path",url);
            response.addHeader("Access-Control-Allow-Headers","X-File-Name");
            Goods goods=new Goods();
            goods.setGoodsId(goodsId);
            goods.setGoodsDetails(url+",");
            goodsService.saveOrUpdateGoods(goods);
            return resultMap;
        }else{
            resultMap.put("success",false);
            resultMap.put("msg","无权限操作");
            return resultMap;
        }
    }
}

