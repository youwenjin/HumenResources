package com.you.service;

import com.you.model.Page;
import com.you.model.Recruit;

import java.util.List;

public interface RecruitService {//招聘
    boolean addRecruit(Recruit recruit);
    Recruit getRecById(int id);
    List<Recruit> getRecs();
    Page<Recruit> getRecruitByPage(int pageNo);//分页
}
