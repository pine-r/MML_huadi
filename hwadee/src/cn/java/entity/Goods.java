package cn.java.entity;

import java.math.BigDecimal;

public class Goods {
    private Integer goodsId;

    private Integer categoryId;

    private Integer keyId;

    private String goodsSubname;

    private String goodsName;

    private BigDecimal goodsPrice;

    private Integer status;

    private Integer stock;

    private String goodsSubimages;

    private String goodsImages;

    private String goodsDetails;

    private String goodsTag;

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

    public Integer getKeyId() {
        return keyId;
    }

    public void setKeyId(Integer keyId) {
        this.keyId = keyId;
    }

    public String getGoodsSubname() {
        return goodsSubname;
    }

    public void setGoodsSubname(String goodsSubname) {
        this.goodsSubname = goodsSubname;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public BigDecimal getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(BigDecimal goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status2) {
        this.status = status2;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public String getGoodsSubimages() {
        return goodsSubimages;
    }

    public void setGoodsSubimages(String goodsSubimages) {
        this.goodsSubimages = goodsSubimages;
    }

    public String getGoodsImages() {
        return goodsImages;
    }

    public void setGoodsImages(String goodsImages) {
        this.goodsImages = goodsImages;
    }

    public String getGoodsDetails() {
        return goodsDetails;
    }

    public void setGoodsDetails(String goodsDetails) {
        this.goodsDetails = goodsDetails;
    }

    public String getGoodsTag() {
        return goodsTag;
    }

    public void setGoodsTag(String goodsTag) {
        this.goodsTag = goodsTag;
    }
}