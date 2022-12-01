package com.example.animexd.anime;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
public class series {
    @Column("id")
    @Id private int id;
    @Column("nombre")
    private String nombre;
    @Column("generos")
    private String generos;
    @Column("imagen")
    private String imagen;
    @Column("sinopsis")
    private String sinopsis;
    @Column("fecha_inicio")
    private String fecha_inicio;
}
