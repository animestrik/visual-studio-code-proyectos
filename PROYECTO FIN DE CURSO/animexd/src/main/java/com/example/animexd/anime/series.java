package com.example.animexd.anime;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
public class series {
    @Column("series")
    @Id private int id;
    private String nombre;
    private String tipo;
    private String imagen;
    private String sinopsis;
    private String personajesprincipales;
}
