package org.example;

import lombok.Builder;
import lombok.Data;

@Data       // Genera getters, setters, toString, equals, hashCode
@Builder    // Habilita el patrón Builder
public class Usuario {
    private int id;
    private String nombre;
    private String email;
}
