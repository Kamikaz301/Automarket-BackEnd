package com.example.demo.service;

import com.example.demo.model.Inventario;
import com.example.demo.repository.IInventarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Component("serviceInventario")
public class ImpServiceInventario implements IServiceInventario {
    @Autowired
    private IInventarioRepository repo;

    @Override
    public List<Inventario> getListInventario() {return repo.findAll(); }

    @Override
    public Inventario findById(Long id) { return repo.findById(id).get(); }

    @Override
    public Inventario saveInventario(Inventario inventario) { return repo.save(inventario); }

    @Override
    public void deleteInventario(Long id) { repo.deleteById(id); }
}
