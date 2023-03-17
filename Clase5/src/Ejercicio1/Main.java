package Ejercicio1;

public class Main {
    public static void main(String[] args) {
        // crear persona
        Persona persona1 = new Persona("Abel", 1);
        Persona persona2 = new Persona("Juan", 2);
        Persona persona3 = new Persona("Pepe", 3);

        Producto producto1 = new Producto("Cepillo Dientes", 250.0, 1);
        Producto producto2 = new Producto("Pasta Dientes", 150.0, 1);
        Producto producto3 = new Producto("Enjuague Bucal", 400.0, 1);

        Carrito carrito1 = new Carrito(persona1);
        carrito1.agregoProducto(producto1);
        System.out.println("El costo final es: " + carrito1.costoFinal());

        Carrito carrito2 = new Carrito(producto1, producto2, producto3, persona2);
        System.out.println("El costo final es: " + carrito2.costoFinal());

        Carrito carrito3 = new Carrito(producto3, persona3);
        System.out.println("El costo final es: " + carrito3.costoFinal());


    }
}
