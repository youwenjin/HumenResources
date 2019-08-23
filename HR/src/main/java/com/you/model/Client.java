package com.you.model;

import java.io.Serializable;

public class Client implements Serializable {//游客
    private Integer c_id;
    private String c_name;//登录账号
    private String c_pass;

    public Integer getC_id() {
        return c_id;
    }

    public void setC_id(Integer c_id) {
        this.c_id = c_id;
    }

    public String getC_name() {
        return c_name;
    }

    public void setC_name(String c_name) {
        this.c_name = c_name;
    }

    public String getC_pass() {
        return c_pass;
    }

    public void setC_pass(String c_pass) {
        this.c_pass = c_pass;
    }

    @Override
    public String toString() {
        return "Client{" +
                "c_id=" + c_id +
                ", c_name='" + c_name + '\'' +
                ", c_pass='" + c_pass + '\'' +
                '}';
    }
}
