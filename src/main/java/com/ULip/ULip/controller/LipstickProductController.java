package com.ULip.ULip.controller;

import com.ULip.ULip.entities.LipstickProduct;
import com.ULip.ULip.services.LipstickProductServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/lipstick")
public class LipstickProductController {
    @Autowired
    public LipstickProductServices lipstickproductservices;

    @GetMapping()
    public List<LipstickProduct> getAllProducts()
    {
        return lipstickproductservices.getAllProducts();
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
