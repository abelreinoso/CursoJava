import java.util.Arrays;

public class C4Ejercicio1a {
    public void ordenarNumeros(int n1, int n2, int n3, char aOd) {
        int temporal;

        int[] numeros = {n1,n2,n3};
        if (aOd == 'a') {
            for (int i = 0; i < numeros.length; i++) {
                for (int j = 1; j < (numeros.length - i); j++) {
                    if (numeros[j - 1] > numeros[j]) {
                        temporal = numeros[j - 1];
                        numeros[j - 1] = numeros[j];
                        numeros[j] = temporal;
                    }
                }
            }
        } else {
            for (int i = 0; i < numeros.length; i++) {
                for (int j = 1; j < (numeros.length - i); j++) {
                    if (numeros[j - 1] < numeros[j]) {
                        temporal = numeros[j - 1];
                        numeros[j - 1] = numeros[j];
                        numeros[j] = temporal;
                    }
                }
            }
        }
        System.out.println("El vector ordenado es:"+Arrays.toString(numeros));
    }

    public static void main(String[] args) {
        C4Ejercicio1a ejercicio1 = new C4Ejercicio1a();
        ejercicio1.ordenarNumeros(1,2,3, 'a');
        ejercicio1.ordenarNumeros(34,22,149, 'd');
    }
}

