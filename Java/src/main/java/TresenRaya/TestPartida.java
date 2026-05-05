package TresenRaya;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestPartida {
    @Test
    void testColocarFichaCorrectamente(){
        Partida p1 = new Partida();
        p1.cargarTablero();
        assertTrue(p1.colocarFicha(0,2,'x'),"");
        assertEquals('x',p1.getFicha(0,2));
    } //Sirve tanto para comprobar
    // ficha fuera del tablero, y colocar ficha si no está ocupada

    @Test
    void testVictoriaFila(){
        Partida p1 = new Partida();
        p1.colocarFicha(0,0,'x');
        p1.colocarFicha(0,1,'x');
        p1.colocarFicha(0,2,'x');
        assertTrue(p1.victoriaFila());
    }

    @Test
    void testVictoriaColumna(){
        Partida p1 = new Partida();
        p1.cargarTablero();
        p1.colocarFicha(0,0,'o');
        p1.colocarFicha(1,0,'o');
        p1.colocarFicha(2,0,'o');
        assertTrue(p1.victoriaColumna());
    }

    @Test
    void testVictoriaDiagonal(){
        Partida p1 = new Partida();
        p1.cargarTablero();
        p1.colocarFicha(0,0,'x');
        p1.colocarFicha(1,1,'x');
        p1.colocarFicha(2,2,'x');
        assertTrue(p1.victoriaDiagonal());
    }
    @Test
    void testEmpate(){
        Partida p1 = new Partida();
        p1.cargarTablero();
        p1.colocarFicha(0, 0, 'x'); p1.colocarFicha(0, 1, 'o'); p1.colocarFicha(0, 2, 'x');
        p1.colocarFicha(1, 0, 'x'); p1.colocarFicha(1, 1, 'o'); p1.colocarFicha(1, 2, 'o');
        p1.colocarFicha(2, 0, 'o'); p1.colocarFicha(2, 1, 'x'); p1.colocarFicha(2, 2, 'x');
        assertTrue(p1.empate());
    }




}
