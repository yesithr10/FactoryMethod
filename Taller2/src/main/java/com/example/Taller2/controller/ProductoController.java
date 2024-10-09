package com.example.Taller2.controller;

import com.example.Taller2.domains.Producto;
import com.example.Taller2.domains.ProductoDAO;
import com.example.Taller2.domains.ProductoDAOFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductoController {

    @GetMapping("/productos")
    public List<Producto> listarProductos(@RequestParam String tipoBaseDatos) {
        System.out.println("Listando productos en base de datos: " + tipoBaseDatos);
        ProductoDAO productoDAO = ProductoDAOFactory.configureAdapterDB(tipoBaseDatos);
        List<Producto> productos = productoDAO.listar();
        System.out.println("Cantidad de productos listados: " + productos.size());
        return productos;
    }

    @GetMapping("/insertarProducto")
    public String insertarProducto(@RequestParam String tipoBaseDatos, @RequestParam int id,
                                   @RequestParam String descripcion, @RequestParam double precio) {
        System.out.println("Insertando producto en base de datos: " + tipoBaseDatos);
        ProductoDAO productoDAO = ProductoDAOFactory.configureAdapterDB(tipoBaseDatos);
        Producto producto = new Producto(id, descripcion, precio);
        productoDAO.insertar(producto);
        System.out.println("Producto insertado correctamente: " + producto);
        return "Producto insertado: " + producto;
    }
}
