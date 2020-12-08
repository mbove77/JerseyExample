package com.martinbove.jersyeExaple.persistence.crud;

import com.martinbove.jersyeExaple.persistence.entities.Producto;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {

    List<Producto> findByIdCategoria(Integer idCategoria);
    Optional<List<Producto>> findByCantidadStockIsLessThanAndEstado(Integer cantidadStock, Boolean estado);
}
