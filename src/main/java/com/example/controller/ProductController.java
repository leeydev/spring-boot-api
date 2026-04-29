package com.example.controller;
import com.example.model.Product;
import com.example.service.ProductService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    private final ProductService service;
    
    public ProductController(ProductService service) { this.service = service; }
    
    @GetMapping public List<Product> getAll() { return service.getAll(); }
    @PostMapping public Product create(@RequestBody Product product) { return service.save(product); }
}
