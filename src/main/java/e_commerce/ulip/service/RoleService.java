package e_commerce.ulip.service;

import e_commerce.ulip.entities.Role;
import e_commerce.ulip.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RoleService {

    @Autowired
    public RoleRepository rolerepository;

    public RoleService(RoleRepository rolerepository){
        this.rolerepository = rolerepository;
    }

    public List<Role> getAllRole() {
        return rolerepository.findAll();
    }
}
