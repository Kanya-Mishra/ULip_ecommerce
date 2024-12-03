package e_commerce.ulip.controller;

import e_commerce.ulip.entities.CartItem;
import e_commerce.ulip.entities.LipstickProduct;
import e_commerce.ulip.service.CartService;
import e_commerce.ulip.service.LipstickProductService;
import e_commerce.ulip.service.LipstickService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/cart")
public class CartController {

    @Autowired
    private CartService cartservice;

    @Autowired
    public LipstickProductService lipstickproductservice;

    @Autowired
    public CartController(LipstickProductService lipstickproductservice){
        this.lipstickproductservice = lipstickproductservice;
    }

    @GetMapping
    public String viewCart(Model model) {
        List<CartItem> items = cartservice.getCartItems();
        items.forEach(item -> System.out.println(
                "Product ID: " + (item.getLipstickproduct() != null ? item.getLipstickproduct().getId() : "null") +
                        ", Name: " + (item.getLipstickproduct() != null ? item.getLipstickproduct().getName() : "null") +
                        ", Price: " + (item.getLipstickproduct() != null ? item.getLipstickproduct().getPrice() : "null") +
                        ", Quantity: " + item.getQuantity()
        ));
        model.addAttribute("cartItems", items);
//        model.addAttribute("cartItems", cartservice.getCartItems());
        model.addAttribute("cartTotal", cartservice.getCartTotal());
        return "cart";
    }

    @PostMapping("/add")
    public String addToCart(@RequestParam Long lipstickId, @RequestParam int quantity) {
        LipstickProduct product = lipstickproductservice.getProductById(lipstickId);
        if (product != null) {
            cartservice.addToCart(product, quantity);
        }
        return "redirect:/cart";
    }

    @PostMapping("/update")
    public String updateCart(@RequestParam Long lipstickId, @RequestParam int quantity) {
        cartservice.updateCart(lipstickId, quantity);
        return "redirect:/cart";
    }

    @PostMapping("/remove")
    public String removeFromCart(@RequestParam Long lipstickId) {
        cartservice.removeFromCart(lipstickId);
        return "redirect:/cart";
    }
/*
    @GetMapping("/cart")
    public String CartDetails(Model model){
        List<LipstickProduct> lipstickproduct = lipstickproductservice.getAllProducts();
        model.addAttribute("cart", lipstickproduct);
        return "cart";
    }  */
}
