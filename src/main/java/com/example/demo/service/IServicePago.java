package com.example.demo.service;

import com.example.demo.model.Pago;

import java.util.List;

public interface IServicePago {
    List<Pago> getListPago();

    Pago findById(Long id);

    Pago savePago(Pago pago);

    void deletePago(Long id);
}
