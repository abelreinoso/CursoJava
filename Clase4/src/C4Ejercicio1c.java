import java.util.Arrays;
import java.util.Scanner;

public class C4Ejercicio1c {
    private static int[] numeros;
    private static String orden;

    public void cargaValores(){
        Scanner scanner = new Scanner(System.in);
        numeros = new int[3];
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese numero: ");
            numeros[i] = scanner.nextInt();
        }
        System.out.print("Ingrese 'a' para ordenar de manera ascendente o 'd' para ordenar de manera descendente: ");
        orden = scanner.next();
    }

    public static void ordenarNumeros() {
        if (orden.equals("a")) {
            Arrays.sort(numeros);
            System.out.println("El vector ordenado es: " + Arrays.toString(numeros));
        } else if (orden.equals("d")){
            for (int i = 0; i < numeros.length; i++) {
                for (int j = 1; j < (numeros.length - i); j++) {
                    if (numeros[j - 1] < numeros[j]) {
                        int temporal = numeros[j - 1];
                        numeros[j - 1] = numeros[j];
                        numeros[j] = temporal;
                    }
                }
            }
            System.out.println("El vector ordenado es: " + Arrays.toString(numeros));
        } else {
            System.out.println("Error. Ingrese solo 'a' o 'd'");
        }
    }
    public static void ordenarNumeros(int num1, int num2, int num3, String ord){
        numeros = new int[]{num1, num2, num3};
        orden = ord;
        ordenarNumeros();
    }

    public static void main(String[] args) {
        C4Ejercicio1c ej1c = new C4Ejercicio1c();
        ej1c.cargaValores();
        ordenarNumeros();
        ordenarNumeros(10, 30, 20, "d");
    }
}


