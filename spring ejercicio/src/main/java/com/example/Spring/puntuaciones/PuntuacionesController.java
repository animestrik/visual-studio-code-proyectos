package com.example.Spring.puntuaciones;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/puntuaciones")
@RequiredArgsConstructor
public class PuntuacionesController {
    private final PuntuacionesService catService;

    @GetMapping
    public List<Puntuacion> getpuntuacion() {
        return catService.getpuntuacion();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Puntuacion> getpuntuacion(@PathVariable int id) {
        Puntuacion c = catService.getpPuntuacion(id);
        if(c == null) {
            return ResponseEntity.notFound().build();
        } 
        return ResponseEntity.ok(c);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Puntuacion insertpPuntuacion(@RequestBody Puntuacion c) {
        return catService.insert(c);
    }

    @PutMapping("/{id}")
    public Puntuacion updatePuntuacion(@RequestBody Puntuacion c, @PathVariable int id) {
        return catService.update(c, id);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletePuntuacion(@PathVariable int id) {
        catService.delete(id);
    }
}