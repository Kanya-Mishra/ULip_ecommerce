package e_commerce.ulip.controller;

import e_commerce.ulip.entities.Role;
import e_commerce.ulip.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
@Controller
public class RoleController {

    @Autowired
    public RoleService roleservice;

    public RoleController(RoleService roleservice){
        this.roleservice = roleservice;
    }

    @GetMapping("/role")
    public List<Role> getAllRole(){
        return roleservice.getAllRole();
    }
}
