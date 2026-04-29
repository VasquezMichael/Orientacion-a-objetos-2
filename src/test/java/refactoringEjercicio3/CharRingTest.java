package refactoringEjercicio3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import refactoringEjercicio3IteradoresCircularesBis.CharRing;
public class CharRingTest {

    @Test
    public void devuelveElPrimerCaracterEnLaPrimeraLlamada() {
        CharRing ring = new CharRing("abc");

        assertEquals('a', ring.next());
    }

    @Test
    public void devuelveLosCaracteresEnOrden() {
        CharRing ring = new CharRing("abc");

        assertEquals('a', ring.next());
        assertEquals('b', ring.next());
        assertEquals('c', ring.next());
    }

    @Test
    public void vuelveAlInicioCuandoLlegaAlFinal() {
        CharRing ring = new CharRing("abc");

        ring.next(); // a
        ring.next(); // b
        ring.next(); // c

        assertEquals('a', ring.next());
    }

    @Test
    public void puedeRecorrerVariasVecesElAnillo() {
        CharRing ring = new CharRing("ab");

        assertEquals('a', ring.next());
        assertEquals('b', ring.next());
        assertEquals('a', ring.next());
        assertEquals('b', ring.next());
        assertEquals('a', ring.next());
    }
}
