package Patrones_de_diseño.ejercicio10_calculadora_test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Patrones_de_diseño.calculadora.Calculadora;

public class CalculadoraTest {

	private Calculadora calculadora;

	@BeforeEach
	public void setUp() {
		this.calculadora = new Calculadora();
	}

	@Test
	public void testResultadoInicialEsCero() {
		assertEquals("0.0", this.calculadora.getResultado());
	}

	@Test
	public void testSetValorActualizaElValorAcumulado() {
		this.calculadora.setValor(5);

		assertEquals("5.0", this.calculadora.getResultado());
	}

	@Test
	public void testSumaYMultiplicacionDelEjemplo() {
		this.calculadora.setValor(5);
		this.calculadora.mas();
		this.calculadora.setValor(3);

		assertEquals("8.0", this.calculadora.getResultado());

		this.calculadora.por();
		this.calculadora.setValor(2);

		assertEquals("16.0", this.calculadora.getResultado());
	}

	@Test
	public void testResta() {
		this.calculadora.setValor(10);
		this.calculadora.menos();
		this.calculadora.setValor(4);

		assertEquals("6.0", this.calculadora.getResultado());
	}

	@Test
	public void testDivision() {
		this.calculadora.setValor(20);
		this.calculadora.dividido();
		this.calculadora.setValor(4);

		assertEquals("5.0", this.calculadora.getResultado());
	}

	@Test
	public void testDivisionPorCeroEntraEnError() {
		this.calculadora.setValor(20);
		this.calculadora.dividido();
		this.calculadora.setValor(0);

		assertEquals("Error", this.calculadora.getResultado());
	}

	@Test
	public void testOperacionSinSetValorEntraEnError() {
		this.calculadora.setValor(5);
		this.calculadora.mas();

		assertEquals("Error", this.calculadora.getResultado());
	}

	@Test
	public void testOperacionMientrasEsperaValorEntraEnError() {
		this.calculadora.setValor(5);
		this.calculadora.mas();
		this.calculadora.por();

		assertEquals("Error", this.calculadora.getResultado());
	}

	@Test
	public void testSoloBorrarSaleDelError() {
		this.calculadora.setValor(20);
		this.calculadora.dividido();
		this.calculadora.setValor(0);

		this.calculadora.setValor(10);
		this.calculadora.mas();

		assertEquals("Error", this.calculadora.getResultado());

		this.calculadora.borrar();

		assertEquals("0.0", this.calculadora.getResultado());
	}
}
