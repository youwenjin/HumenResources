package com.you.model;

import java.io.Serializable;
//管理员
public class Manager implements Serializable {
    private Integer m_id;
    private  String m_name;//登录帐号
    private String m_pass;

    public Integer getM_id() {
        return m_id;
    }

    public void setM_id(Integer m_id) {
        this.m_id = m_id;
    }

    public String getM_name() {
        return m_name;
    }

    public void setM_name(String m_name) {
        this.m_name = m_name;
    }

    public String getM_pass() {
        return m_pass;
    }

    public void setM_pass(String m_pass) {
        this.m_pass = m_pass;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "m_id=" + m_id +
                ", m_name='" + m_name + '\'' +
                ", m_pass='" + m_pass + '\'' +
                '}';
    }
}
