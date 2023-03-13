import java.util.Arrays;
import java.util.Scanner;

public class C4Ejercicio1c {
    private int[] numeros;
    String orden;

    public void cargaValores() {
        Scanner scanner = new Scanner(System.in);
        numeros = new int[3];
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese numero " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }
        System.out.print("Ingrese orden(a/d): ");
        orden = scanner.next();
    }

    public void ordenarNumeros() {
        if (orden.equals("a")) {
            Arrays.sort(numeros);
        } else {
            for (int i = 0; i < numeros.length; i++) {
                for (int j = 1; j < (numeros.length - i); j++) {
                    if (numeros[j - 1] < numeros[j]) {
                        int temporal = numeros[j - 1];
                        numeros[j - 1] = numeros[j];
                        numeros[j] = temporal;
                    }
                }
            }
        }
    }
    public void ordenarNumeros(int num1, int num2, int num3, String ord){
        numeros = new int[]{num1, num2, num3};
        orden = ord; // no ordena
    }

    private void imprimir() {
        System.out.println("El vector ordenado es: " + Arrays.toString(numeros));
    }

    public static void main(String[] args) {
        C4Ejercicio1c ej1c = new C4Ejercicio1c();
        ej1c.cargaValores();
        ej1c.ordenarNumeros();
        ej1c.imprimir();
        ej1c.ordenarNumeros(10, 30, 20, "d"); // No ordena
        ej1c.imprimir();
    }
}


