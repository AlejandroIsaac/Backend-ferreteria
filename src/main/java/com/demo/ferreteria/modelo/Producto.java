package com.demo.ferreteria.modelo;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "producto")
public class Producto implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String codigo;
    private String nombre;
    private String descripcion;
    private String especificacion;
    private String imagen;
    private Double precioCosto;
    private Double precioVenta;
    private Double precioPromocion;
    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;
    @ManyToOne
    @JoinColumn(name = "provedor_id")
    private Provedor provedor;
}
