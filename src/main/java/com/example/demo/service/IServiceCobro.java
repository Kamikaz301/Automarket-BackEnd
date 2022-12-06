package com.example.demo.service;

import com.example.demo.model.Cobro;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface IServiceCobro {
    List<Cobro> getListCobro();

    Cobro findById(Long id);

    Cobro saveCobro(Cobro cobro);

    void deleteCobro(Long id);
}
