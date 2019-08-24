package com.you.controller;

import com.you.model.Page;
import com.you.model.Recruit;
import com.you.service.RecruitService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class RecruitController {
    @Resource
    private RecruitService recruitService;

    @RequestMapping("recruit")
    public String queryRecruitAll(HttpServletRequest request)throws Exception{
        String pageNoStr = request.getParameter("pageNo");
        int pageNo=1;
        if(pageNoStr!=null&&!"".equals(pageNoStr)){
            pageNo=Integer.parseInt(pageNoStr);
            if(pageNo<1){
                pageNo=1;
            }
        }
        Page<Recruit> recruitPage = recruitService.getRecruitByPage( pageNo);
        request.getSession().setAttribute("recruitPage",recruitPage);

        return "../../index";
    }
}
