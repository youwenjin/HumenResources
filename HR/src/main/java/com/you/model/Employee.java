package com.you.model;

import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;
//员工表
public class Employee implements Serializable {
    private Integer e_id;
    private String e_account;//登录号
    private String e_pass;
    private String e_name;//员工姓名
    private String e_sex;
    private String e_address;
    private String e_phone;
    private String e_debit;//银行卡号
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date e_enroll_date;//入职时间
    private int e_state;//工作状态
    private int e_salary;//薪水

    public Integer getE_id() {
        return e_id;
    }

    public void setE_id(Integer e_id) {
        this.e_id = e_id;
    }

    public String getE_account() {
        return e_account;
    }

    public void setE_account(String e_account) {
        this.e_account = e_account;
    }

    public String getE_pass() {
        return e_pass;
    }

    public void setE_pass(String e_pass) {
        this.e_pass = e_pass;
    }

    public String getE_name() {
        return e_name;
    }

    public void setE_name(String e_name) {
        this.e_name = e_name;
    }

    public String getE_sex() {
        return e_sex;
    }

    public void setE_sex(String e_sex) {
        this.e_sex = e_sex;
    }

    public String getE_address() {
        return e_address;
    }

    public void setE_address(String e_address) {
        this.e_address = e_address;
    }

    public String getE_phone() {
        return e_phone;
    }

    public void setE_phone(String e_phone) {
        this.e_phone = e_phone;
    }

    public String getE_debit() {
        return e_debit;
    }

    public void setE_debit(String e_debit) {
        this.e_debit = e_debit;
    }

    public Date getE_enroll_date() {
        return e_enroll_date;
    }

    public void setE_enroll_date(Date e_enroll_date) {
        this.e_enroll_date = e_enroll_date;
    }

    public int getE_state() {
        return e_state;
    }

    public void setE_state(int e_state) {
        this.e_state = e_state;
    }

    public int getE_salary() {
        return e_salary;
    }

    public void setE_salary(int e_salary) {
        this.e_salary = e_salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "e_id=" + e_id +
                ", e_account='" + e_account + '\'' +
                ", e_pass='" + e_pass + '\'' +
                ", e_name='" + e_name + '\'' +
                ", e_sex='" + e_sex + '\'' +
                ", e_address='" + e_address + '\'' +
                ", e_phone='" + e_phone + '\'' +
                ", e_debit='" + e_debit + '\'' +
                ", e_enroll_date=" + e_enroll_date +
                ", e_state=" + e_state +
                ", e_salary=" + e_salary +
                '}';
    }
}
