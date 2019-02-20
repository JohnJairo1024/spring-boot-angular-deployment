package com.example;

import org.springframework.data.repository.Repository;

import java.util.List;

public interface ProductoRepository extends Repository<Producto, Integer> {

    void delete(Producto producto);

    List<Producto> findAll();

    Producto findOne(int id);

    Producto save(Producto producto);
}
