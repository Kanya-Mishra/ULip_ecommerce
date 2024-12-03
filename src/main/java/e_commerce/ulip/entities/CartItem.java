package e_commerce.ulip.entities;

import jakarta.persistence.Entity;

//@Entity
public class CartItem {
    private LipstickProduct lipstickproduct;
    private int quantity;

    // Getters and Setters
    public LipstickProduct getLipstickproduct() {
        return lipstickproduct;
    }

    public void setLipstickproduct(LipstickProduct lipstickproduct) {
        this.lipstickproduct = lipstickproduct;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
