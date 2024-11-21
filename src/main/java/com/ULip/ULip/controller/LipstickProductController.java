package com.ULip.ULip.controller;

import com.ULip.ULip.entities.LipstickProduct;
import com.ULip.ULip.services.LipstickProductServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;

import java.util.List;

//@RestController
@Controller
public class LipstickProductController {
    @Autowired
    public LipstickProductServices lipstickproductservices;
/*
    @GetMapping("/api/lipstick")
    public List<LipstickProduct> getAllProducts()
    {
        return lipstickproductservices.getAllProducts();
    }
*/

    @GetMapping("/lipstick")
    public String showAllLipsticks(Model model) {
        List<LipstickProduct> lipstickproduct = lipstickproductservices.getAllProducts();
        model.addAttribute("Lipstick_Products_List", lipstickproduct);
        return "lipstickproduct";
}


    @PostMapping
    public LipstickProduct addProduct(@RequestBody LipstickProduct product) {
        return lipstickproductservices.addProduct(product);
    }

    @GetMapping("/{id}")
    public LipstickProduct getProductById(@PathVariable Long id) {
        return lipstickproductservices.getProductById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable Long id) {
        lipstickproductservices.deleteProduct(id);
    }
}
