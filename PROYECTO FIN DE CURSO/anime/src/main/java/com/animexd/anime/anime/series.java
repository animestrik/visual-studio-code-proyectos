package com.animexd.anime.anime;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
public class series {
    @Id private int id;
    private String nombre;
    private String imagen;
    private String tipo;
    private String sinopsis;
    private String personajesprincipales;

}
