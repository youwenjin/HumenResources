package com.you.model;

import java.util.Date;

public class Reward {//奖罚表
    private Integer w_id;
    private int e_id;//员工id
    private Date w_date;//时间
    private String w_reason;//原因
    private int w_money;//金额

    public Integer getW_id() {
        return w_id;
    }

    public void setW_id(Integer w_id) {
        this.w_id = w_id;
    }

    public int getE_id() {
        return e_id;
    }

    public void setE_id(int e_id) {
        this.e_id = e_id;
    }

    public Date getW_date() {
        return w_date;
    }

    public void setW_date(Date w_date) {
        this.w_date = w_date;
    }

    public String getW_reason() {
        return w_reason;
    }

    public void setW_reason(String w_reason) {
        this.w_reason = w_reason;
    }

    public int getW_money() {
        return w_money;
    }

    public void setW_money(int w_money) {
        this.w_money = w_money;
    }

    @Override
    public String toString() {
        return "Reward{" +
                "w_id=" + w_id +
                ", e_id=" + e_id +
                ", w_date=" + w_date +
                ", w_reason='" + w_reason + '\'' +
                ", w_money=" + w_money +
                '}';
    }
}
