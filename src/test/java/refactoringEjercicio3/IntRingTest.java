package refactoringEjercicio3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import refactoringEjercicio3IteradoresCircularesBis.IntRing;

public class IntRingTest {

    @Test
    public void devuelveElPrimerEnteroEnLaPrimeraLlamada() {
        IntRing ring = new IntRing(new int[]{1, 2, 3});

        assertEquals(1, ring.next());
    }

    @Test
    public void devuelveLosEnterosEnOrden() {
        IntRing ring = new IntRing(new int[]{1, 2, 3});

        assertEquals(1, ring.next());
        assertEquals(2, ring.next());
        assertEquals(3, ring.next());
    }

    @Test
    public void vuelveAlInicioCuandoLlegaAlFinal() {
        IntRing ring = new IntRing(new int[]{1, 2, 3});

        ring.next(); // 1
        ring.next(); // 2
        ring.next(); // 3

        assertEquals(1, ring.next());
    }

    @Test
    public void puedeRecorrerVariasVecesElAnillo() {
        IntRing ring = new IntRing(new int[]{5, 6});

        assertEquals(5, ring.next());
        assertEquals(6, ring.next());
        assertEquals(5, ring.next());
        assertEquals(6, ring.next());
        assertEquals(5, ring.next());
    }
}
