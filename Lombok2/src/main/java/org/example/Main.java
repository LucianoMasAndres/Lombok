package org.example;

public class Main {
    public static void main(String[] args) {

        Usuario usuario1 = Usuario.builder()
                .id(1)
                .nombre("Juan Perez")
                .email("juan.perez@example.com")
                .build();


        Usuario usuario2 = Usuario.builder()
                .id(2)
                .nombre("Ana Gomez")
                .email("ana.gomez@example.com")
                .build();

        // Imprimir datos por consola
        System.out.println(usuario1);
        System.out.println(usuario2);
    }
}
