package e_commerce.ulip.service;

import e_commerce.ulip.entities.Category;
import e_commerce.ulip.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    public CategoryRepository categoryrepository;

    public CategoryService(CategoryRepository categoryrepository){
        this.categoryrepository = categoryrepository;
    }

    public List<Category> getAllCategory() {
        return categoryrepository.findAll();
    }
}
