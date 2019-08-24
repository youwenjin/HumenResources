package com.you.model;

import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;
//部门
public class Department implements Serializable {
    private Integer d_id;
    private String d_name;//部门名称
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date d_date;//创建时间

    public Integer getD_id() {
        return d_id;
    }

    public void setD_id(Integer d_id) {
        this.d_id = d_id;
    }

    public String getD_name() {
        return d_name;
    }

    public void setD_name(String d_name) {
        this.d_name = d_name;
    }

    public Date getD_date() {
        return d_date;
    }

    public void setD_date(Date d_date) {
        this.d_date = d_date;
    }

    @Override
    public String toString() {
        return "Department{" +
                "d_id=" + d_id +
                ", d_name='" + d_name + '\'' +
                ", d_date=" + d_date +
                '}';
    }
}
