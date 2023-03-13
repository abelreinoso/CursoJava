
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class C4Ejercicio2 {
    File myFile = null;
    int operacion;
    int num = 0, count = 0, count2 = 1;

    public void crearArchivo(){
        try {
            myFile = new File("C:\\Users\\abelr\\Documentos\\CursoJava\\Clase4\\src\\archivo.txt");
            if (myFile.createNewFile()) {
                System.out.println("File created: " + myFile.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    public void escribirArchivo(){
        try {
            FileWriter myWriter = new FileWriter(myFile);
            myWriter.write("1 2 3 4 5");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public void elegirOperacion(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Selecciona '1' para sumar o '2' para multiplicar: ");
        operacion = scanner.nextInt();
    }
    public void operarArchivo(){
        try{
            Scanner archivo = new Scanner(myFile);
            while (archivo.hasNext()) {
                num = archivo.nextInt();
                System.out.print(" " + num); // muestra los numeros a sumar
                switch (operacion){
                    case 1:
                        count = count + num;
                        break;
                    case 2:
                        count2 = count2 * num;
                        count = count2;
                        break;
                }
            }
            System.out.println();
            System.out.println("La total es: " + count);
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();;
        }
    }

    public static void main(String[] args) {
        C4Ejercicio2 ej2 = new C4Ejercicio2();
        ej2.crearArchivo();
        ej2.escribirArchivo();
        ej2.elegirOperacion();
        ej2.operarArchivo();
    }
}


