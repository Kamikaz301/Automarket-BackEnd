package com.example.demo.controller;
import com.example.demo.model.Pago;
import com.example.demo.service.IServicePago;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class ControllerPago {
    @Qualifier("servicePago")
    @Autowired
    private IServicePago service;

    @GetMapping("/list")
    public List<Pago> getAll(){return null;}

    @PostMapping("/save")
    public Pago savePago(@RequestBody Pago pago)
    {
        return service.savePago(pago);
    }

    @GetMapping("/{id}")
    public Pago getPago(@PathVariable Long id)
    {
        return service.findById(id);
    }

    @DeleteMapping("/{id}")
    public void deletePago(@PathVariable Long id)
    {
        service.deletePago(id);
    }
}
