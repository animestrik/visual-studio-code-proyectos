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
    @Column("series")
    private String nombre;
    @Column("series")
    private String tipo;
    @Column("series")
    private String imagen;
    @Column("series")
    private String sinopsis;
    @Column("series")
    private String fecha_inicio;
}
