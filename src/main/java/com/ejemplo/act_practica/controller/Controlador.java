package com.ejemplo.act_practica.controller;

import com.ejemplo.act_practica.model.Modelo;
import com.ejemplo.act_practica.service.Servicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/tareas")
public class Controlador {

    private final Servicio servicio;

    @Autowired
    public Controlador(Servicio servicio) {
        this.servicio = servicio;
    }

    @GetMapping
    public List<Modelo> obtenerTodosLosModelos() {
        return servicio.obtenerTodosLosModelos();
    }

    @PostMapping
    public void agregarModelo(@RequestBody Modelo modelo) {
        servicio.guardarModelo(modelo);
    }


}