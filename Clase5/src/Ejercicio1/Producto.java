package Ejercicio1;

public class Producto {
    private String nombre;
    private Double precio;
    private int cantidad;
    private static final Double minPrecio = 0.1;

    public Producto(String nombre, Double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }
}
