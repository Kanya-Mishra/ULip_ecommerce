package com.ULip.ULip.repository;

import com.ULip.ULip.entities.Category;
import com.ULip.ULip.entities.LipstickProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface LipstickProductRepository extends JpaRepository<LipstickProduct, Long> {
}
