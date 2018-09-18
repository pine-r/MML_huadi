package cn.java.entity;

public class Coupon {
    private Integer coupGoodsId;

    private Integer userId;

    private Float coupValue;

    public Integer getCoupGoodsId() {
        return coupGoodsId;
    }

    public void setCoupGoodsId(Integer coupGoodsId) {
        this.coupGoodsId = coupGoodsId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Float getCoupValue() {
        return coupValue;
    }

    public void setCoupValue(Float coupValue) {
        this.coupValue = coupValue;
    }
}