package com.example.animexd.anime;

import java.util.List;

import org.springframework.data.jdbc.core.JdbcAggregateTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import lombok.RequiredArgsConstructor;

@Service @RequiredArgsConstructor
public class seriesService {
    private final seriesRepository seriesRepository;
    private final JdbcAggregateTemplate jdbcTemplate;

    public List<series> getAll() {
        return (List<series>)seriesRepository.findAll();
    }

    public List<series> getByNombre(String nombre) {
        return seriesRepository.findByNombreContaining(nombre);
    }

    public List<series> getBytipo(String tipo) {
        return seriesRepository.findByTipo(tipo);
    }

    public series getById(int id) {
        return seriesRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Anime no encontrado."));
    }

    public series insert(series s) {
        return jdbcTemplate.insert(s);
    }

    public void delete(int id) {
        seriesRepository.deleteById(id);
    }
}