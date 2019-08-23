package com.you.service.Impl;

import com.you.dao.ClientDao;
import com.you.model.Client;
import com.you.service.ClientService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ClientServiceImpl implements ClientService {
    @Resource
    private ClientDao clientDao;

    public boolean addClient(Client client) {
        if(clientDao.queryClientName(client)){
            return false;
        }
        if (client!=null){
           return clientDao.addClient(client);
        }

        return false;
    }

    public Client getCnameAndCPass(Client client) {
        Client cnameAndCPass = clientDao.getCnameAndCPass(client);
        return cnameAndCPass;
    }
}
