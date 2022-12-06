package com.example.demo.controller;

import com.example.demo.model.Publicacion;
import com.example.demo.service.IServicePublicacion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Publicacion")
@CrossOrigin

public class ControllerPublicacion {
    @Qualifier("servicePublicacion")
    @Autowired
    private IServicePublicacion service;

    @GetMapping("/list")
    public List<Publicacion> getAll() {
        return null;
    }

    @PostMapping("/save")
    public Publicacion savePublicacion(@RequestBody Publicacion publicacion) {
        return service.savePublicacion(publicacion);
    }

    @GetMapping("/{id}")
    public Publicacion getPublicacion(@PathVariable Long id) {
        return service.findById(id);
    }

    @DeleteMapping("/{id}")
    public void deletePublicacion(@PathVariable Long id) {
        service.deletePublicacion(id);
    }

}
