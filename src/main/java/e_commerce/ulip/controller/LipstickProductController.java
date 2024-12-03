package e_commerce.ulip.controller;

import e_commerce.ulip.entities.LipstickProduct;
import e_commerce.ulip.service.CategoryService;
import e_commerce.ulip.service.LipstickProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
//@RestController
@Controller
public class LipstickProductController {
    @Autowired
    public LipstickProductService lipstickproductservice;

    @Autowired
    public LipstickProductController(LipstickProductService lipstickproductservice){
        this.lipstickproductservice = lipstickproductservice;
    }
/*    @GetMapping("/api/lipstickproduct")
    public List<LipstickProduct> getAllCategory(){
        return lipstickproductservice.getAllProducts();
    }
*/
    @GetMapping("/lipstickpage")
    public String showAllLipsticks(Model model) {
        List<LipstickProduct> lipstickproduct = lipstickproductservice.getAllProducts();
        model.addAttribute("lipstickproductpage", lipstickproduct);
        return "lipstickproductpage";
    }

    @PostMapping
    public LipstickProduct addProduct(@RequestBody LipstickProduct product) {
        return lipstickproductservice.addProduct(product);
    }

    @GetMapping("/lipstick-detail/{id}")
    public String getProductById(@PathVariable Long id,Model model) {
        LipstickProduct lipstickproduct = lipstickproductservice.getProductById(id);
        if (lipstickproduct == null) {
            return "error-page"; // Return an error page or redirect to a default page
        }
        model.addAttribute("lipstickproduct", lipstickproduct);
        return "lipstick-detail";
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable Long id) {
        lipstickproductservice.deleteProduct(id);
    }
}