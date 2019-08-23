package com.you.dao;

import com.you.model.Recruit;

import java.util.List;

public interface RecruitDao {
    boolean addRecruit(Recruit recruit);
    Recruit getRecById(int id);
    List<Recruit> getRecs();
}
