package e_commerce.ulip.service;

import e_commerce.ulip.entities.User;
import e_commerce.ulip.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.List;
@Service
public class UserService {

    @Autowired
    public UserRepository userrepository;
//    private final BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    @Autowired
    public UserService(UserRepository userrepository) {
        this.userrepository = userrepository;
    }

    public void registerUser(User user) {
    //    user.setPassword(passwordEncoder.encode(user.getPassword()));
        userrepository.save(user);          // Additional checks will be added in later stage (e.g., email already exists)
    }

    public List<User> getAllUser() {
        return userrepository.findAll();
    }

    public User authenticateUser(String email, String password) {
        User user = userrepository.findByEmail(email);
        if (user != null && user.getPassword().equals(password)) {
            return user; // Authentication successful
        }
        return null; // Authentication failed
    }
}
