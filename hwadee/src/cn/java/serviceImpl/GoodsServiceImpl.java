package cn.java.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.google.common.collect.Lists;

import cn.java.common.Const;
import cn.java.common.ResponseCode;
import cn.java.common.ServerResponse;
import cn.java.entity.Category;
import cn.java.entity.Goods;
import cn.java.mapper.CategoryMapper;
import cn.java.mapper.GoodsMapper;
import cn.java.service.CategoryService;
import cn.java.service.GoodsService;
import cn.java.utils.PropertiesUtil;
import cn.java.vo.GoodsDetailVo;
import cn.java.vo.GoodsListVo;



@Service("goodsService")
public class GoodsServiceImpl implements GoodsService {
	@Autowired
	private GoodsMapper goodsMapper;
	
    @Autowired
    private CategoryMapper categoryMapper;

    @Autowired
    private CategoryService categoryService;
	@Override
	public ServerResponse saveOrUpdateGoods(Goods goods) {
		// TODO Auto-generated method stub
		if(goods != null)
        {
            if(StringUtils.isNotBlank(goods.getGoodsSubimages())){
                String[] subImageArray = goods.getGoodsSubimages().split(",");//根据逗号分离子图片
                if(subImageArray.length > 0){
                	 goods.setGoodsImages(subImageArray[0]);
                }
            }

            if(goods.getGoodsId() != null){
                int rowCount = goodsMapper.updateByPrimaryKeySelective(goods);
                if(rowCount > 0){
                    return ServerResponse.createBySuccess("更新产品成功");
                }
                return ServerResponse.createByErrorMessage("更新产品失败");
            }else{
                int rowCount = goodsMapper.insertSelective(goods);
                if(rowCount > 0){
                    return ServerResponse.createBySuccess("新增产品成功");
                }
                return ServerResponse.createByErrorMessage("更新产品失败");
            }
        }
        return ServerResponse.createByErrorMessage("新增或更新产品参数不正确");
	}

	@Override
	public ServerResponse setSaleStatus(Integer goodsId, Integer status) {
		// TODO Auto-generated method stub
		if(goodsId == null || status == null){
            return ServerResponse.createByErrorCodeMessage(ResponseCode.ILLEGAL_ARGUMENT.getCode(),ResponseCode.ILLEGAL_ARGUMENT.getDesc());
        }
        Goods goods = new Goods();
        goods.setGoodsId(goodsId);
        goods.setStatus(status);
        int rowCount = goodsMapper.updateByPrimaryKeySelective(goods);
        if(rowCount > 0){
            return ServerResponse.createBySuccess("修改产品销售状态成功");
        }
        return ServerResponse.createByErrorMessage("修改产品销售状态失败");
    }
	
	@Override
	public ServerResponse manageGoodsDetail(Integer GoodsId) {
		if(GoodsId == null){
            return ServerResponse.createByErrorCodeMessage(ResponseCode.ILLEGAL_ARGUMENT.getCode(),ResponseCode.ILLEGAL_ARGUMENT.getDesc());
        }
        Goods goods = goodsMapper.selectByPrimaryKey(GoodsId);
        if(goods == null){
            return ServerResponse.createByErrorMessage("产品已下架或者删除");
        }
        GoodsDetailVo goodsDetailVo = assembleGoodsDetailVo(goods);
        return ServerResponse.createBySuccess(goodsDetailVo);
	}
    private GoodsDetailVo assembleGoodsDetailVo(Goods Goods){
        GoodsDetailVo GoodsDetailVo = new GoodsDetailVo();
        GoodsDetailVo.setGoodsId(Goods.getGoodsId());
        GoodsDetailVo.setGoodsSubname(Goods.getGoodsSubname());
        GoodsDetailVo.setGoodsPrice(Goods.getGoodsPrice());
        GoodsDetailVo.setGoodsImages(Goods.getGoodsImages());
        GoodsDetailVo.setGoodsSubimages(Goods.getGoodsSubimages());
        GoodsDetailVo.setCategoryId(Goods.getCategoryId());
        GoodsDetailVo.setGoodsDetails(Goods.getGoodsDetails());
        GoodsDetailVo.setGoodsName(Goods.getGoodsName());
        GoodsDetailVo.setStatus(Goods.getStatus());
        GoodsDetailVo.setStock(Goods.getStock());

       /* GoodsDetailVo.setImageHost(PropertiesUtil.getProperty("ftp.server.http.prefix","http://img.happymmall.com/"));*/

        Category category = categoryMapper.selectByPrimaryKey(Goods.getCategoryId());
        if(category == null){
            GoodsDetailVo.setParentCategoryId(0);//默认根节点
        }else{
            GoodsDetailVo.setParentCategoryId(category.getParentId());
        }

//        GoodsDetailVo.setCreateTime(DateTimeUtil.dateToStr(Goods.getCreateTime()));
//        GoodsDetailVo.setUpdateTime(DateTimeUtil.dateToStr(Goods.getUpdateTime()));
        return GoodsDetailVo;
    }

