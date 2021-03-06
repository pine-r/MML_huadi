package cn.java.controller.front;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageInfo;

import cn.java.common.ServerResponse;
import cn.java.service.GoodsService;
import cn.java.vo.GoodsDetailVo;

@Controller
@RequestMapping("/goods/")
public class GoodsController {

    @Autowired
    private GoodsService goodsService;



    @RequestMapping("detail")
    @ResponseBody
    public ServerResponse<GoodsDetailVo> detail(Integer goodsId){
        return goodsService.getGoodsDetail(goodsId);
    }

    @RequestMapping("list")
    @ResponseBody
    public ServerResponse<PageInfo> list(@RequestParam(value = "keyword",required = false)String keyword,
                                         @RequestParam(value = "categoryId",required = false)Integer categoryId,
                                         @RequestParam(value = "pageNum",defaultValue = "1") int pageNum,
                                         @RequestParam(value = "pageSize",defaultValue = "10") int pageSize,
                                         @RequestParam(value = "orderBy",defaultValue = "") String orderBy){
        return goodsService.getGoodsByKeywordCategory(keyword,categoryId,pageNum,pageSize,orderBy);
    }





}