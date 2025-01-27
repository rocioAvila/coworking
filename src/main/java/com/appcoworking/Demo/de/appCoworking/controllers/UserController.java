package com.appcoworking.Demo.de.appCoworking.controllers;

import com.appcoworking.Demo.de.appCoworking.models.User;
import com.appcoworking.Demo.de.appCoworking.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private UserService userS;

    @PostMapping("/createUser")
    public ResponseEntity<User> createUser(@RequestBody User user){
        System.out.println("Usuario recibido: " + user);
        User savedUser = userS.createUser(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedUser);
    }

    @GetMapping("/allUsers")
    public ResponseEntity<List<User>> allUsers(){
        List<User> users = userS.allUsers();
        return ResponseEntity.status(HttpStatus.OK).body(users);
    }

    @PostMapping("/usersNames")
    public ResponseEntity<List<User>> usersForNames(@RequestBody String name){
        try{
            List<User> usersNames = userS.findUserName(name);

            for(User user : usersNames ){
                System.out.println(user.getNameUser());
            }

            if(usersNames.isEmpty()){
                return ResponseEntity.status(HttpStatus.NO_CONTENT).body(usersNames);
            }
            return ResponseEntity.status(HttpStatus.OK).body(usersNames);
        }catch (Exception e){
            System.out.println("list no");
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
    }
}
