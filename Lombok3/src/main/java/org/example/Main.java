package org.example;

import org.example.Producto;
import org.example.ProductoDTO;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear objetos Producto
        Producto prod1 = new Producto(101, "Libro Java", 1500.0, "Juan Perez");
        Producto prod2 = new Producto(102, "Curso Python", 2000.0, "Maria Gomez");

        ProductoDTO dto1 = new ProductoDTO(prod1.getCodigo(), prod1.getNombre(), prod1.getPrecio());
        ProductoDTO dto2 = new ProductoDTO(prod2.getCodigo(), prod2.getNombre(), prod2.getPrecio());

       List<ProductoDTO> listaDTO = new ArrayList<>();
        listaDTO.add(dto1);
        listaDTO.add(dto2);

        for (ProductoDTO dto : listaDTO) {
            System.out.println("Código: " + dto.getCodigo() +
                    ", Nombre: " + dto.getNombre() +
                    ", Precio: $" + dto.getPrecio());
        }
    }
}
