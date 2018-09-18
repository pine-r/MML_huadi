package cn.java.entity;

public class InteGoodsItem {
    private Integer inteGoodsItemId;

    private Integer inteGoodsId;

    private Float inteItemPrice;

    private Integer itemInventory;

    private String title;

    private String pics;

    public Integer getInteGoodsItemId() {
        return inteGoodsItemId;
    }

    public void setInteGoodsItemId(Integer inteGoodsItemId) {
        this.inteGoodsItemId = inteGoodsItemId;
    }

    public Integer getInteGoodsId() {
        return inteGoodsId;
    }

    public void setInteGoodsId(Integer inteGoodsId) {
        this.inteGoodsId = inteGoodsId;
    }

    public Float getInteItemPrice() {
        return inteItemPrice;
    }

    public void setInteItemPrice(Float inteItemPrice) {
        this.inteItemPrice = inteItemPrice;
    }

    public Integer getItemInventory() {
        return itemInventory;
    }

    public void setItemInventory(Integer itemInventory) {
        this.itemInventory = itemInventory;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPics() {
        return pics;
    }

    public void setPics(String pics) {
        this.pics = pics;
    }
}