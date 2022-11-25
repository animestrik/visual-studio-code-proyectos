package com.animexd.anime.anime;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface seriesRepository extends CrudRepository<series, Integer> {
    List<series> findByid(int id);
    List<series> findBynombreContaining(String Nombre);
    List<series> findByPersonajesprincipales(String Personajesprincipales);
    List<series> findBynombreContainingandPersonajesprincipales(String Nombre, String Personajesprincipales);
}
