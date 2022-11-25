package com.animexd.anime.anime;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController @RequiredArgsConstructor
@RequestMapping("/series")
public class seriesController {
    private final seriesService seriesService;

    @GetMapping
    public List<series> getAll() {
        return seriesService.getAll();
    }

    @GetMapping("/{id}")
    public series getBySeries(@PathVariable int id) {
        return seriesService.getBySeries(id);
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
