package e_commerce.ulip.service;

import e_commerce.ulip.entities.LipstickProduct;
import e_commerce.ulip.repository.LipstickProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class LipstickProductService {

    @Autowired
    private LipstickProductRepository lipstickproductrepository;


    public List<LipstickProduct> getAllProducts() {
        return lipstickproductrepository.findAll();
    }

    public LipstickProduct addProduct(LipstickProduct product) {
        return lipstickproductrepository.save(product);
    }

    public LipstickProduct getProductById(Long id) {
        LipstickProduct product = lipstickproductrepository.findById(id).orElse(null);
        System.out.println("Retrieved Product: " + (product != null ? product.getName() : "null"));
        return product;
//        return lipstickproductrepository.findById(id).orElse(null);
    }

    public void deleteProduct(Long id) {
        lipstickproductrepository.deleteById(id);
    }
}
