package com.magicwithcode.thrillio.dao;

import com.magicwithcode.thrillio.DataStore;
import com.magicwithcode.thrillio.entities.User;

public class UserDao {

    public User[] getUsers(){
        return DataStore.getUsers();
    }

}
