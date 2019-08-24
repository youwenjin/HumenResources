package com.you.model;

import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;
//招聘
public class Recruit implements Serializable {
    private Integer t_id;
    private int p_id;//职位id
    private String t_title;//主题
    private String t_introduaction;//职位描述
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm")
    private Date t_publish_time;//发布时间
    private String t_address;//工作地址
    private int t_salary;
    private int e_id;//员工id
    private int t_draft;//是否存为草稿
    private int t_publish;//是否发布

    public Integer getT_id() {
        return t_id;
    }

    public void setT_id(Integer t_id) {
        this.t_id = t_id;
    }

    public int getP_id() {
        return p_id;
    }

    public void setP_id(int p_id) {
        this.p_id = p_id;
    }

    public String getT_title() {
        return t_title;
    }

    public void setT_title(String t_title) {
        this.t_title = t_title;
    }

    public String getT_introduaction() {
        return t_introduaction;
    }

    public void setT_introduaction(String t_introduaction) {
        this.t_introduaction = t_introduaction;
    }

    public Date getT_publish_time() {
        return t_publish_time;
    }

    public void setT_publish_time(Date t_publish_time) {
        this.t_publish_time = t_publish_time;
    }

    public String getT_address() {
        return t_address;
    }

    public void setT_address(String t_address) {
        this.t_address = t_address;
    }

    public int getT_salary() {
        return t_salary;
    }

    public void setT_salary(int t_salary) {
        this.t_salary = t_salary;
    }

    public int getE_id() {
        return e_id;
    }

    public void setE_id(int e_id) {
        this.e_id = e_id;
    }

    public int getT_draft() {
        return t_draft;
    }

    public void setT_draft(int t_draft) {
        this.t_draft = t_draft;
    }

    public int getT_publish() {
        return t_publish;
    }

    public void setT_publish(int t_publish) {
        this.t_publish = t_publish;
    }

    @Override
    public String toString() {
        return "Recruit{" +
                "t_id=" + t_id +
                ", p_id=" + p_id +
                ", t_title='" + t_title + '\'' +
                ", t_introduaction='" + t_introduaction + '\'' +
                ", t_publish_time=" + t_publish_time +
                ", t_address='" + t_address + '\'' +
                ", t_salary=" + t_salary +
                ", e_id=" + e_id +
                ", t_draft=" + t_draft +
                ", t_publish=" + t_publish +
                '}';
    }
}
