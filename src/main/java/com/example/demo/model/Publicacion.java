package com.example.demo.model;

import lombok.Data;
import java.lang.String;
import javax.persistence.*;

@Entity
@Data
public class Publicacion {
    @Id
    @SequenceGenerator(name = "Publicacion_seq",
            sequenceName = "Publicacion_seq",
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "Publicacion_seq")

    private Long id;
    private Long idUsuario;
    private Long idProducto;
    private Long idPago;
    private String descripcion;
    private String fecha;
    private byte status;
    private double total;
    private String titulo;
    private String image;
}
