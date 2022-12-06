package com.example.demo.service;

import com.example.demo.model.Publicacion;
import com.example.demo.repository.IPublicacionRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.DataInput;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.UUID;
import java.lang.String;

@Service
@Component("servicePublicacion")
public class ImpServicePublicacion implements IServicePublicacion {
    @Autowired
    private IPublicacionRepository repo;



    @Value("C://Resource//imagen")
    private String ruta;

    @Override
    public List<Publicacion> getListPublicacion() {
        return repo.findAll();
    }

    @Override
    public Publicacion findById(Long id) {
        return repo.findById(id).get();
    }

    @Override
    public Publicacion savePublicacion(Publicacion publicacion) {
        return repo.save(publicacion);
    }

    @Override
    public void deletePublicacion(Long id) {
        repo.deleteById(id);
    }


    @Override
    public Publicacion savePublicacion(Publicacion publicacionDto, MultipartFile image)
            throws IOException {
        byte [] imgByte = image.getBytes();
        Path path = Paths.get(  ruta + "//" + image.getOriginalFilename());
        if (!Files.exists(path));
        {
            Files.write(path,imgByte);
        }
        ObjectMapper ObjectMapper = new ObjectMapper();
        Publicacion publicacion = ObjectMapper.readValue((DataInput) publicacionDto, Publicacion.class);
        publicacion.setImage(image.getOriginalFilename());
        return repo.save(publicacion);
    }

    @Override
    public void deletePublicacion(UUID id) {
        repo.deleteById(id);
    }
}
