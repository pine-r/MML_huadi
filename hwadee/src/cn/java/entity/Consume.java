package cn.java.entity;

import java.util.Date;

public class Consume {
    private Integer consumeChangeId;

    private Integer userId;

    private Integer inteChangeId;

    private String consumeOrderId;

    private Float consumeMoney;

    private Date consumeTime;

    public Integer getConsumeChangeId() {
        return consumeChangeId;
    }

    public void setConsumeChangeId(Integer consumeChangeId) {
        this.consumeChangeId = consumeChangeId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getInteChangeId() {
        return inteChangeId;
    }

    public void setInteChangeId(Integer inteChangeId) {
        this.inteChangeId = inteChangeId;
    }

    public String getConsumeOrderId() {
        return consumeOrderId;
    }

    public void setConsumeOrderId(String consumeOrderId) {
        this.consumeOrderId = consumeOrderId;
    }

    public Float getConsumeMoney() {
        return consumeMoney;
    }

    public void setConsumeMoney(Float consumeMoney) {
        this.consumeMoney = consumeMoney;
    }

    public Date getConsumeTime() {
        return consumeTime;
    }

    public void setConsumeTime(Date consumeTime) {
        this.consumeTime = consumeTime;
    }
}