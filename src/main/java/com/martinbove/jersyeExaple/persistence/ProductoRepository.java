package com.martinbove.jersyeExaple.persistence;

import com.martinbove.jersyeExaple.domain.Product;
import com.martinbove.jersyeExaple.domain.repository.ProductRepository;
import com.martinbove.jersyeExaple.persistence.crud.ProductoCrudRepository;
import com.martinbove.jersyeExaple.persistence.entities.Producto;
import com.martinbove.jersyeExaple.persistence.mapper.ProductMapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ProductoRepository implements ProductRepository {
    private ProductoCrudRepository productoCrudRepository;
    private ProductMapper mapper;

    @Override
    public List<Product> getAll() {
        List<Producto> productos = (List<Producto>) productoCrudRepository.findAll();
        return mapper.toProducts(productos);
    }

    @Override
    public Optional<List<Product>> getByCategory(Integer categoryId) {
        List<Producto> productos = productoCrudRepository.findByIdCategoria(categoryId);
        return Optional.of(mapper.toProducts(productos));
    }

    @Override
    public Optional<List<Product>> getScarceProducts(Integer quantity, Boolean estado) {
        Optional<List<Producto>> productos = productoCrudRepository.findByCantidadStockIsLessThanAndEstado(quantity, true);
        return productos.map(prods -> mapper.toProducts(prods));
    }

    @Override
    public Optional<Product> getProduct(Integer productId) {
        return Optional.empty();
    }

    @Override
    public Product saveProduct(Product product) {
        return null;
    }

    @Override
    public void deleteProduct(Integer productId) {

    }


    public Optional<Producto> getProducto(Integer idProducto) {
        return productoCrudRepository.findById(idProducto);
    }

    public Producto saveProducto(Producto producto) {
        return productoCrudRepository.save(producto);
    }

    public void deleProducto(Integer idProducto) {
        productoCrudRepository.deleteById(idProducto);
    }
}
