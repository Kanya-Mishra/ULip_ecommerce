package com.ULip.ULip.controller;

import com.ULip.ULip.entities.Category;
import com.ULip.ULip.services.CategoryServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping()
public class CategoryController {
    @Autowired
    public CategoryServices categoryservices;

    @GetMapping("/api/category")
    public List<Category> getAllCategory(){
        return categoryservices.getAllCategory();
    }
}
