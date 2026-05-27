package Patrones_de_diseño.ejercicio9_decodificador_de_peliculas_test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Patrones_de_diseño.Decodificador_de_peliculas.Decodificador;
import Patrones_de_diseño.Decodificador_de_peliculas.Pelicula;
import Patrones_de_diseño.Decodificador_de_peliculas.SugerirPuntaje;
import Patrones_de_diseño.Decodificador_de_peliculas.SugerirSimilaridad;

public class DecodificadorTest {

	private Decodificador decodificador;
	private Pelicula thor;
	private Pelicula capitanAmerica;
	private Pelicula ironMan;
	private Pelicula dunkirk;
	private Pelicula rocky;
	private Pelicula rambo;

	@BeforeEach
	public void setUp() {
		this.thor = new Pelicula("Thor", 2007, 7.9);
		this.capitanAmerica = new Pelicula("Capitan America", 2016, 7.8);
		this.ironMan = new Pelicula("Iron man", 2010, 7.9);
		this.dunkirk = new Pelicula("Dunkirk", 2017, 7.9);
		this.rocky = new Pelicula("Rocky", 1976, 8.1);
		this.rambo = new Pelicula("Rambo", 1979, 7.8);

		this.thor.agregarPeliculaSimilar(this.capitanAmerica);
		this.thor.agregarPeliculaSimilar(this.ironMan);
		this.capitanAmerica.agregarPeliculaSimilar(this.ironMan);
		this.rocky.agregarPeliculaSimilar(this.rambo);

		this.decodificador = new Decodificador(
				List.of(this.thor, this.capitanAmerica, this.ironMan, this.dunkirk, this.rocky, this.rambo),
				new SugerirSimilaridad());
		this.decodificador.reproducir(this.thor);
		this.decodificador.reproducir(this.rocky);
	}

	@Test
	public void testSugerenciasPorSimilaridadYLuegoPorPuntaje() {
		this.decodificador.setCriterio(new SugerirSimilaridad());

		assertEquals(List.of(this.capitanAmerica, this.ironMan, this.rambo), this.decodificador.sugerirPeliculas());

		this.decodificador.setCriterio(new SugerirPuntaje());

		assertEquals(List.of(this.dunkirk, this.ironMan, this.capitanAmerica), this.decodificador.sugerirPeliculas());
	}
}
