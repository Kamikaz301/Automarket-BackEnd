package com.example.demo.service;

import com.example.demo.model.Publicacion;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IServicePublicacion {
    public List<Publicacion> getListPublicacion();

    public Publicacion findById(Long id);

    public Publicacion savePublicacion(Publicacion publicacion);

    public void deletePublicacion(Long id);
}
