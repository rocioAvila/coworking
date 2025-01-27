package com.appcoworking.Demo.de.appCoworking.services;

import com.appcoworking.Demo.de.appCoworking.models.User;
import com.appcoworking.Demo.de.appCoworking.repositories.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.beans.Transient;
import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userR;

    @Transactional
    public User createUser(User user){
        if(user.getNameUser() != null){
            user.setNameUser(user.getNameUser().toLowerCase());
        }
        return userR.save(user);
    }

    public List<User> allUsers(){
        return userR.findAll();
    }

    public List<User> findUserName(String name){
        return userR.findUserForName(name);
    }
}
