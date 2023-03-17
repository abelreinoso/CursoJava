package Ejercicio2;

public class Producto {
    private String nombreProducto;
    private Double precioUnitario;
    private Integer cantidad;

    public Producto(Integer cantidad, Double precioUnitario, String nombreProducto) {
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
        this.nombreProducto = nombreProducto;
    }
    public Double totalProducto(){
        return cantidad * precioUnitario;
    }

}
