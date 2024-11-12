package com.ULip.ULip.services;

import com.ULip.ULip.entities.Role;
import com.ULip.ULip.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServices {
    @Autowired
    public RoleRepository rolerepository;

    public List<Role> getAllRole() {
        return rolerepository.findAll();
    }
}
