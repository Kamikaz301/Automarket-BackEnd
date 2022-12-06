package com.example.demo.repository;

import com.example.demo.model.Publicacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface IPublicacionRepository extends JpaRepository<Publicacion, Long> {
    void deleteById(UUID id);
}
