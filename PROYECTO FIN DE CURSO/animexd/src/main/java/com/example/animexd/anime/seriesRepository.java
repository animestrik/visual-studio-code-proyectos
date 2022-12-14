package com.example.animexd.anime;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface seriesRepository extends CrudRepository<series, Integer>{
    List<series> findByIdContaining(int id);
    List<series> findByNombreContaining(String nombre);
    List<series> findByGeneros(String generos);
    List<series> findByNombreContainingAndGeneros(String nombre, String generos);
    
    
}
