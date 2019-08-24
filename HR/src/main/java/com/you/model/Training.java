package com.you.model;

import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

//培训表
public class Training implements Serializable {
    private Integer a_id;
    private String a_title;//主题
    private String  a_context;//具体类容
    private int e_id;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date a_start_time;//开始时间
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date a_end_time;//结束时间
    private String a_address;//地点
    private int a_publish;//是否发布

    public Integer getA_id() {
        return a_id;
    }

    public void setA_id(Integer a_id) {
        this.a_id = a_id;
    }

    public String getA_title() {
        return a_title;
    }

    public void setA_title(String a_title) {
        this.a_title = a_title;
    }

    public String getA_context() {
        return a_context;
    }

    public void setA_context(String a_context) {
        this.a_context = a_context;
    }

    public int getE_id() {
        return e_id;
    }

    public void setE_id(int e_id) {
        this.e_id = e_id;
    }

    public Date getA_start_time() {
        return a_start_time;
    }

    public void setA_start_time(Date a_start_time) {
        this.a_start_time = a_start_time;
    }

    public Date getA_end_time() {
        return a_end_time;
    }

    public void setA_end_time(Date a_end_time) {
        this.a_end_time = a_end_time;
    }

    public String getA_address() {
        return a_address;
    }

    public void setA_address(String a_address) {
        this.a_address = a_address;
    }

    public int getA_publish() {
        return a_publish;
    }

    public void setA_publish(int a_publish) {
        this.a_publish = a_publish;
    }

    @Override
    public String toString() {
        return "Training{" +
                "a_id=" + a_id +
                ", a_title='" + a_title + '\'' +
                ", a_context='" + a_context + '\'' +
                ", e_id=" + e_id +
                ", a_start_time=" + a_start_time +
                ", a_end_time=" + a_end_time +
                ", a_address='" + a_address + '\'' +
                ", a_publish=" + a_publish +
                '}';
    }
}
