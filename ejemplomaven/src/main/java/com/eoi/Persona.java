package com.eoi;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
// sustituir el codigo completo con lo de abajo
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Persona {
	
	// Atributos de la clase (propiedades)
	String nombre;
    String apellido;
    String dni;
	String telefono;
	LocalDate fechaNacimiento;
}
