package com.animexd.anime.anime;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
public class series {
    @Id private int id;
    private String Nombre;
    private String Imagen;
    private String Tipo;
    private String Sinopsis;
    private String Personajesprincipales;

}
