package com.example.demo.controller;

import com.example.demo.model.Usuario;
import com.example.demo.service.IServiceUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuario")
@CrossOrigin("*")
public class ControllerUsuario {
    @Qualifier("serviceUsuario")
    @Autowired
    private IServiceUsuario service;

    @GetMapping("/list")
    public List<Usuario> getAll(){return service.getListUsuario();}

    @PostMapping("/save")
    public Usuario saveUsuario(@RequestBody Usuario usuario){
        return service.saveUsuario(usuario);
    }

    @GetMapping("/{id}")
    public Usuario getUsuario(@PathVariable Long id) {return service.findById(id);}

    @DeleteMapping("/{id}")
    public void deleteUsuario(@PathVariable Long id) {service.deleteUsuario(id);}

}
