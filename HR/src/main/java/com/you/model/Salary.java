package com.you.model;

import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;
//工资表
public class Salary implements Serializable {
    private Integer s_id;
    private int e_id;//员工id
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date s_date;//结算日期
    private int s_performance;//绩效奖金
    private int s_extra;//加班费用
    private int s_insurance;//社保
    private int s_total;//总计
    private int s_trouble;//附议状态
    private int s_reward;//奖罚费用

    public Integer getS_id() {
        return s_id;
    }

    public void setS_id(Integer s_id) {
        this.s_id = s_id;
    }

    public int getE_id() {
        return e_id;
    }

    public void setE_id(int e_id) {
        this.e_id = e_id;
    }

    public Date getS_date() {
        return s_date;
    }

    public void setS_date(Date s_date) {
        this.s_date = s_date;
    }

    public int getS_performance() {
        return s_performance;
    }

    public void setS_performance(int s_performance) {
        this.s_performance = s_performance;
    }

    public int getS_extra() {
        return s_extra;
    }

    public void setS_extra(int s_extra) {
        this.s_extra = s_extra;
    }

    public int getS_insurance() {
        return s_insurance;
    }

    public void setS_insurance(int s_insurance) {
        this.s_insurance = s_insurance;
    }

    public int getS_total() {
        return s_total;
    }

    public void setS_total(int s_total) {
        this.s_total = s_total;
    }

    public int getS_trouble() {
        return s_trouble;
    }

    public void setS_trouble(int s_trouble) {
        this.s_trouble = s_trouble;
    }

    public int getS_reward() {
        return s_reward;
    }

    public void setS_reward(int s_reward) {
        this.s_reward = s_reward;
    }

    @Override
    public String toString() {
        return "Salary{" +
                "s_id=" + s_id +
                ", e_id=" + e_id +
                ", s_date=" + s_date +
                ", s_performance=" + s_performance +
                ", s_extra=" + s_extra +
                ", s_insurance=" + s_insurance +
                ", s_total=" + s_total +
                ", s_trouble=" + s_trouble +
                ", s_reward=" + s_reward +
                '}';
    }
}
