package com.ejemplo.act_practica.repository;

import com.ejemplo.act_practica.model.Modelo;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class Repositorio {
    private final List<Modelo> listaDeModelos = new ArrayList<>();

    public void guardarTarea(Modelo modelo) {
        listaDeModelos.add(modelo);
    }

    public List<Modelo> obtenerTodasLasTareas() {
        return new ArrayList<>(listaDeModelos);
    }

    public List<Modelo> findByid(Long id) {
        List<Modelo> resultados = new ArrayList<>();
        for (Modelo modelo : listaDeModelos) {
            if (modelo.getid().equals(id)) {
                resultados.add(modelo);
            }
        }
        return resultados;
    }

    public void actualizarEstado(Long id, Boolean nuevoEstado) {
        for (Modelo modelo : listaDeModelos) {
            if (modelo.getid().equals(id)) {
                modelo.setcompletado(nuevoEstado);
                break;
            }
        }
    }

    public void eliminarTarea(Long id) {
        listaDeModelos.removeIf(modelo -> modelo.getid().equals(id));
    }

}