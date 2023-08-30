package com.demo.ferreteria.modelo;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "provedor")
public class Provedor implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String organizacion;
    private String vendedor;
    private String direccion;
}
