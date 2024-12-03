package e_commerce.ulip.controller;

import e_commerce.ulip.entities.User;
import e_commerce.ulip.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
//@RestController
@Controller
public class UserController {

    @Autowired
    public UserService userservice;

    public UserController(UserService userservice) {
        this.userservice = userservice;
    }
/*
    @GetMapping("/api/user")
    public List<User> getAllUser() {
        return userservice.getAllUser();
    }
*/
    @GetMapping("/users")
    public String getUsers(Model model) {
        List<User> users = userservice.getAllUser();
        model.addAttribute("users", users);
        return "users";
    }
}

