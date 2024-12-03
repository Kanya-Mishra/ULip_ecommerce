package e_commerce.ulip.controller;

import e_commerce.ulip.entities.LipstickProduct;
import e_commerce.ulip.entities.User;
import e_commerce.ulip.service.LipstickProductService;
import e_commerce.ulip.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
@Controller
public class LoginController {

    @Autowired
    private UserService userservice;

    // Display login page
    @GetMapping("/login")
    public String showLoginForm() {
        return "login"; // Points to login.jsp
    }

    // Handle login form submission
    @PostMapping("/login")
    public String loginUser(@RequestParam("email") String email,
                            @RequestParam("password") String password,
                            Model model) {
        User user = userservice.authenticateUser(email, password);

        if (user != null) {
            // Login successful
            model.addAttribute("successMessage", "Welcome, " + user.getUsername() + "!");
            return "redirect:/lipstickpage"; // Redirect to lipsticks page or dashboard
        } else {
            // Login failed
            model.addAttribute("errorMessage", "Invalid email or password!");
            return "login"; // Stay on login page with error message
        }
    }
}


