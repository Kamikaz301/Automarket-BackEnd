package com.example.demo.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Pago {
    @Id
    @SequenceGenerator(name = "Pago_seq",
    sequenceName = "Pago_seq",
    allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
    generator = "Pago_seq")
    private Long IdPago;
    private Long Estado;
    private Long Fecha;
    private Long Monto;
    private String Idcobro;
}
