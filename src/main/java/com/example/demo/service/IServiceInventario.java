package com.example.demo.service;

import com.example.demo.model.Inventario;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IServiceInventario {
    public List<Inventario> getListInventario();

    public Inventario findById(Long id);

    public Inventario saveInventario(Inventario inventario);

    public void deleteInventario(Long id);
}
