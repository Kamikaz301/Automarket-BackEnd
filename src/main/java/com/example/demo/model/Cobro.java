package com.example.demo.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Cobro {
    @Id
    @SequenceGenerator(name = "Cobro_seq",
            sequenceName = "Cobro_seq",
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "Cobro_seq")
    private Long IdCobro;
    private Long Estado;
    private String Fecha;
    private String Monto;
}
