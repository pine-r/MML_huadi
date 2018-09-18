package cn.java.vo;

import java.math.BigDecimal;

public class BasketGoodsVo {
	private Integer id;
    private Integer userId;
    private Integer goodsId;
    private Integer quantity;//购物车中此商品的数量
    private String goodsName;
    private String goodsSubName;
    private String goodsImages;
    private BigDecimal goodsPrice;
    private Integer Status;
    private BigDecimal goodsTotalPrice;
    private Integer Stock;
    private Integer goodsChecked;//此商品是否勾选

    public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getGoodsId() {
		return goodsId;
	}

	public void setGoodsId(Integer goodsId) {
		this.goodsId = goodsId;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public String getGoodsName() {
		return goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public String getGoodsSubName() {
		return goodsSubName;
	}

	public void setGoodsSubName(String goodsSubName) {
		this.goodsSubName = goodsSubName;
	}

	public String getGoodsImages() {
		return goodsImages;
	}

	public void setGoodsImages(String goodsImages) {
		this.goodsImages = goodsImages;
	}

	public BigDecimal getGoodsPrice() {
		return goodsPrice;
	}

	public void setGoodsPrice(BigDecimal goodsPrice) {
		this.goodsPrice = goodsPrice;
	}

	public Integer getStatus() {
		return Status;
	}

	public void setStatus(Integer status) {
		Status = status;
	}

	public BigDecimal getGoodsTotalPrice() {
		return goodsTotalPrice;
	}

	public void setGoodsTotalPrice(BigDecimal goodsTotalPrice) {
		this.goodsTotalPrice = goodsTotalPrice;
	}

	public Integer getStock() {
		return Stock;
	}

	public void setStock(Integer stock) {
		Stock = stock;
	}

	public Integer getGoodsChecked() {
		return goodsChecked;
	}

	public void setGoodsChecked(Integer goodsChecked) {
		this.goodsChecked = goodsChecked;
	}

	public String getLimitQuantity() {
		return limitQuantity;
	}

	public void setLimitQuantity(String limitQuantity) {
		this.limitQuantity = limitQuantity;
	}

	private String limitQuantity;//限制数量的一个返回结果

}
