package com.demo.ferreteria.rest;

import com.demo.ferreteria.modelo.Categoria;
import com.demo.ferreteria.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/categorias")
public class CategoriaRest {
    @Autowired
    private CategoriaService categoriaService;

    @GetMapping
    private ResponseEntity<List<Categoria>> getAllCategorias(){

        return ResponseEntity.ok(categoriaService.findAll());
    }
}
