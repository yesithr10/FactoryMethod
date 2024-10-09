package com.example.Taller2.domains;

import java.util.List;

public interface ProductoDAO {
    void insertar(Producto producto);
    void actualizar(Producto producto);
    void eliminar(int id);
    List<Producto> listar();
}
