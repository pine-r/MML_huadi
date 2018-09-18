package cn.java.entity;

public class OrderDetail {
    private Integer orderGoodsItemId;

    private Integer orderGoodsId;

    private Integer goodsNum;

    private Float goodsPrices;

    public Integer getOrderGoodsItemId() {
        return orderGoodsItemId;
    }

    public void setOrderGoodsItemId(Integer orderGoodsItemId) {
        this.orderGoodsItemId = orderGoodsItemId;
    }

    public Integer getOrderGoodsId() {
        return orderGoodsId;
    }

    public void setOrderGoodsId(Integer orderGoodsId) {
        this.orderGoodsId = orderGoodsId;
    }

    public Integer getGoodsNum() {
        return goodsNum;
    }

    public void setGoodsNum(Integer goodsNum) {
        this.goodsNum = goodsNum;
    }

    public Float getGoodsPrices() {
        return goodsPrices;
    }

    public void setGoodsPrices(Float goodsPrices) {
        this.goodsPrices = goodsPrices;
    }
}