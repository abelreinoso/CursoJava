package test;

import main.Calculadora;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    private Calculadora calcular = new Calculadora();

    @Test
    void testMultiplicar() {
        double resultado = calcular.multiplicar(80,3);
        assertEquals(240, resultado, 0);
    }

    @Test
    void testSumaYDivision() {
        double resultado = calcular.dividir((calcular.sumar(150,180)),3);
        assertEquals(110, resultado, 0);
    }

    @Test
    void testRestaYMultiplicacion() {
        double resultado = calcular.multiplicar((calcular.restar(90,50)),15);
        assertNotEquals(605, resultado, 0);
    }


    @Test
    void testSumaYMultiplicacion() {
        double resultado = calcular.multiplicar((calcular.sumar(70,40)),25);
        assertNotEquals(2700, resultado, 0);
    }
}