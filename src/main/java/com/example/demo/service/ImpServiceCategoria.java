package com.example.demo.service;

import com.example.demo.model.Categoria;
import com.example.demo.repository.ICategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Component("serviceCategoria")
public class ImpServiceCategoria implements IServiceCategoria{
    @Autowired
    private ICategoriaRepository repo;

    @Override
    public List<Categoria> getListCategoria() {
        return repo.findAll();
    }

    @Override
    public Categoria findById(Long id) {
        return repo.findById(id).get();
    }

    @Override
    public Categoria saveCategoria(Categoria categoria) {
        return repo.save(categoria);
    }

    @Override
    public void deleteCategoria(Long id) {
        repo.deleteById(id);
    }
}
//