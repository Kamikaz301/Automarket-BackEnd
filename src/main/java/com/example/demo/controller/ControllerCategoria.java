package com.example.demo.controller;

import com.example.demo.model.Categoria;
import com.example.demo.service.IServiceCategoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Categoria")
@CrossOrigin
public class ControllerCategoria {
    @Qualifier("serviceCategoria")
    @Autowired
    private IServiceCategoria service;

    @GetMapping("/list")
    public List<Categoria> getAll(){return null;}

    @PostMapping("/save")
    public Categoria saveCategoria(@RequestBody Categoria categoria){
        return service.saveCategoria(categoria);
    }

    @GetMapping("/{id}")
    public Categoria getCategoria(@PathVariable Long id) {return service.findById(id);}

    @DeleteMapping("/{id}")
    public void deleteCategoria(@PathVariable Long id) {service.deleteCategoria(id);}
}
