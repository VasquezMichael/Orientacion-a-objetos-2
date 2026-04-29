package PatronesBibliotecaTest;


import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import Patrones_de_diseño.Exporter;
import Patrones_de_diseño.Socio;
import Patrones_de_diseño.VoorheesExporter;

public class VoorheesExporterTest {

    @Test
    public void testExportarListaVacia() {
        Exporter exporter = new VoorheesExporter();
        List<Socio> socios = new ArrayList<>();

        assertEquals("[]", exporter.exportar(socios));
    }

    @Test
    public void testExportarUnSocio() {
        Exporter exporter = new VoorheesExporter();
        List<Socio> socios = new ArrayList<>();
        socios.add(new Socio("Arya Stark", "needle@stark.com", "5234-5"));

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

        assertEquals(esperado, exporter.exportar(socios));
    }

    @Test
    public void testExportarDosSocios() {
        Exporter exporter = new VoorheesExporter();
        List<Socio> socios = new ArrayList<>();

        socios.add(new Socio("Arya Stark", "needle@stark.com", "5234-5"));
        socios.add(new Socio("Tyron Lannister", "tyron@thelannisters.com", "2345-2"));

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

        assertEquals(esperado, exporter.exportar(socios));
    }
}