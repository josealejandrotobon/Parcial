package com.Parcial;

import java.util.ArrayList;
import java.util.Arrays;

public class Mercado {
    public static final byte CAPACIDAD= 96;
    private String supermercado;
    private ArrayList<Producto> productos;

    public String getSupermercado() {
        return supermercado;
    }

    public Mercado(String supermercado) {
        this.supermercado = supermercado;
        this.productos = productos;
        this.productos = new ArrayList<>();
    }


    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }
    public boolean agregar(Producto agregado){
        boolean i=false;
        for (int a=0; a<productos.size(); a++) {
            if (agregado.getCantidad() < CAPACIDAD && agregado != productos.get(a)) {
                productos.add(agregado);
                i=true;
            }
            else{

                i=false;
            }
        }
        return i;
    }
    public boolean retirar(String retirado){
        boolean b=false;

        for (int i=0; i<productos.size(); i++) {
            if (productos.get(i).getNombre() == retirado) {
                productos.remove(productos.get(i));
                b=true;
            }
            else{
                b=false;
            }
        }
        return b;
    }
    public Producto buscarN(String busqueda){
        Producto producto = null;
        for (int i=0; i<productos.size(); i++) {
            if (productos.get(i).getNombre() == busqueda) {
                producto = productos.get(i);
            }
        }
        return producto;
    }
    public Producto buscar(int busqueda2){
        Producto producto = null;
        for (int i=0; i<productos.size(); i++) {
            if (productos.get(i).getCodigo() == busqueda2) {
                producto = productos.get(i);
            }
        }
        return producto;
    }
    public ArrayList buscarPorTipo (String tipo) {
        ArrayList listaProductosEncontrados = new ArrayList();
        for (int i=0; i<productos.size(); i++) {
            if (productos.get(i).getTipo() == tipo) {
                listaProductosEncontrados.add(productos.get(i));
            }
        }
        return listaProductosEncontrados;
    }
    public int calcularTotal() {
        int total=0;
        for (int i=0; i<productos.size(); i++) {
            total +=productos.get(i).getPrecio()*productos.get(i).getCantidad();
        }
        return total;
    }
}





