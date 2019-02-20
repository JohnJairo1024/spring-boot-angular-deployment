package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/api"})
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    @PostMapping
    public Producto create(@RequestBody Producto producto){
        return productoService.create(producto);
    }

    @GetMapping(path = {"/{id}"})
    public Producto findOne(@PathVariable("id") int id){
        return productoService.findById(id);
    }

    @PutMapping
    public Producto update(@RequestBody Producto producto){
        return productoService.update(producto);
    }

    @DeleteMapping(path ={"/{id}"})
    public Producto delete(@PathVariable("id") int id) {
        return productoService.delete(id);
    }

    @GetMapping
    public List<Producto> findAll(){
        return productoService.findAll();
    }
}
