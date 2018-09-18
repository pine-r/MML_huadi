package cn.java.serviceImpl;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.google.common.base.Splitter;
import com.google.common.collect.Lists;

import cn.java.common.Const;
import cn.java.common.ResponseCode;
import cn.java.common.ServerResponse;
import cn.java.entity.Basket;
import cn.java.entity.Goods;
import cn.java.mapper.BasketMapper;
import cn.java.mapper.GoodsMapper;
import cn.java.service.BasketService;
import cn.java.utils.BigDecimalUtil;
import cn.java.vo.BasketGoodsVo;
import cn.java.vo.BasketVo;



@Service("basketService")
public class BasketServiceImpl implements BasketService {
	@Autowired
	private BasketMapper basketMapper;
	@Autowired
	private GoodsMapper goodsMapper;

	@Override
	public ServerResponse<BasketVo> add(Integer userId, Integer goodsId, Integer count) {
		// TODO Auto-generated method stub
		if(goodsId == null || count == null){
            return ServerResponse.createByErrorCodeMessage(ResponseCode.ILLEGAL_ARGUMENT.getCode(),ResponseCode.ILLEGAL_ARGUMENT.getDesc());
        }

		Goods goods=goodsMapper.selectByPrimaryKey(goodsId);
		if(goods==null)
			return ServerResponse.createByErrorCodeMessage(ResponseCode.ILLEGAL_ARGUMENT.getCode(), ResponseCode.ILLEGAL_ARGUMENT.getDesc());
        Basket basket = basketMapper.selectBasketByUserIdGoodsId(userId,goodsId);
        if(basket == null){
            //这个产品不在这个购物车里,需要新增一个这个产品的记录
            Basket basketItem = new Basket();
            basketItem.setQuantity(count);
            basketItem.setChecked(Const.Basket.CHECKED);
            basketItem.setGoodsId(goodsId);
            basketItem.setUserId(userId);
            basketMapper.insert(basketItem);
        }else{
            //这个产品已经在购物车里了.
            //如果产品已存在,数量相加
            count = basket.getQuantity() + count;
            basket.setQuantity(count);
            basketMapper.updateByPrimaryKeySelective(basket);
        }
        return this.list(userId);
	}

	@Override
	public ServerResponse<BasketVo> update(Integer userId, Integer goodsId, Integer count) {
		// TODO Auto-generated method stub
		if(goodsId == null || count == null){
            return ServerResponse.createByErrorCodeMessage(ResponseCode.ILLEGAL_ARGUMENT.getCode(),ResponseCode.ILLEGAL_ARGUMENT.getDesc());
        }
        Basket basket = basketMapper.selectBasketByUserIdGoodsId(userId,goodsId);
        if(basket != null){
            basket.setQuantity(count);
        }
        basketMapper.updateByPrimaryKey(basket);
        return this.list(userId);
	}

	@Override
	public ServerResponse<BasketVo> deleteGoods(Integer userId, String goodsIds) {
		// TODO Auto-generated method stub
		List<String> goodsList = Splitter.on(",").splitToList(goodsIds);
        if(CollectionUtils.isEmpty(goodsList)){
            return ServerResponse.createByErrorCodeMessage(ResponseCode.ILLEGAL_ARGUMENT.getCode(),ResponseCode.ILLEGAL_ARGUMENT.getDesc());
        }
        basketMapper.deleteByUserIdGoodsIds(userId,goodsList);
        return this.list(userId);
	}


	@Override
	public ServerResponse<BasketVo> selectOrUnSelect(Integer userId, Integer goodsId, int checked) {
		// TODO Auto-generated method stub
		 basketMapper.checkedOrUncheckedGoods(userId,goodsId,checked);
	       return this.list(userId);
	}

	@Override
	public ServerResponse<Integer> getBasketGoodsCount(Integer userId) {
		// TODO Auto-generated method stub
		if(userId == null){
            return ServerResponse.createBySuccess(0);
        }
        return ServerResponse.createBySuccess(basketMapper.selectBasketGoodsCount(userId));
	}

