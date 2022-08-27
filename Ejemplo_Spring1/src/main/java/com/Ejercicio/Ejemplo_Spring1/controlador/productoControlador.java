package com.Ejercicio.Ejemplo_Spring1.controlador;

import com.Ejercicio.Ejemplo_Spring1.entidades.Producto;
import com.Ejercicio.Ejemplo_Spring1.servicios.ProductoServicio;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class productoControlador {

    ProductoServicio servicio;

    public productoControlador() {
        this.servicio = new ProductoServicio();
    }

    @GetMapping("/LeerProducto")
    public Producto leerProducto(){
        Producto p = new Producto("R01","Manzana","Frutas",5200.45f, 50);
        return p;
    }

    @GetMapping("/ListaProductos")
    public ArrayList<Producto> listaProductos(){
        return this.servicio.getLista();
    }
}
