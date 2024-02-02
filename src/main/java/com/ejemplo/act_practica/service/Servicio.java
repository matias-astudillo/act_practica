// ModeloDeDatosService.java
package com.ejemplo.act_practica.service;

import com.ejemplo.act_practica.model.Modelo;
import com.ejemplo.act_practica.repository.Repositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Servicio {

    private final Repositorio repositorio;

    @Autowired
    public Servicio(Repositorio repositorio) {
        this.repositorio = repositorio;
    }

    public void guardarModelo(Modelo modelo) {
        repositorio.guardarModelo(modelo);
    }

    public List<Modelo> obtenerTodosLosModelos() {
        return repositorio.obtenerTodosLosModelos();
    }
}