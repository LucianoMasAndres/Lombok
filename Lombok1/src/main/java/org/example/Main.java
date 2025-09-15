package org.example;

public class Main {
    public static void main(String[] args) {
        // Constructor lleno
        Persona persona1 = new Persona("Juan", 25);
        System.out.println("Persona1: " + persona1.getNombre() + ", " + persona1.getEdad());
        Persona persona2 = new Persona();
        persona2.setNombre("Ana");
        persona2.setEdad(30);
        System.out.println("Persona2: " + persona2.getNombre() + ", " + persona2.getEdad());
    }
}
