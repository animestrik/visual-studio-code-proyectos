package com.animexd.anime.anime;

import java.util.List;

import org.springframework.data.jdbc.core.JdbcAggregateTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import lombok.RequiredArgsConstructor;

@Service @RequiredArgsConstructor
public class seriesService {
    private final seriesRepository seriesRepository;
    private final JdbcAggregateTemplate JdbcTemplate;

    public List<series> getAll() {
        return (List<series>) seriesRepository.findAll();
    }

    public List<series> getById(int id) {
        return seriesRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Anime no encontrado."));
    }

    public List<series> getBynombre(String nombre) {
        return seriesRepository.findBynombreContaining(nombre);
    }

    public List<series> getByimagen(String imagen) {
        return seriesRepository.findBynombreContaining(imagen);
    }

    public List<series> getBytipo(String tipo) {
        return seriesRepository.findBynombreContaining(tipo);
    }

    public List<series> getBysinopsis(String sinopsis) {
        return seriesRepository.findBynombreContaining(sinopsis);
    }

    public List<series> getBypersonajesprincipales(String personajesprincipales) {
        return seriesRepository.findBynombreContaining(personajesprincipales);
    }
    
    public series insert(series s) {
        return JdbcTemplate.insert(s);
    }

    public void delete(int id) {
        seriesRepository.deleteById(id);
    }
}
