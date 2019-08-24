package com.you.service.Impl;
import com.you.dao.ResumeDao;
import com.you.model.Resume;
import com.you.service.ResumeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ResumeServiceImpl implements ResumeService {
    @Resource
    private ResumeDao resumeDao;

    public boolean addResume(Resume resume) {
            if(resume==null){
                return false;
            }
            return resumeDao.addResume(resume);

    }
}
