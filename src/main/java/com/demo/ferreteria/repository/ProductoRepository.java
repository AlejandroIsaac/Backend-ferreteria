package com.demo.ferreteria.repository;

import com.demo.ferreteria.modelo.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
}
