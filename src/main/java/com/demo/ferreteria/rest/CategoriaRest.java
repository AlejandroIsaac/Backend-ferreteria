package com.demo.ferreteria.rest;

import com.demo.ferreteria.modelo.Categoria;
import com.demo.ferreteria.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/categorias")
public class CategoriaRest {
    @Autowired
    private CategoriaService categoriaService;

    @GetMapping
    private ResponseEntity<List<Categoria>> getAllCategorias(){

        return ResponseEntity.ok(categoriaService.findAll());
    }

    @PostMapping
    private ResponseEntity<Categoria> create(@RequestBody Categoria categoria){
        try{
            Categoria categoriaCreada = categoriaService.save(categoria);
            return ResponseEntity.created(new URI("/categorias" + categoriaCreada.getId())).body(categoriaCreada);

        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }
}
