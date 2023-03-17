package Ejercicio2;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LeerArchivo {
    private final String ARCHIVO;

    public LeerArchivo(String nombreArchivo) {
        this.ARCHIVO = nombreArchivo;
    }

    public List <Producto> leerProductos() throws IOException {
        List <Producto> productos = new ArrayList<>();

        BufferedReader leer = new BufferedReader(new FileReader(ARCHIVO));
        String linea;
        boolean primerLinea = true;
        while ((linea = leer.readLine()) != null) {
            if (primerLinea) {
                primerLinea = false;
                continue;
            }
            String[] celdas = linea.split(",");
            int cantidad = Integer.parseInt(celdas[0]);
            double precioUnitario = Double.parseDouble(celdas[1]);
            String nombreProducto = celdas[2];
            Producto producto = new Producto(cantidad, precioUnitario, nombreProducto);
            productos.add(producto);
        }
        leer.close();

        return productos;
    }
}
