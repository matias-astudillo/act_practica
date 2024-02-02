package com.ejemplo.act_practica.repository;

import com.ejemplo.act_practica.model.Modelo;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class Repositorio {
    private final List<Modelo> listaDeModelos = new ArrayList<>();

    public void guardarModelo(Modelo modelo) {
        listaDeModelos.add(modelo);
    }

    public List<Modelo> obtenerTodosLosModelos() {
        return new ArrayList<>(listaDeModelos);
    }
}