package com.ULip.ULip.services;

import com.ULip.ULip.entities.Category;
import com.ULip.ULip.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServices {
    @Autowired
    public CategoryRepository categoryrepository;

    public List<Category> getAllCategory() {
        return categoryrepository.findAll();
    }
}
