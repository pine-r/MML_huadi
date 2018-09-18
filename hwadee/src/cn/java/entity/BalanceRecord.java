package cn.java.entity;

import java.util.Date;

public class BalanceRecord {
    private Integer balanceChangeId;

    private Integer userId;

    private Float balanceRecord;

    private Date balanceTime;

    public Integer getBalanceChangeId() {
        return balanceChangeId;
    }

    public void setBalanceChangeId(Integer balanceChangeId) {
        this.balanceChangeId = balanceChangeId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Float getBalanceRecord() {
        return balanceRecord;
    }

    public void setBalanceRecord(Float balanceRecord) {
        this.balanceRecord = balanceRecord;
    }

    public Date getBalanceTime() {
        return balanceTime;
    }

    public void setBalanceTime(Date balanceTime) {
        this.balanceTime = balanceTime;
    }
}