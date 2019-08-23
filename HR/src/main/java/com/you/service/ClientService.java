package com.you.service;

import com.you.model.Client;

public interface ClientService {
    boolean addClient(Client client);//注册
    Client getCnameAndCPass(Client client);//登录
}
