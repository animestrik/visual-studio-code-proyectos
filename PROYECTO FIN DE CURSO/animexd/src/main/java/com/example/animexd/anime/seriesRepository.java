package com.example.animexd.anime;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface seriesRepository extends CrudRepository<series, Integer>{
    // Equipos en cuyo nombre esté incluido el string de búsqueda
    List<series> findByNombreContaining(String nombre);

    // Filtra por tipo
    List<series> findBytipo(String tipo);

    // Filtra por nombre Y tipo
    List<series> findByNombreContainingAndtipo(String nombre, String tipo);
}
