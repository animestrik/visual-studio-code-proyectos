package com.animexd.anime.anime;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface seriesRepository extends CrudRepository<series, Integer> {
    List<series> findById(int id);
    List<series> findBynombreContaining(String nombre);
    List<series> findByPersonajesprincipales(String personajesprincipales);
    List<series> findBynombreContainingandPersonajesprincipales(String nombre, String personajesprincipales);
}
