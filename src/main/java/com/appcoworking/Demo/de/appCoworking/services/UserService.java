package com.appcoworking.Demo.de.appCoworking.services;

import com.appcoworking.Demo.de.appCoworking.models.User;
import com.appcoworking.Demo.de.appCoworking.repositories.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.beans.Transient;

@Service
public class UserService {
    @Autowired
    private UserRepository userR;

    @Transactional
    public User createUser(User user){
        return userR.save(user);
    }
}
