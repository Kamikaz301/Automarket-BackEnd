package com.example.demo.repository;

import com.example.demo.model.Cobro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICobroRepository extends JpaRepository<Cobro, Long> {
}
