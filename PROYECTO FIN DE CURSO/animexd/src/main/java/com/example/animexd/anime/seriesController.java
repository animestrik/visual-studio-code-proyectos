package com.example.animexd.anime;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/series")
@CrossOrigin(origins = "http://localhost:4200")
public class seriesController {
    private final seriesService seriesService;

    @GetMapping
    public List<series> getAll(@RequestParam(required = false) String nombre,
            @RequestParam(required = false) String tipo) {
        if (nombre != null) {
            return seriesService.getByNombre(nombre);
        } else if (tipo != null) {
            return seriesService.getByTipo(tipo);
        } else {
            return seriesService.getAll();
        }
    }

    @GetMapping("/{id}")
    public series getById(@PathVariable int id) {
        return seriesService.getById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public series insert(@RequestBody series s) {
        return seriesService.insert(s);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable int id) {
        seriesService.delete(id);
    }
}