	@Override
	public ServerResponse<BasketVo> list(Integer userId) {
		// TODO Auto-generated method stub
		 BasketVo basketVo = this.getBasketVoLimit(userId);
	        return ServerResponse.createBySuccess(basketVo);
	}

	private BasketVo getBasketVoLimit(Integer userId) {
		// TODO Auto-generated method stub
		 BasketVo basketVo = new BasketVo();
	        List<Basket> basketList = basketMapper.selectBasketByUserId(userId);
	        List<BasketGoodsVo> basketGoodsVoList = Lists.newArrayList();

	        BigDecimal basketTotalPrice = new BigDecimal("0");

	        if(!CollectionUtils.isEmpty(basketList)){
	            for(Basket basketItem : basketList){
	                BasketGoodsVo basketGoodsVo = new BasketGoodsVo();
	                basketGoodsVo.setId(basketItem.getBasketId());
	                basketGoodsVo.setUserId(userId);
	                basketGoodsVo.setGoodsId(basketItem.getGoodsId());

	                Goods goods = goodsMapper.selectByPrimaryKey(basketItem.getGoodsId());
	                if(goods != null){
	                    basketGoodsVo.setGoodsImages(goods.getGoodsImages());
	                    basketGoodsVo.setGoodsName(goods.getGoodsName());
	                    basketGoodsVo.setGoodsSubName(goods.getGoodsSubname());
	                    basketGoodsVo.setStatus(goods.getStatus());
	                    basketGoodsVo.setGoodsPrice(goods.getGoodsPrice());
	                    basketGoodsVo.setStock(goods.getStock());
	                    //判断库存
	                    int buyLimitCount = 0;
	                    if(goods.getStock() >= basketItem.getQuantity()){
	                        //库存充足的时候
	                        buyLimitCount = basketItem.getQuantity();
	                        basketGoodsVo.setLimitQuantity(Const.Basket.LIMIT_NUM_SUCCESS);
	                    }else{
	                        buyLimitCount = goods.getStock();
	                        basketGoodsVo.setLimitQuantity(Const.Basket.LIMIT_NUM_FAIL);
	                        //购物车中更新有效库存
	                        Basket basketForQuantity = new Basket();
	                        basketForQuantity.setBasketId(basketItem.getBasketId());
	                        basketForQuantity.setQuantity(buyLimitCount);
	                        basketMapper.updateByPrimaryKeySelective(basketForQuantity);
	                    }
	                    basketGoodsVo.setQuantity(buyLimitCount);
	                    //计算总价
	                    basketGoodsVo.setGoodsTotalPrice(BigDecimalUtil.mul(goods.getGoodsPrice().doubleValue(),basketGoodsVo.getQuantity()));
	                    basketGoodsVo.setGoodsChecked(basketItem.getChecked());
	                }

	                if(basketItem.getChecked() == Const.Basket.CHECKED){
	                    //如果已经勾选,增加到整个的购物车总价中
	                    basketTotalPrice = BigDecimalUtil.add(basketTotalPrice.doubleValue(),basketGoodsVo.getGoodsTotalPrice().doubleValue());
	                }
	                basketGoodsVoList.add(basketGoodsVo);
	            }
	        }
	        basketVo.setBasketTotalPrice(basketTotalPrice);
	        basketVo.setBasketGoodsVoList(basketGoodsVoList);
	        basketVo.setAllChecked(this.getAllCheckedStatus(userId));
//	        basketVo.setImageHost(PropertiesUtil.getProperty("ftp.server.http.prefix"));

	        return basketVo;
	}

	private Boolean getAllCheckedStatus(Integer userId) {
		// TODO Auto-generated method stub
		if(userId == null){
            return false;
        }
        return basketMapper.selectBasketGoodsCheckedStatusByUserId(userId) == 0;
	}

}
