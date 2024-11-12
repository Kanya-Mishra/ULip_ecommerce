package com.ULip.ULip.controller;

import com.ULip.ULip.entities.Role;
import com.ULip.ULip.services.RoleServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class RoleController {
    @Autowired
    public RoleServices roleservices;

    @GetMapping("/role")
    public List<Role> getAllRole(){
        return roleservices.getAllRole();
    }
}
