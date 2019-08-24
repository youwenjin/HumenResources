package com.you.model;

import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;
//面试
public class Interview implements Serializable {
    private Integer i_id;
    private int r_id;   //简历id
    private int t_id;//招聘id
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm")
    private Date i_date;//面试时间
    private  int i_read;//是否以读
    private int i_accept;//是否面试
    private int i_agree;//是否同意参加面试

    public Integer getI_id() {
        return i_id;
    }

    public void setI_id(Integer i_id) {
        this.i_id = i_id;
    }

    public int getR_id() {
        return r_id;
    }

    public void setR_id(int r_id) {
        this.r_id = r_id;
    }

    public int getT_id() {
        return t_id;
    }

    public void setT_id(int t_id) {
        this.t_id = t_id;
    }

    public Date getI_date() {
        return i_date;
    }

    public void setI_date(Date i_date) {
        this.i_date = i_date;
    }

    public int getI_read() {
        return i_read;
    }

    public void setI_read(int i_read) {
        this.i_read = i_read;
    }

    public int getI_accept() {
        return i_accept;
    }

    public void setI_accept(int i_accept) {
        this.i_accept = i_accept;
    }

    public int getI_agree() {
        return i_agree;
    }

    public void setI_agree(int i_agree) {
        this.i_agree = i_agree;
    }

    @Override
    public String toString() {
        return "Interview{" +
                "i_id=" + i_id +
                ", r_id=" + r_id +
                ", t_id=" + t_id +
                ", i_date=" + i_date +
                ", i_read=" + i_read +
                ", i_accept=" + i_accept +
                ", i_agree=" + i_agree +
                '}';
    }
}
