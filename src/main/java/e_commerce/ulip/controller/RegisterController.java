package e_commerce.ulip.controller;

import e_commerce.ulip.entities.LipstickProduct;
import e_commerce.ulip.entities.User;
import e_commerce.ulip.service.LipstickProductService;
import e_commerce.ulip.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class RegisterController {

    @Autowired
    public UserService userservice;

    @Autowired
    public RegisterController(UserService userservice){
        this.userservice = userservice;
    }

    @GetMapping("/register")
    public String showRegisterForm(Model model){
        model.addAttribute("user", new User());  // Adding an empty user object for binding form data
        return "register";
    }

    @PostMapping("/register")
    public String registerUser(@ModelAttribute User user, Model model) {
        // Check if passwords match
        if (!user.getPassword().equals(user.getConfirmPassword())) {
            model.addAttribute("errorMessage", "Passwords do not match!");
            return "register";
        }

        // Save user to the database
        try {
            userservice.registerUser(user);
            model.addAttribute("successMessage", "Registration successful! Please login.");
            return "login"; // Redirect to login page after successful registration
        } catch (Exception e) {
            model.addAttribute("errorMessage", "An error occurred during registration: " + e.getMessage());
            return "register";
        }
    }
}
