package com.martinbove.jersyeExaple.domain.repository;

import com.martinbove.jersyeExaple.domain.Product;
import com.martinbove.jersyeExaple.persistence.entities.Producto;

import java.util.List;
import java.util.Optional;

public interface ProductRepository {
    List<Product> getAll();
    Optional<List<Product>> getByCategory(Integer categoryId);
    Optional<List<Product>> getScarceProducts(Integer quantity, Boolean estado);
    Optional<Product> getProduct(Integer productId);
    Product saveProduct(Product product);
    void deleteProduct(Integer productId);
}
