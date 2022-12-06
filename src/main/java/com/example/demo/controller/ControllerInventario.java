package com.example.demo.controller;

import com.example.demo.model.Inventario;
import com.example.demo.service.IServiceInventario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Inventario")
@CrossOrigin

public class ControllerInventario {
    @Qualifier("serviceInventario")
    @Autowired
    private IServiceInventario service;

    @GetMapping("/list")
    public List<Inventario> getAll() { return null; }

    @PostMapping("/save")
    public Inventario saveInventario(@RequestBody Inventario inventario) {
        return service.saveInventario(inventario);
    }

    @GetMapping("/{id}")
    public Inventario getInventario(@PathVariable Long id) { return service.findById(id); }

    @DeleteMapping("/{id}")
    public void deleteInventario(@PathVariable Long id) { service.deleteInventario(id); }

}
