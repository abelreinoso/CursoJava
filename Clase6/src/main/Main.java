package main;

public class Main {
    public static void main(String[] args) {
        Calculadora calcular = new Calculadora();
        System.out.println(calcular.sumar(1,3));
        System.out.println(calcular.restar(1,3));
        System.out.println(calcular.multiplicar(1,3));
        System.out.println(calcular.dividir(12,3));
    }
}
