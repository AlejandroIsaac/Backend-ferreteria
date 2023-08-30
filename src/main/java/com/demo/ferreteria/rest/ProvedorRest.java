package com.demo.ferreteria.rest;

import com.demo.ferreteria.modelo.Provedor;
import com.demo.ferreteria.service.ProvedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/provedores")
public class ProvedorRest {

    @Autowired
    private ProvedorService provedorService;

    @GetMapping
    private ResponseEntity<List<Provedor>> getAllProcedores(){
        return ResponseEntity.ok(provedorService.findAll());
    }

}
