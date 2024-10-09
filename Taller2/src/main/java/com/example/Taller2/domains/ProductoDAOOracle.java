package com.example.Taller2.domains;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;

public class ProductoDAOOracle implements ProductoDAO {
    private Map<Integer, Producto> productos = new HashMap<>();

    @Override
    public void insertar(Producto producto) {
        productos.put(producto.getId(), producto);
        System.out.println("Producto insertado en Oracle: " + producto);
        System.out.println("Cantidad de productos en Oracle: " + productos.size());
    }

    @Override
    public void actualizar(Producto producto) {
        productos.put(producto.getId(), producto);
        System.out.println("Producto actualizado en Oracle: " + producto);
    }

    @Override
    public void eliminar(int id) {
        productos.remove(id);
        System.out.println("Producto eliminado de Oracle: ID " + id);
    }

    @Override
    public List<Producto> listar() {
        System.out.println("Listando productos de Oracle, cantidad: " + productos.size());
        return new ArrayList<>(productos.values());
    }
}
