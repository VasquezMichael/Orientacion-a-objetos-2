package PatronesBibliotecaTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import Patrones_de_diseño.Socio;

public class SocioTest {

    @Test
    public void testCrearSocio() {
        Socio socio = new Socio("Arya Stark", "needle@stark.com", "5234-5");

        assertEquals("Arya Stark", socio.getNombre());
        assertEquals("needle@stark.com", socio.getEmail());
        assertEquals("5234-5", socio.getLegajo());
    }

    @Test
    public void testSettersDeSocio() {
        Socio socio = new Socio("Arya Stark", "needle@stark.com", "5234-5");

        socio.setNombre("Tyron Lannister");
        socio.setEmail("tyron@thelannisters.com");
        socio.setLegajo("2345-2");

        assertEquals("Tyron Lannister", socio.getNombre());
        assertEquals("tyron@thelannisters.com", socio.getEmail());
        assertEquals("2345-2", socio.getLegajo());
    }
}
