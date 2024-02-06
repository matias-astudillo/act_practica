package com.ejemplo.act_practica.model;

public class Modelo {
    private Long id;
    private String nombre;
    private Boolean completado;

    public Modelo() {
    }

    public Modelo(Long id, String nombre, Boolean completado) {
        this.id = id;
        this.nombre = nombre;
        this.completado = completado;
    }

    // Getters y Setters...

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Boolean getCompletado() {
        return completado;
    }

    public void setCompletado(Boolean completado) {
        this.completado = completado;
    }
}