package Ejercicio2;

import java.util.List;

public class Carrito {
    private List <Producto> productos;

    public Carrito(List<Producto> productos) {
        this.productos = productos;
    }

    public double precioTotal() {
        double precioTotal = 0;
        for (Producto producto : productos) {
            precioTotal += producto.totalProducto();
        }
        return precioTotal;
    }
}
