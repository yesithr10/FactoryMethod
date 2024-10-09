package com.example.Taller2.domains;

import java.util.ArrayList;
import java.util.List;

public class ProductoDAOMySQL implements ProductoDAO {
    private List<Producto> productos = new ArrayList<>();

    @Override
    public void insertar(Producto producto) {
        productos.add(producto);
        System.out.println("Producto insertado en MySQL: " + producto);
        System.out.println("Cantidad de productos en MySQL: " + productos.size());
    }

    @Override
    public void actualizar(Producto producto) {
        // Lógica de actualización
    }

    @Override
    public void eliminar(int id) {
        productos.removeIf(p -> p.getId() == id);
        System.out.println("Producto eliminado de MySQL: ID " + id);
    }

    @Override
    public List<Producto> listar() {
        System.out.println("Listando productos de MySQL, cantidad: " + productos.size());
        return productos;
    }
}


