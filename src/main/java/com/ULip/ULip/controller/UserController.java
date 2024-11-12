package com.ULip.ULip.controller;

import com.ULip.ULip.entities.User;
import com.ULip.ULip.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    public UserServices userservices;

    @GetMapping()
    public List<User> getAllUser(){
        return userservices.getAllUser();
    }
}
