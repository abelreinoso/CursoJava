package Ejercicio2;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        LeerArchivo archivo1 = new LeerArchivo("C:\\Users\\abelr\\Documentos\\CursoJava\\Clase5\\src\\Ejercicio2\\productos.txt");
        List<Producto> productos1 = archivo1.leerProductos();

        Carrito carrito1 = new Carrito(productos1);
        double precioTotal = carrito1.precioTotal();
        System.out.println("El precio total es: " + precioTotal);
    }
}
