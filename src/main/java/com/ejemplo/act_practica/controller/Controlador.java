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
    public List<Modelo> obtenerTodasLasTareas() {
        return servicio.obtenerTodasLasTareas();
    }

    @PostMapping
    public void agregarTarea(@RequestBody Modelo modelo) {
        servicio.guardarTarea(modelo);
    }

    @GetMapping("/{id}")
    public List<Modelo> obtenerTareaPorid(@PathVariable Long id) {
        return servicio.obtenerTareaPorid(id);
    }

    @PutMapping("/{id}")
    public void actualizarEstado(@PathVariable Long id, @RequestBody boolean completado) {
    servicio.actualizarEstado(id, completado);
    }

    @DeleteMapping("/{id}")
    public void eliminarTarea(@PathVariable Long id) {
        servicio.eliminarTarea(id);
    }

}