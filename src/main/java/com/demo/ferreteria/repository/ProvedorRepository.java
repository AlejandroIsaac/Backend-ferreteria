package com.demo.ferreteria.repository;

import com.demo.ferreteria.modelo.Categoria;
import com.demo.ferreteria.modelo.Provedor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProvedorRepository extends JpaRepository<Provedor, Long> {

}
