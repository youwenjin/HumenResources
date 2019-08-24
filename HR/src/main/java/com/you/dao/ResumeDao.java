package com.you.dao;

import com.you.model.Resume;

import java.util.List;

public interface ResumeDao {
    boolean addResume(Resume resume);
    boolean deleteResume(int id);
    boolean updateResume(Resume resume);
    List<Resume> findResume(Resume resume);
}
