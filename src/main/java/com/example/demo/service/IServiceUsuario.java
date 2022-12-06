package com.example.demo.service;

import com.example.demo.model.Usuario;
import org.springframework.stereotype.Service;

import java.util.List;

@SuppressWarnings("unused")
@Service
public interface IServiceUsuario {
    public List<Usuario> getListUsuario();

    public Usuario findById(Long id);

    public Usuario saveUsuario(Usuario usuario);

    public void deleteUsuario(Long id);
}
