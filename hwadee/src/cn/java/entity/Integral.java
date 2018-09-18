package cn.java.entity;

import java.util.Date;

public class Integral {
    private Integer inteChangeId;

    private Integer userId;

    private Integer consumeChangeId;

    private Integer inteChangeValue;

    private Date inteChangeTime;

    private String inteChangeReason;

    public Integer getInteChangeId() {
        return inteChangeId;
    }

    public void setInteChangeId(Integer inteChangeId) {
        this.inteChangeId = inteChangeId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getConsumeChangeId() {
        return consumeChangeId;
    }

    public void setConsumeChangeId(Integer consumeChangeId) {
        this.consumeChangeId = consumeChangeId;
    }

    public Integer getInteChangeValue() {
        return inteChangeValue;
    }

    public void setInteChangeValue(Integer inteChangeValue) {
        this.inteChangeValue = inteChangeValue;
    }

    public Date getInteChangeTime() {
        return inteChangeTime;
    }

    public void setInteChangeTime(Date inteChangeTime) {
        this.inteChangeTime = inteChangeTime;
    }

    public String getInteChangeReason() {
        return inteChangeReason;
    }

    public void setInteChangeReason(String inteChangeReason) {
        this.inteChangeReason = inteChangeReason;
    }
}