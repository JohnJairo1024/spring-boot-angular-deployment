package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoServiceImpl implements ProductoService {

    @Autowired
    private ProductoRepository repository;

    @Override
    public Producto create(Producto producto) {
        return repository.save(producto);
    }

    @Override
    public Producto delete(int id) {
        Producto producto = findById(id);
        if(producto != null){
            repository.delete(producto);
        }
        return producto;
    }

    @Override
    public List<Producto> findAll() {
        return repository.findAll();
    }

    @Override
    public Producto findById(int id) {
        return repository.findOne(id);
    }

    @Override
    public Producto update(Producto producto) {
        return null;
    }
}
