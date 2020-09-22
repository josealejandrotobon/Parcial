package com.Parcial;
import com.Parcial.Producto;
import com.Parcial.Mercado;
import com.Parcial.TipoProducto;
public class AppMercado {
    public static void main(String[] args) {
        Producto zanahoria = new Producto((int) 101, "Zanahoria", (int) 10, (int) 6000, "verdura");
        Producto lechuga = new Producto((int) 102, "Lechuga", (int) 11, (int) 8000, "verdura");
        Producto papitas = new Producto((int) 103, "Papitas", (int) 1, (int) 5000, "mecato");
        Producto jabon = new Producto((int) 104, "Jabon", (int) 9, (int) 2000, "aseo");
        Producto detergente = new Producto((int) 105, "Detergente", (int) 6, (int) 3500, "aseo");
        Producto puntadeanca= new Producto((int) 106, "Punta de Anca", (int) 11, (int) 80000, "carne");
        Producto panelita= new Producto((int) 107, "Panelitas", (int) 10, (int) 3000, "panela");
        Producto chorizo= new Producto((int)107,"Chorioriente",(int)20,(int) 8000,"carne");
        Mercado mercampo = new Mercado("Mercampo");
        mercampo.getProductos().add(zanahoria);
        mercampo.getProductos().add(lechuga);
        mercampo.getProductos().add(papitas);
        mercampo.getProductos().add(jabon);
        mercampo.getProductos().add(detergente);
        mercampo.getProductos().add(puntadeanca);
        mercampo.getProductos().add(panelita);
        System.out.println("Los productos que hay en el mercado son: ");

        System.out.println("Los productos que hay en el supermercado " + mercampo.getSupermercado() + " son: " + mercampo.getProductos());
        System.out.println("Se agrego correctamente el producto " + mercampo.agregar(chorizo));
        System.out.println("Se retiro correctamente el producto " + mercampo.retirar(chorizo.getNombre()));
        Producto buscadoNombre = mercampo.buscarN("Zanahoria");
        System.out.println("Se encontro el producto: " + buscadoNombre.getCodigo() + " " + buscadoNombre.getNombre());
        Producto buscarCodigo = mercampo.buscar(101);
        System.out.println("Se encontro el producto: " + buscarCodigo.getCodigo() + " " + buscarCodigo.getNombre());
        System.out.println(mercampo.buscarPorTipo("Panelitas"));
        System.out.println("El valor del mercado es: " + mercampo.calcularTotal());
    }
}


