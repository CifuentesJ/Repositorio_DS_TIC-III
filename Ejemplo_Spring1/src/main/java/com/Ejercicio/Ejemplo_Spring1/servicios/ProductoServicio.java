package com.Ejercicio.Ejemplo_Spring1.servicios;

import com.Ejercicio.Ejemplo_Spring1.entidades.Producto;
import java.util.ArrayList;

public class ProductoServicio {
    ArrayList<Producto> lista = new ArrayList<>();

    public ProductoServicio() {
        this.datosIniciales();
    }

    public ArrayList<Producto> getLista() {
        return lista;
    }

    public void datosIniciales(){
        lista.add(new Producto("R01","Naranjas","Frutas",4500f,25));
        lista.add(new Producto("R02","Queso","Lacteos",8500,45));
        lista.add(new Producto("R03","Jamón","Carnes",25000,20));
        lista.add(new Producto("R04","Arroz","Cereal",2500,21));
        lista.add(new Producto("R05","Manzana","Frutas",2500,12));
    }
}
