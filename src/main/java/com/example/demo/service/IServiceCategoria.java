package com.example.demo.service;

import com.example.demo.model.Categoria;
import org.springframework.stereotype.Service;

import java.util.List;

@SuppressWarnings("unused")
@Service
public interface IServiceCategoria {
    public List<Categoria> getListCategoria();

    public Categoria findById(Long id);

    public Categoria saveCategoria(Categoria categoria);

    public void deleteCategoria(Long id);
}
