package cn.java.entity;

public class BasketItem {
    private Integer basketItemId;

    private Integer basketId;

    private Integer basketGoodsId;

    private Integer basketGoodsCount;

    public Integer getBasketItemId() {
        return basketItemId;
    }

    public void setBasketItemId(Integer basketItemId) {
        this.basketItemId = basketItemId;
    }

    public Integer getBasketId() {
        return basketId;
    }

    public void setBasketId(Integer basketId) {
        this.basketId = basketId;
    }

    public Integer getBasketGoodsId() {
        return basketGoodsId;
    }

    public void setBasketGoodsId(Integer basketGoodsId) {
        this.basketGoodsId = basketGoodsId;
    }

    public Integer getBasketGoodsCount() {
        return basketGoodsCount;
    }

    public void setBasketGoodsCount(Integer basketGoodsCount) {
        this.basketGoodsCount = basketGoodsCount;
    }
}