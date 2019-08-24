package com.you.service.Impl;

import com.you.dao.RecruitDao;
import com.you.model.Page;
import com.you.model.Recruit;
import com.you.service.RecruitService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class RecruitServiceImpl implements RecruitService {
    @Resource
    private RecruitDao recruitDao;

    public boolean addRecruit(Recruit recruit) {
        if (recruit==null){
            return false;
        }
        return recruitDao.addRecruit(recruit);
    }

    public Recruit getRecById(int id) {
        if (id==0){
            return null;
        }
        return recruitDao.getRecById(id);

    }

    public List<Recruit> getRecs() {
        List<Recruit> recs = recruitDao.getRecs();
        if(recs.size()!=0&&recs!=null){
            return recs;
        }
        return null;
    }

    public Page<Recruit> getRecruitByPage(int pageNo) {
        Page page=new Page();
        int totalRows = recruitDao.getTotalRows();
        int start=(pageNo-1)*page.getPageSize();
        int end=page.getPageSize();
        List<Recruit> testByPage = recruitDao.getRecruitByPage( start, end );
        page.setPageNo(pageNo);
        page.setTotalRows(totalRows);
        page.setList(testByPage);
        return page;
    }
}
