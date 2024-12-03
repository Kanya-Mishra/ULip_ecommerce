package e_commerce.ulip.controller;

import e_commerce.ulip.entities.Category;
import e_commerce.ulip.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
//@RestController
public class CategoryController {

    @Autowired
    public CategoryService categoryservice;

    @Autowired
    public CategoryController(CategoryService categoryservice){
        this.categoryservice = categoryservice;
    }
/*
    @GetMapping("/api/category")
    public List<Category> getAllCategory(){
        return categoryservice.getAllCategory();
    }  */

    @GetMapping("/category")
    public String getAllCategory(Model model){
        List<Category> categories = categoryservice.getAllCategory();
        model.addAttribute("categories", categories); // Add categories to the model
        return "categoryList";  // Return JSP name (without .jsp)
    }
}
