package com.you.model;

import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;
//简历
public class Resume implements Serializable {
    private Integer r_id;
    private int c_id;//游客id
    private String r_name;
    private String r_sex;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date r_birth;
    private String r_address;
    private String r_school;//毕业学校
    private String r_education;//学历
    private String r_major;//所学专业
    private int r_salary;//期望薪水
    private String r_exprience;//个人经历

    public Integer getR_id() {
        return r_id;
    }

    public void setR_id(Integer r_id) {
        this.r_id = r_id;
    }

    public int getC_id() {
        return c_id;
    }

    public void setC_id(int c_id) {
        this.c_id = c_id;
    }

    public String getR_name() {
        return r_name;
    }

    public void setR_name(String r_name) {
        this.r_name = r_name;
    }

    public String getR_sex() {
        return r_sex;
    }

    public void setR_sex(String r_sex) {
        this.r_sex = r_sex;
    }

    public Date getR_birth() {
        return r_birth;
    }

    public void setR_birth(Date r_birth) {
        this.r_birth = r_birth;
    }

    public String getR_address() {
        return r_address;
    }

    public void setR_address(String r_address) {
        this.r_address = r_address;
    }

    public String getR_school() {
        return r_school;
    }

    public void setR_school(String r_school) {
        this.r_school = r_school;
    }

    public String getR_education() {
        return r_education;
    }

    public void setR_education(String r_education) {
        this.r_education = r_education;
    }

    public String getR_major() {
        return r_major;
    }

    public void setR_major(String r_major) {
        this.r_major = r_major;
    }

    public int getR_salary() {
        return r_salary;
    }

    public void setR_salary(int r_salary) {
        this.r_salary = r_salary;
    }

    public String getR_exprience() {
        return r_exprience;
    }

    public void setR_exprience(String r_exprience) {
        this.r_exprience = r_exprience;
    }

    @Override
    public String toString() {
        return "Resume{" +
                "r_id=" + r_id +
                ", c_id=" + c_id +
                ", r_name='" + r_name + '\'' +
                ", r_sex='" + r_sex + '\'' +
                ", r_birth=" + r_birth +
                ", r_address='" + r_address + '\'' +
                ", r_school='" + r_school + '\'' +
                ", r_education='" + r_education + '\'' +
                ", r_major='" + r_major + '\'' +
                ", r_salary=" + r_salary +
                ", r_exprience='" + r_exprience + '\'' +
                '}';
    }
}
