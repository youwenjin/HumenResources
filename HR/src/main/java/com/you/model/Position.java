package com.you.model;

import java.io.Serializable;
//职位表
public class Position implements Serializable {

    private Integer p_id;
    private int d_id;//部门
    private int e_id;//员工
    private String p_name;//职位名称

    public Integer getP_id() {
        return p_id;
    }

    public void setP_id(Integer p_id) {
        this.p_id = p_id;
    }

    public int getD_id() {
        return d_id;
    }

    public void setD_id(int d_id) {
        this.d_id = d_id;
    }

    public int getE_id() {
        return e_id;
    }

    public void setE_id(int e_id) {
        this.e_id = e_id;
    }

    public String getP_name() {
        return p_name;
    }

    public void setP_name(String p_name) {
        this.p_name = p_name;
    }

    @Override
    public String toString() {
        return "Position{" +
                "p_id=" + p_id +
                ", d_id=" + d_id +
                ", e_id=" + e_id +
                ", p_name='" + p_name + '\'' +
                '}';
    }
}
