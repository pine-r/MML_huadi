package cn.java.entity;

import java.util.Date;

public class InteGoods {
    private Integer inteGoodsId;

    private Integer keyId;

    private String goodsName;

    private Float initGoodsPrice;

    private Integer salVolume;

    private String goodsImages;

    private String goodsDetails;

    private Date goodsProDate;

    private Integer goodsGuPe;

    private String goodsTag;

    public Integer getInteGoodsId() {
        return inteGoodsId;
    }

    public void setInteGoodsId(Integer inteGoodsId) {
        this.inteGoodsId = inteGoodsId;
    }

    public Integer getKeyId() {
        return keyId;
    }

    public void setKeyId(Integer keyId) {
        this.keyId = keyId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public Float getInitGoodsPrice() {
        return initGoodsPrice;
    }

    public void setInitGoodsPrice(Float initGoodsPrice) {
        this.initGoodsPrice = initGoodsPrice;
    }

    public Integer getSalVolume() {
        return salVolume;
    }

    public void setSalVolume(Integer salVolume) {
        this.salVolume = salVolume;
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

    public Date getGoodsProDate() {
        return goodsProDate;
    }

    public void setGoodsProDate(Date goodsProDate) {
        this.goodsProDate = goodsProDate;
    }

    public Integer getGoodsGuPe() {
        return goodsGuPe;
    }

    public void setGoodsGuPe(Integer goodsGuPe) {
        this.goodsGuPe = goodsGuPe;
    }

    public String getGoodsTag() {
        return goodsTag;
    }

    public void setGoodsTag(String goodsTag) {
        this.goodsTag = goodsTag;
    }
}