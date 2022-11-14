package com.example.Spring.puntuaciones;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PuntuacionesRepository extends CrudRepository<Puntuacion, Integer> {
    
}
