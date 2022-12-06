package com.example.demo.service;

import com.example.demo.model.Cobro;
import com.example.demo.repository.ICobroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Component("serviceCobro")
public class ImpServiceCobro implements IServiceCobro{
    @Autowired
    private ICobroRepository repo;

    @Override
    public List<Cobro> getListCobro() {
        return repo.findAll();
    }

    @Override
    public Cobro findById(Long id) {
        return repo.findById(id).get();
    }

    @Override
    public Cobro saveCobro(Cobro cobro) {
        return repo.save(cobro);
    }

    @Override
    public void deleteCobro(Long id) {
        repo.deleteById(id);
    }
}
