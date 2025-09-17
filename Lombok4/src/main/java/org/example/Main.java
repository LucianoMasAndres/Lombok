package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Producto p1 = new Producto("001", "Laptop", "Proveedor A", 1500.0);
        Producto p2 = new Producto("002", "Mouse", "Proveedor B", 50.0);


        ProductoRecord pr1 = new ProductoRecord(p1.getCodigo(), p1.getNombre(), p1.getPrecio());
        ProductoRecord pr2 = new ProductoRecord(p2.getCodigo(), p2.getNombre(), p2.getPrecio());


        List<ProductoRecord> listaDTO = new ArrayList<>();
        listaDTO.add(pr1);
        listaDTO.add(pr2);


        for (ProductoRecord pr : listaDTO) {
            System.out.println(pr);
        }
    }
}
