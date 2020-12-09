package com.martinbove.jersyeExaple.web.controller;

import com.martinbove.jersyeExaple.domain.Product;
import com.martinbove.jersyeExaple.domain.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    public Optional<Product> getProduct(Integer productId) {
        return productService.getProduct(productId);
    }

    public Optional<List<Product>> getByCategory(Integer categoryId) {
        return productService.getByCategory(categoryId);
    }

    public Product saveProduct(Product product) {
        return productService.saveProduct(product);
    }

    public Optional<List<Product>> getScarceProducts(Integer quantity, Boolean estado) {
        return productService.getScarceProducts(quantity, estado);
    }

    public boolean deleteProduct(Integer productId) {
        return productService.deleteProduct(productId);
    }
}
