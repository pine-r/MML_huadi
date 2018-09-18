package cn.java.entity;

public class GoodsWithBLOBs extends Goods {
    private String goodsSubimages;

    private String goodsDetails;

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
}