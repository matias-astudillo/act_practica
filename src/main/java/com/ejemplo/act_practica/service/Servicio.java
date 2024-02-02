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

    public void guardarTarea(Modelo modelo) {
        repositorio.guardarTarea(modelo);
    }

    public List<Modelo> obtenerTodasLasTareas() {
        return repositorio.obtenerTodasLasTareas();
    }

    public List<Modelo> obtenerTareaPorid(Long id) {
        return repositorio.findByid(id);
    }

    public void actualizarEstado(Long id, Boolean nuevoEstado) {
        repositorio.actualizarEstado(id, nuevoEstado);
    }

}