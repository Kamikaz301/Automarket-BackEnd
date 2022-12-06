package com.example.demo.service;

import com.example.demo.model.Usuario;
import com.example.demo.repository.IUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Component("serviceUsuario")
public class ImpServiceUsuario implements IServiceUsuario{
    @Autowired
    private IUsuarioRepository repo;

    @Override
    public List<Usuario> getListUsuario() {return repo.findAll();
    }
    @Override
    public Usuario findById(Long id) {return repo.findById(id).get();}

    @Override
    public Usuario saveUsuario(Usuario usuario){
        return repo.save(usuario);
    }
    @Override
    public void deleteUsuario(Long id){
        repo.deleteById(id);
    }

}
