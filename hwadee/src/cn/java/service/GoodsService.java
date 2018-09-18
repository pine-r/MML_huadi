package cn.java.service;

import com.github.pagehelper.PageInfo;

import cn.java.common.ServerResponse;
import cn.java.entity.Goods;
import cn.java.vo.GoodsDetailVo;

public interface GoodsService {

	ServerResponse saveOrUpdateGoods(Goods goods);

	ServerResponse setSaleStatus(Integer GoodsId, Integer status);

	ServerResponse manageGoodsDetail(Integer GoodsId);

	ServerResponse getGoodsList(int pageNum, int pageSize);

	ServerResponse searchGoods(String goodsName, Integer goodsId, int pageNum, int pageSize);

	ServerResponse<GoodsDetailVo> getGoodsDetail(Integer goodsId);

	ServerResponse<PageInfo> getGoodsByKeywordCategory(String keyword, Integer categoryId, int pageNum, int pageSize,
			String orderBy);

}

