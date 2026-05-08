package Patrones_de_diseño.ejercicio5_sustancias_quimicas_test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Patrones_de_diseño.sustancias_quimicas.Atomo;
import Patrones_de_diseño.sustancias_quimicas.ElementoQuimico;
import Patrones_de_diseño.sustancias_quimicas.Union;

public class ElementoQuimicoTest {

    private Atomo hidrogeno;
    private Atomo oxigeno;
    private Atomo cloro;
    private Atomo sodio;
    private Atomo calcio;

    @BeforeEach
    public void setUp() {
        hidrogeno = new Atomo("Hidrogeno", "H", 1, 1, false);
        oxigeno = new Atomo("Oxigeno", "O", 16, -2, false);
        cloro = new Atomo("Cloro", "Cl", 35, -1, false);
        sodio = new Atomo("Sodio", "Na", 23, 1, true);
        calcio = new Atomo("Calcio", "Ca", 40, 2, true);
    }

    @Test
    public void atomoRetornaSuFormula() {
        assertEquals("H", hidrogeno.formula());
        assertEquals("O", oxigeno.formula());
        assertEquals("Na", sodio.formula());
    }

    @Test
    public void atomoRetornaSuPesoMolecular() {
        assertEquals(1, hidrogeno.pesoMolecular());
        assertEquals(16, oxigeno.pesoMolecular());
        assertEquals(23, sodio.pesoMolecular());
    }

    @Test
    public void atomoRetornaSuCarga() {
        assertEquals(1, hidrogeno.carga());
        assertEquals(-2, oxigeno.carga());
        assertEquals(1, sodio.carga());
    }

    @Test
    public void atomoPuedeSerMetalONoMetal() {
        assertTrue(sodio.esMetal());
        assertFalse(sodio.esNoMetal());

        assertFalse(oxigeno.esMetal());
        assertTrue(oxigeno.esNoMetal());
    }

    @Test
    public void atomoSiempreEsValido() {
        assertTrue(hidrogeno.esValida());
        assertTrue(oxigeno.esValida());
        assertTrue(sodio.esValida());
        assertTrue(calcio.esValida());
    }

    @Test
    public void noSePuedeCrearUnionConListaNull() {
        IllegalArgumentException exception = assertThrows(
            IllegalArgumentException.class,
            () -> new Union(null)
        );

        assertEquals("Una union necesita al menos dos componentes", exception.getMessage());
    }

    @Test
    public void noSePuedeCrearUnionConListaVacia() {
        IllegalArgumentException exception = assertThrows(
            IllegalArgumentException.class,
            () -> new Union(List.of())
        );

        assertEquals("Una union necesita al menos dos componentes", exception.getMessage());
    }

    @Test
    public void noSePuedeCrearUnionConUnSoloComponente() {
        IllegalArgumentException exception = assertThrows(
            IllegalArgumentException.class,
            () -> new Union(List.of(hidrogeno))
        );

        assertEquals("Una union necesita al menos dos componentes", exception.getMessage());
    }

    @Test
    public void unionDeSodioYCloroEsValida() throws IllegalAccessException {
        Union nacl = new Union(List.of(sodio, cloro));

        assertTrue(nacl.esValida());
    }

    @Test
    public void unionDeSodioYCalcioNoEsValidaPorqueTieneDosMetales() throws IllegalAccessException {
        Union union = new Union(List.of(sodio, calcio));

        assertFalse(union.esValida());
    }

    @Test
    public void unionDeNoMetalesEsValida() throws IllegalAccessException {
        Union agua = new Union(List.of(hidrogeno, hidrogeno, oxigeno));

        assertTrue(agua.esValida());
    }

    @Test
    public void unionCalculaFormulaConcatenandoComponentes() throws IllegalAccessException {
        Union agua = new Union(List.of(hidrogeno, hidrogeno, oxigeno));

        assertEquals("HHO", agua.formula());
    }

    @Test
    public void unionCalculaPesoMolecularSumandoComponentes() throws IllegalAccessException {
        Union agua = new Union(List.of(hidrogeno, hidrogeno, oxigeno));

        assertEquals(18, agua.pesoMolecular());
    }

    @Test
    public void unionCalculaCargaSumandoComponentes() throws IllegalAccessException {
        Union agua = new Union(List.of(hidrogeno, hidrogeno, oxigeno));

        assertEquals(0, agua.carga());
    }

    @Test
    public void unionNoEsMetal() throws IllegalAccessException {
        Union agua = new Union(List.of(hidrogeno, oxigeno));

        assertFalse(agua.esMetal());
        assertTrue(agua.esNoMetal());
    }

    @Test
    public void unionPuedeContenerOtraUnion() throws IllegalAccessException {
        Union oh = new Union(List.of(oxigeno, hidrogeno));
        Union hidroxidoDeSodio = new Union(List.of(sodio, oh));

        assertEquals("NaOH", hidroxidoDeSodio.formula());
        assertEquals(40, hidroxidoDeSodio.pesoMolecular());
        assertEquals(0, hidroxidoDeSodio.carga());
        assertTrue(hidroxidoDeSodio.esValida());
    }

    @Test
    public void unionConDosMetalesYUnNoMetalNoEsValida() throws IllegalAccessException {
        Union union = new Union(List.of(sodio, calcio, cloro));

        assertFalse(union.esValida());
    }

    @Test
    public void unionConUnMetalYVariasUnionesNoMetalicasEsValida() throws IllegalAccessException {
        Union oh = new Union(List.of(oxigeno, hidrogeno));
        Union hidroxidoDeCalcio = new Union(List.of(calcio, oh, oh));

        assertEquals("CaOHOH", hidroxidoDeCalcio.formula());
        assertEquals(74, hidroxidoDeCalcio.pesoMolecular());
        assertEquals(0, hidroxidoDeCalcio.carga());
        assertTrue(hidroxidoDeCalcio.esValida());
    }

}
