package com.example.demo.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Categoria {
    @Id
    @SequenceGenerator(name = "Categoria_seq",
    sequenceName = "Categoria_seq",
    allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
    generator = "Categoria_seq")
    private Long idCategoria;
    private String NombreCategoria;
}
