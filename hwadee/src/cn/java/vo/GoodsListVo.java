package cn.java.vo;

import java.math.BigDecimal;

public class GoodsListVo {
    private Integer  goodsId;
    private Integer categoryId;
    private String goodsName;
    private String goodsSubname;
    private String goodsImages;
    private String goodsSubimages;
    private String goodsDetails;
    private BigDecimal goodsPrice;
    private Integer stock;
    private Integer status;
    
    
    private String imageHost;
    private Integer parentCategoryId;
    
	public Integer getGoodsId() {
		return goodsId;
	}
	public void setGoodsId(Integer goodsId) {
		this.goodsId = goodsId;
	}
	public Integer getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}
	public String getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	public String getGoodsSubname() {
		return goodsSubname;
	}
	public void setGoodsSubname(String goodsSubname) {
		this.goodsSubname = goodsSubname;
	}
	public String getGoodsImages() {
		return goodsImages;
	}
	public void setGoodsImages(String goodsImages) {
		this.goodsImages = goodsImages;
	}
	public String getGoodsSubimages() {
		return goodsSubimages;
	}
	public void setGoodsSubimages(String goodsSubimages) {
		this.goodsSubimages = goodsSubimages;
	}
	public String getGoodsDetails() {
		return goodsDetails;
	}
	public void setGoodsDetails(String goodsDetails) {
		this.goodsDetails = goodsDetails;
	}
	public BigDecimal getGoodsPrice() {
		return goodsPrice;
	}
	public void setGoodsPrice(BigDecimal goodsPrice) {
		this.goodsPrice = goodsPrice;
	}
	public Integer getStock() {
		return stock;
	}
	public void setStock(Integer stock) {
		this.stock = stock;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Integer getParentCategoryId() {
		return parentCategoryId;
	}
	public void setParentCategoryId(Integer parentCategoryId) {
		this.parentCategoryId = parentCategoryId;
	}
	public String getImageHost() {
		return imageHost;
	}
	public void setImageHost(String imageHost) {
		this.imageHost = imageHost;
	}

}
