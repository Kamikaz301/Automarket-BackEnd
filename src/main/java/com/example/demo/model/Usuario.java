package com.example.demo.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Usuario {
    @Id
    @SequenceGenerator(name = "Usuario_seq",
    sequenceName = "Usuario_seq",
    allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
    generator = "Usuario_seq")
    private Long idUsuario;
    private String Nombre;
    private String ContraUsuario;
}
