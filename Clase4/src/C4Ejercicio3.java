import java.io.*;
import java.util.Scanner;

public class C4Ejercicio3 {
    private static final String ABECEDARIO = "abcdefghijklmnñopqrstuvwxyz ";
    static String texto;
    static File myFile = null;

    public static void entradaTexto(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese texto: ");
        texto = scanner.nextLine();
    }

    public static void procesarArchivo(String archivoEntrada, String archivoSalida,
                                       boolean codificar, int desplazamiento) throws IOException {
        try {
            myFile = new File("C:\\Users\\abelr\\Documentos\\CursoJava\\Clase4\\src\\" + archivoEntrada);
            if (myFile.createNewFile()) {
                System.out.println("File created: " + myFile.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        try {
            FileWriter myWriter = new FileWriter(myFile);
            myWriter.write(texto);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        BufferedReader lector = new BufferedReader(new FileReader("C:\\Users\\abelr\\Documentos\\CursoJava\\Clase4\\src\\" + archivoEntrada));
        BufferedWriter escritor = new BufferedWriter(new FileWriter("C:\\Users\\abelr\\Documentos\\CursoJava\\Clase4\\src\\" + archivoSalida));

        String linea;
        while ((linea = lector.readLine()) != null) {
            String resultado = codificar ? codificar(linea, desplazamiento) : decodificar(linea, desplazamiento);
            escritor.write(resultado);
            escritor.newLine();
        }

        lector.close();
        escritor.close();
        System.out.println("Procesamiento completado correctamente.");
    }

    private static String codificar(String texto, int desplazamiento) {
        char[] caracteres = texto.toLowerCase().toCharArray();
        for (int i = 0; i < caracteres.length; i++) {
            int indice = ABECEDARIO.indexOf(caracteres[i]);
            if (indice >= 0) {
                int nuevoIndice = (indice + desplazamiento) % ABECEDARIO.length();
                caracteres[i] = ABECEDARIO.charAt(nuevoIndice);
            }
        }
        return String.valueOf(caracteres);
    }

    private static String decodificar(String texto, int desplazamiento) {
        char[] caracteres = texto.toCharArray();
        for (int i = 0; i < caracteres.length; i++) {
            int indice = ABECEDARIO.indexOf(caracteres[i]);
            if (indice >= 0) {
                int nuevoIndice = (indice - desplazamiento + ABECEDARIO.length()) % ABECEDARIO.length();
                caracteres[i] = ABECEDARIO.charAt(nuevoIndice);
            }
        }
        return String.valueOf(caracteres);
    }

    public static void main(String[] args) throws IOException {
        entradaTexto();
        // true para codificar, false para decodificar
        procesarArchivo("archivoEntrada.txt", "archivoSalida.txt",true , 1);
        entradaTexto();
        procesarArchivo("archivoEntrada2.txt", "archivoSalida2.txt",false , 1);
    }
}