package cn.java.vo;

import java.math.BigDecimal;
import java.util.List;
import cn.java.vo.*;

public class BasketVo {
	private List<BasketGoodsVo> basketGoodsVoList;
    private BigDecimal basketTotalPrice;
    private Boolean allChecked;//是否已经都勾选
    private String imageHost;

    public List<BasketGoodsVo> getGasketgoodsVoList() {
        return basketGoodsVoList;
    }

    public void setBasketGoodsVoList(List<BasketGoodsVo> basketGoodsVoList) {
        this.basketGoodsVoList = basketGoodsVoList;
    }

    public BigDecimal getBasketTotalPrice() {
        return basketTotalPrice;
    }

    public void setBasketTotalPrice(BigDecimal basketTotalPrice) {
        this.basketTotalPrice = basketTotalPrice;
    }

    public Boolean getAllChecked() {
        return allChecked;
    }

    public void setAllChecked(Boolean allChecked) {
        this.allChecked = allChecked;
    }

    public String getImageHost() {
        return imageHost;
    }

    public void setImageHost(String imageHost) {
        this.imageHost = imageHost;
    }

}
