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

    public Long getid() {
        return id;
    }

    public void setid(Long id) {
        this.id = id;
    }

    public String getnombre() {
        return nombre;
    }

    public void setnombre(String nombre) {
        this.nombre = nombre;
    }

    public Boolean getcompletado() {
        return completado;
    }

    public void setcompletado(Boolean completado) {
        this.completado = completado;
    }
}