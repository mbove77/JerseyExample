package com.martinbove.jersyeExaple.web.controller;

import com.martinbove.jersyeExaple.domain.Product;
import com.martinbove.jersyeExaple.domain.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/all")
    public List<Product> getAll() {
        return productService.getAll();
    }
    @GetMapping("/{id}")
    public Optional<Product> getProduct(@PathVariable("id") Integer productId) {
        return productService.getProduct(productId);
    }
    @GetMapping("/category/{id}")
    public Optional<List<Product>> getByCategory(@PathVariable("id") Integer categoryId) {
        return productService.getByCategory(categoryId);
    }
    @PostMapping("/save")
    public Product saveProduct(@RequestBody Product product) {
        return productService.saveProduct(product);
    }

    public Optional<List<Product>> getScarceProducts(Integer quantity, Boolean estado) {
        return productService.getScarceProducts(quantity, estado);
    }
    @DeleteMapping("/delete/{id}")
    public boolean deleteProduct(@PathVariable("id") Integer productId) {
        return productService.deleteProduct(productId);
    }
}
