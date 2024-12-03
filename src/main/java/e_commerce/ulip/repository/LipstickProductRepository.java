package e_commerce.ulip.repository;

import e_commerce.ulip.entities.LipstickProduct;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LipstickProductRepository extends JpaRepository <LipstickProduct, Long> {
}
