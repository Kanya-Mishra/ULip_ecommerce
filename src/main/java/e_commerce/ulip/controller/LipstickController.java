package e_commerce.ulip.controller;

import e_commerce.ulip.entities.Lipstick;
import e_commerce.ulip.service.LipstickService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
//@RestController
public class LipstickController {
    @Autowired
    public LipstickService lipstickservice;

    @Autowired
    public LipstickController(LipstickService lipstickservice){
        this.lipstickservice = lipstickservice;
    }

    @GetMapping("/lipstickTest")
    public String TestAllLipsticks(Model model) {
        List<Lipstick> lipsticks = lipstickservice.getAllLipsticks();
        model.addAttribute("userlist", lipsticks);
        System.out.println("Model attribute userlist: " + lipsticks);
        return "userlist";
    }

/*    @GetMapping("/lipstickTest")
    public List<Lipstick> TestAllLipsticks(Model model){
        return lipstickservice.getAllLipsticks();
    } */
}
