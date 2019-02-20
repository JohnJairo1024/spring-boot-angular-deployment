package com.example;

import java.util.List;

public interface ProductoService {

    Producto create(Producto producto);

    Producto delete(int id);

    List<Producto> findAll();

    Producto findById(int id);

    Producto update(Producto producto);
}
