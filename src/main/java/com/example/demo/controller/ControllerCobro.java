package com.example.demo.controller;

import com.example.demo.model.Cobro;
import com.example.demo.model.Pago;
import com.example.demo.service.IServiceCobro;
import com.example.demo.service.IServicePago;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/Cobro")
@CrossOrigin

public class ControllerCobro {

    @Qualifier("serviceCobro")
    @Autowired
    private IServiceCobro service;

    @GetMapping("/list")
    public List<Cobro> getAll(){return null;}

    @PostMapping("/save")
    public Cobro saveCobro(@RequestBody Cobro cobro)
    {
        return service.saveCobro(cobro);
    }

    @GetMapping("/{id}")
    public Cobro getCobro(@PathVariable Long id)
    {
        return service.findById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteCobro(@PathVariable Long id)
    {
        service.deleteCobro(id);
    }
}