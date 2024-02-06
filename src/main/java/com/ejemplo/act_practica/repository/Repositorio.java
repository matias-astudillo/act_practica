package com.ejemplo.act_practica.repository;

import com.ejemplo.act_practica.model.Modelo;
import org.springframework.stereotype.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.ArrayList;
import java.util.List;

@Repository
public class Repositorio {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void guardarTarea(Modelo modelo) {
        System.out.println(modelo);
        String sql = "INSERT INTO tareas (id, nombre, completado) VALUES (?, ?, ?)";
        jdbcTemplate.update(sql, modelo.getId(), modelo.getNombre(), modelo.getCompletado());
        System.out.println(modelo);
    }

    public List<Modelo> obtenerTodasLasTareas() {
        String sql = "SELECT * FROM tareas";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Modelo.class));
    }

    public List<Modelo> findByid(Long id) {
        String sql = "SELECT * FROM tareas WHERE id = ?";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Modelo.class), id);
    }

    public void actualizarEstado(Long id, Boolean nuevoEstado) {
        String sql = "UPDATE tareas SET completado = ? WHERE id = ?";
        jdbcTemplate.update(sql, nuevoEstado, id);
    }

    public void eliminarTarea(Long id) {
        String sql = "DELETE FROM tareas WHERE id = ?";
        jdbcTemplate.update(sql, id);
    }

}