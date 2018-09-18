package cn.java.entity;

import java.util.Date;

public class OrderRecord {
    private Integer orderId;

    private Integer topicId;

    private Integer shipMethodId;

    private Integer userId;

    private Integer payMethodId;

    private Integer useUserId;

    private Date orderTime;

    private Float orderTotMoney;

    private String distNumb;

    private String payNumb;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getTopicId() {
        return topicId;
    }

    public void setTopicId(Integer topicId) {
        this.topicId = topicId;
    }

    public Integer getShipMethodId() {
        return shipMethodId;
    }

    public void setShipMethodId(Integer shipMethodId) {
        this.shipMethodId = shipMethodId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getPayMethodId() {
        return payMethodId;
    }

    public void setPayMethodId(Integer payMethodId) {
        this.payMethodId = payMethodId;
    }

    public Integer getUseUserId() {
        return useUserId;
    }

    public void setUseUserId(Integer useUserId) {
        this.useUserId = useUserId;
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public Float getOrderTotMoney() {
        return orderTotMoney;
    }

    public void setOrderTotMoney(Float orderTotMoney) {
        this.orderTotMoney = orderTotMoney;
    }

    public String getDistNumb() {
        return distNumb;
    }

    public void setDistNumb(String distNumb) {
        this.distNumb = distNumb;
    }

    public String getPayNumb() {
        return payNumb;
    }

    public void setPayNumb(String payNumb) {
        this.payNumb = payNumb;
    }
}