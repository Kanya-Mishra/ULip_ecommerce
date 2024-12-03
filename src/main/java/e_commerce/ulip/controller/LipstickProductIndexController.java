package e_commerce.ulip.controller;

import e_commerce.ulip.entities.LipstickProduct;
import e_commerce.ulip.service.LipstickProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class LipstickProductIndexController {

    @Autowired
    public LipstickProductService lipstickproductservice;
    @GetMapping("/lipstickindex")
    public String indexsHomePage(Model model){
        List<LipstickProduct> lipstickproduct = lipstickproductservice.getAllProducts();
        model.addAttribute("lipstickproductindex", lipstickproduct);
        return "lipstickproductindex";
    }
}
