package com.example.Spring.puntuaciones;

import java.util.List;

import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PuntuacionesService {
    private final PuntuacionesRepository catRepository;

    public List<Puntuacion> getpuntuacion() {
        List<Puntuacion> cats = (List<Puntuacion>)catRepository.findAll();
        return cats;
    }

    public Puntuacion getpPuntuacion(int id) {
        return catRepository.findById(id).orElse(null);
    }

    public Puntuacion insert(Puntuacion c) {
        return catRepository.save(c);
    }

    public Puntuacion update(Puntuacion c, int id) {
        c.setId(id); // Al tener una id hace un update en lugar de un insert
        return catRepository.save(c);
    }

    
    public void delete(int id) {
        catRepository.deleteById(id);
    }
}