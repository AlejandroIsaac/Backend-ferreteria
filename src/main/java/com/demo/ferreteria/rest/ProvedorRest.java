package com.demo.ferreteria.rest;

import com.demo.ferreteria.modelo.Provedor;
import com.demo.ferreteria.service.ProvedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/provedores")
public class ProvedorRest {

    @Autowired
    private ProvedorService provedorService;

    @GetMapping
    private ResponseEntity<List<Provedor>> getAllProcedores(){
        return ResponseEntity.ok(provedorService.findAll());
    }

    @PostMapping
    private ResponseEntity<Provedor> createProvedor(@RequestBody Provedor provedor){
        try{
            Provedor provedorCreado = provedorService.save(provedor);
            return ResponseEntity.created(new URI("/provedores" + provedorCreado.getId())).body(provedorCreado);
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();

        }
    }
}
