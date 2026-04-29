package PatronesBibliotecaTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import Patrones_de_diseño.Biblioteca;
import Patrones_de_diseño.Exporter;
import Patrones_de_diseño.Socio;

public class BibliotecaTest {

    @Test
    public void testBibliotecaInicialmenteExportaListaVacia() {
        Biblioteca biblioteca = new Biblioteca();

        assertEquals("[]", biblioteca.exportarSocios());
    }

    @Test
    public void testAgregarUnSocioYExportar() {
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.agregarSocio(new Socio("Arya Stark", "needle@stark.com", "5234-5"));

        String esperado = "["
                + System.lineSeparator()
                + "\t{"
                + System.lineSeparator()
                + "\t\t\"nombre\": \"Arya Stark\","
                + System.lineSeparator()
                + "\t\t\"email\": \"needle@stark.com\","
                + System.lineSeparator()
                + "\t\t\"legajo\": \"5234-5\""
                + System.lineSeparator()
                + "\t}"
                + System.lineSeparator()
                + "]";

        assertEquals(esperado, biblioteca.exportarSocios());
    }

    @Test
    public void testAgregarDosSociosYExportar() {
        Biblioteca biblioteca = new Biblioteca();

        biblioteca.agregarSocio(new Socio("Arya Stark", "needle@stark.com", "5234-5"));
        biblioteca.agregarSocio(new Socio("Tyron Lannister", "tyron@thelannisters.com", "2345-2"));

        String esperado = "["
                + System.lineSeparator()
                + "\t{"
                + System.lineSeparator()
                + "\t\t\"nombre\": \"Arya Stark\","
                + System.lineSeparator()
                + "\t\t\"email\": \"needle@stark.com\","
                + System.lineSeparator()
                + "\t\t\"legajo\": \"5234-5\""
                + System.lineSeparator()
                + "\t},"
                + System.lineSeparator()
                + "\t{"
                + System.lineSeparator()
                + "\t\t\"nombre\": \"Tyron Lannister\","
                + System.lineSeparator()
                + "\t\t\"email\": \"tyron@thelannisters.com\","
                + System.lineSeparator()
                + "\t\t\"legajo\": \"2345-2\""
                + System.lineSeparator()
                + "\t}"
                + System.lineSeparator()
                + "]";

        assertEquals(esperado, biblioteca.exportarSocios());
    }

    @Test
    public void testBibliotecaTieneExporterPorDefecto() {
        Biblioteca biblioteca = new Biblioteca();

        assertNotNull(biblioteca.getExporter());
    }

    @Test
    public void testSetearOtroExporter() {
        Biblioteca biblioteca = new Biblioteca();

        Exporter exporterFalso = socios -> "exportacion falsa";

        biblioteca.setExporter(exporterFalso);

        assertEquals("exportacion falsa", biblioteca.exportarSocios());
    }
}