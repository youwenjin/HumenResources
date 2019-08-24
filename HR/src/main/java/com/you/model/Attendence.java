package com.you.model;

import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;
//考勤表
public class Attendence implements Serializable {
    private Integer k_id;
    private  int e_id;//员工
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date k_start_time;//上班打卡
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")//精确至分秒
    private Date k_end_time;//下班打卡

    public Integer getK_id() {
        return k_id;
    }

    public void setK_id(Integer k_id) {
        this.k_id = k_id;
    }

    public int getE_id() {
        return e_id;
    }

    public void setE_id(int e_id) {
        this.e_id = e_id;
    }

    public Date getK_start_time() {
        return k_start_time;
    }

    public void setK_start_time(Date k_start_time) {
        this.k_start_time = k_start_time;
    }

    public Date getK_end_time() {
        return k_end_time;
    }

    public void setK_end_time(Date k_end_time) {
        this.k_end_time = k_end_time;
    }

    @Override
    public String toString() {
        return "Attendence{" +
                "k_id=" + k_id +
                ", e_id=" + e_id +
                ", k_start_time=" + k_start_time +
                ", k_end_time=" + k_end_time +
                '}';
    }
}
