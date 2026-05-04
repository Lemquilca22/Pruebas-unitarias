package Calculadora;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


public class TestCalculadora {

    @Test
    void testSumar(){
        Calculadora calc = new Calculadora();
        assertEquals(8,calc.sumar(3,5));
    }
    @Test
    void testSumarNegativos(){
        Calculadora calc = new Calculadora();
        assertEquals(-7,calc.sumar(-2,-5));
    }
    @Test
    void testResta(){
        Calculadora calc = new Calculadora();
        assertEquals(3,calc.restar(6,3));
    }
    @Test
    void testMultiplicarCero(){
        Calculadora calc = new Calculadora();
        assertEquals(0,calc.multiplicar(27,0));
    }
    @Test
    void testDivisionCorrecta(){
        Calculadora calc = new Calculadora();
        assertEquals(9,calc.dividir(27,3));
    }
    @Test
    void testDivisionCero(){
        Calculadora calc = new Calculadora();
        assertEquals(0,calc.dividir(0,4));
    }
    @Test
    void testDivisionNegativos(){
        Calculadora calc = new Calculadora();
        assertEquals(-5,calc.dividir(-25,5));
    }
}
