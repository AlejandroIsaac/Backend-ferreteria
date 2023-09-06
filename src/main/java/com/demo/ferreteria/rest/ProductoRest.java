package com.demo.ferreteria.rest;

import com.demo.ferreteria.modelo.Producto;
import com.demo.ferreteria.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/productos")
public class ProductoRest {

    //inyeccion de dependencias
    @Autowired
    private ProductoService productoService;
    /*Devuelve todos los productos*/
    @GetMapping
    private ResponseEntity<List<Producto>> getAllProductos(){

        return ResponseEntity.ok(productoService.findAll());
    }
    /*Devuelve un producto por id*/
    @GetMapping("/{id}")
    private ResponseEntity<Producto> getProductoById(@PathVariable Long id){
        System.out.println("*********REST::getProductoById**************");
        System.out.println("llega "+id);
        return ResponseEntity.ok(productoService.findById(id).get());
    }
    /*Devuelve los productos por categoria*/
    @GetMapping("/categoria/{idCategoria}")
    private ResponseEntity<List<Producto>> getProductoByIdCategoria(@PathVariable Long idCategoria){
        return ResponseEntity.ok(productoService.findAllByIdCategoria(idCategoria));
    }

}
