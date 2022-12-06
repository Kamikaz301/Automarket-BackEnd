package com.example.demo.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Inventario {
    @Id
    @SequenceGenerator(name = "Inventario_seq",
            sequenceName = "Inventario_seq",
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "Inventario_seq")
    private Long id;
    private String marca;
    private String modelo;
    private String anyo;
    private String color;
    private String descripcion;
    private byte estado;
    private Long idCategoria;
}
