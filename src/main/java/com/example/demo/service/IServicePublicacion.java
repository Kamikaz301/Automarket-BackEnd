package com.example.demo.service;

import com.example.demo.model.Publicacion;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
import java.util.UUID;

@Service
public interface IServicePublicacion {
    public List<Publicacion> getListPublicacion();

    public Publicacion findById(Long id);

    public Publicacion savePublicacion(Publicacion publicacion);

    public void deletePublicacion(Long id);

    Publicacion savePublicacion(Publicacion publicacion, MultipartFile image) throws IOException;

    void deletePublicacion(UUID id);
}
