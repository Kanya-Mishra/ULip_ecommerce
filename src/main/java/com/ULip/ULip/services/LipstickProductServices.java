package com.ULip.ULip.services;

import com.ULip.ULip.entities.LipstickProduct;
import com.ULip.ULip.repository.LipstickProductRepository;
//import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class LipstickProductServices {

        @Autowired
        private LipstickProductRepository lipstickproductrepository;


        @Transactional(readOnly = true)
        public List<LipstickProduct> getAllProducts() {
            return lipstickproductrepository.findAll();
        }

        public LipstickProduct addProduct(LipstickProduct product) {
            return lipstickproductrepository.save(product);
        }

        public LipstickProduct getProductById(Long id) {
            return lipstickproductrepository.findById(id).orElse(null);
        }

        public void deleteProduct(Long id) {
            lipstickproductrepository.deleteById(id);
        }
}
