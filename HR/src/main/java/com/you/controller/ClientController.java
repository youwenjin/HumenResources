package com.you.controller;

import com.you.model.Client;
import com.you.service.ClientService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
public class ClientController {
    @Resource
    private ClientService clientService;

    @RequestMapping("register")
    private String register()throws Exception{
        return "register";
    }
    @RequestMapping("login")
    private String login()throws Exception{
        return "login";
    }
    @RequestMapping("register1")
    public String register1(HttpServletRequest request)throws Exception{
        String name = request.getParameter("name");
        String pass = request.getParameter("pass");
        Client client=new Client();
        client.setC_name(name);
        client.setC_pass(pass);
        boolean client1 = clientService.addClient(client);
        if (client1){
            request.setAttribute("register","true");
            return "login";
        }
        return "../../index";
    }
    @RequestMapping("login1")
    public String login1(HttpServletRequest request)throws Exception{
        String name = request.getParameter("name");
        String pass = request.getParameter("pass");
        Client client=new Client();
        client.setC_name(name);
        client.setC_pass(pass);
        Client client1 = clientService.getCnameAndCPass(client);
        if(null!=client1&&client1.getC_name()!=null){
            request.getSession().setAttribute("c",client);
            return "../../index";
        }else {
            return "login";
        }
    }
}
