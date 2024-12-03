package e_commerce.ulip.service;

import e_commerce.ulip.entities.CartItem;
import e_commerce.ulip.entities.LipstickProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CartService {
//    @Autowired
    private final List<CartItem> cartItems = new ArrayList<>();

    public List<CartItem> getCartItems() {
        cartItems.forEach(item -> System.out.println(
                "Lipstick Name: " + (item.getLipstickproduct() != null ? item.getLipstickproduct().getName() : "null") +
                        ", Price: " + (item.getLipstickproduct() != null ? item.getLipstickproduct().getPrice() : "null") +
                        ", Quantity: " + item.getQuantity()
        ));
        return cartItems;
    }

    public double getCartTotal() {
        return cartItems.stream()
                .mapToDouble(item -> item.getLipstickproduct().getPrice() * item.getQuantity())
                .sum();
    }

    public void addToCart(LipstickProduct lipstickproduct, int quantity) {
        System.out.println("Adding product to cart: " + lipstickproduct.getName() + ", Quantity: " + quantity);
        for (CartItem item : cartItems) {
            if (item.getLipstickproduct().getId().equals(lipstickproduct.getId())) {
                item.setQuantity(item.getQuantity() + quantity);
                return;
            }
        }
        CartItem newItem = new CartItem();
        newItem.setLipstickproduct(lipstickproduct);
        newItem.setQuantity(quantity);
        cartItems.add(newItem);
    }

    public void updateCart(Long lipstickproductId, int quantity) {
        for (CartItem item : cartItems) {
            if (item.getLipstickproduct().getId().equals(lipstickproductId)) {
                item.setQuantity(quantity);
                return;
            }
        }
    }

    public void removeFromCart(Long lipstickproductId) {
        cartItems.removeIf(item -> item.getLipstickproduct().getId().equals(lipstickproductId));
    }
}
