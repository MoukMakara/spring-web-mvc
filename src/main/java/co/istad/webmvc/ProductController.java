package co.istad.webmvc;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
@AllArgsConstructor
public class ProductController {
    private final List<Product> products;

    @GetMapping
    List<Product> getProducts() {
        return products;
    }
    @PostMapping
    List<Product> createProducts(@RequestBody Product product) {
        products.add(product);
        return products;
    }
}