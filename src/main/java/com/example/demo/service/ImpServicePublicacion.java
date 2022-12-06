package com.example.demo.service;

import com.example.demo.model.Publicacion;
import com.example.demo.repository.IPublicacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Component("servicePublicacion")
public class ImpServicePublicacion implements IServicePublicacion {
    @Autowired
    private IPublicacionRepository repo;

    @Override
    public List<Publicacion> getListPublicacion() {
        return repo.findAll();
    }

    @Override
    public Publicacion findById(Long id) {
        return repo.findById(id).get();
    }

    @Override
    public Publicacion savePublicacion(Publicacion publicacion) {
        return repo.save(publicacion);
    }

    @Override
    public void deletePublicacion(Long id) {
        repo.deleteById(id);
    }
}
