package cn.java.service;

import cn.java.common.ServerResponse;
import cn.java.vo.BasketVo;

public interface BasketService {

	ServerResponse<BasketVo> add(Integer userId, Integer goodsId, Integer count);

	ServerResponse<BasketVo> update(Integer userId, Integer goodsId, Integer count);

	ServerResponse<BasketVo> deleteGoods(Integer userId, String goodsIds);

	ServerResponse<BasketVo> selectOrUnSelect(Integer userId, Integer goodsId, int unChecked);

	ServerResponse<Integer> getBasketGoodsCount(Integer userId);

	ServerResponse<BasketVo> list(Integer userId);

}
