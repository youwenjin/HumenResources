package com.you.dao;

import com.you.model.Client;

public interface ClientDao {
    boolean addClient(Client client);
    Client queryClientName(Client client);
    Client getCnameAndCPass(Client client);
}