	@Override
	public ServerResponse getGoodsList(int pageNum, int pageSize) {
		// TODO Auto-generated method stub
		//startPage--start
        //填充自己的sql查询逻辑
        //pageHelper-收尾
        PageHelper.startPage(pageNum,pageSize);
        List<Goods> goodsList = goodsMapper.selectList();
        System.out.println(goodsList);
        List<GoodsListVo> goodsListVoList = new ArrayList();
//        for(Goods goodsItem : goodsList){
//            GoodsListVo goodsListVo = assembleGoodsListVo(goodsItem);
//            goodsListVoList.add(goodsListVo);
//        }
        for (int i=0;i<goodsList.size();i++) {
        	GoodsListVo goodsListVo = assembleGoodsListVo(goodsList.get(i));
            goodsListVoList.add(goodsListVo);
		}
        PageInfo pageResult = new PageInfo(goodsList);
        pageResult.setList(goodsListVoList);
        return ServerResponse.createBySuccess(pageResult);
	}

	private GoodsListVo assembleGoodsListVo(Goods goods) {
		// TODO Auto-generated method stub
		 GoodsListVo goodsListVo = new GoodsListVo();
		 goodsListVo.setGoodsId(goods.getGoodsId());
		 goodsListVo.setGoodsName(goods.getGoodsName());
	        goodsListVo.setCategoryId(goods.getCategoryId());
//	        goodsListVo.setImageHost(PropertiesUtil.getProperty("ftp.server.http.prefix","http://img.happymmall.com/"));
	        goodsListVo.setGoodsImages(goods.getGoodsImages());
	        goodsListVo.setGoodsPrice(goods.getGoodsPrice());
	        goodsListVo.setGoodsSubname(goods.getGoodsSubname());
	        goodsListVo.setStatus(goods.getStatus());
	        return goodsListVo;
	}

	@Override
	public ServerResponse searchGoods(String goodsName, Integer goodsId, int pageNum, int pageSize) {
		// TODO Auto-generated method stub
		PageHelper.startPage(pageNum,pageSize);
        if(StringUtils.isNotBlank(goodsName)){
            goodsName = new StringBuilder().append("%").append(goodsName).append("%").toString();
        }
//        System.out.println(goodsName+"1");
//        System.out.println(goodsId+"1");
        List<Goods> goodsList = goodsMapper.selectByNameAndGoodsId(goodsName,goodsId);
        List<GoodsListVo> goodsListVoList = new ArrayList();
        for(Goods goodsItem : goodsList){
            GoodsListVo goodsListVo = assembleGoodsListVo(goodsItem);
            goodsListVoList.add(goodsListVo);
        }
        PageInfo pageResult = new PageInfo(goodsList);
        pageResult.setList(goodsListVoList);
        return ServerResponse.createBySuccess(pageResult);
	}

	@Override
	public ServerResponse<GoodsDetailVo> getGoodsDetail(Integer goodsId) {
		// TODO Auto-generated method stub
		if(goodsId == null){
            return ServerResponse.createByErrorCodeMessage(ResponseCode.ILLEGAL_ARGUMENT.getCode(),ResponseCode.ILLEGAL_ARGUMENT.getDesc());
        }
        Goods goods = goodsMapper.selectByPrimaryKey(goodsId);
        if(goods == null){
            return ServerResponse.createByErrorMessage("产品已下架或者删除");
        }
        if(goods.getStatus() != 1){
            return ServerResponse.createByErrorMessage("产品已下架或者删除");
        }
        GoodsDetailVo goodsDetailVo = assembleGoodsDetailVo(goods);
        return ServerResponse.createBySuccess(goodsDetailVo);
	}

	@Override
	public ServerResponse<PageInfo> getGoodsByKeywordCategory(String keyword, Integer categoryId, int pageNum,
			int pageSize, String orderBy) {
		// TODO Auto-generated method stub
		if(StringUtils.isBlank(keyword) && categoryId == null){
            return ServerResponse.createByErrorCodeMessage(ResponseCode.ILLEGAL_ARGUMENT.getCode(),ResponseCode.ILLEGAL_ARGUMENT.getDesc());
        }
        List<Integer> categoryIdList = new ArrayList<Integer>();

        if(categoryId != null){
            Category category = categoryMapper.selectByPrimaryKey(categoryId);
            if(category == null && StringUtils.isBlank(keyword)){
                //没有该分类,并且还没有关键字,这个时候返回一个空的结果集,不报错
                PageHelper.startPage(pageNum,pageSize);
                List<GoodsListVo> goodsListVoList = new ArrayList<GoodsListVo>();
                PageInfo pageInfo = new PageInfo(goodsListVoList);
                return ServerResponse.createBySuccess(pageInfo);
            }
            categoryIdList = categoryService.selectCategoryAndChildrenById(category.getCategoryId()).getData();
        }
        if(StringUtils.isNotBlank(keyword)){
            keyword = new StringBuilder().append("%").append(keyword).append("%").toString();
        }

        PageHelper.startPage(pageNum,pageSize);
        //排序处理
        if(StringUtils.isNotBlank(orderBy)){
            if(Const.GoodsListOrderBy.PRICE_ASC_DESC.contains(orderBy)){
                String[] orderByArray = orderBy.split("_");
                PageHelper.orderBy(orderByArray[0]+" "+orderByArray[1]);
            }
        }
        List<Goods> goodsList = goodsMapper.selectByNameAndCategoryIds(StringUtils.isBlank(keyword)?null:keyword,categoryIdList.size()==0?null:categoryIdList);

        List<GoodsListVo> goodsListVoList = Lists.newArrayList();
        for(Goods goods : goodsList){
            GoodsListVo goodsListVo = assembleGoodsListVo(goods);
            goodsListVoList.add(goodsListVo);
        }

        PageInfo pageInfo = new PageInfo(goodsList);
        pageInfo.setList(goodsListVoList);
        return ServerResponse.createBySuccess(pageInfo);
	}


}
