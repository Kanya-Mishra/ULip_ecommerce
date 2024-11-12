package com.ULip.ULip.services;

import com.ULip.ULip.entities.User;
import com.ULip.ULip.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServices {
    @Autowired
    public UserRepository userrepository;

    public List<User> getAllUser() {
        return userrepository.findAll();
    }
}
