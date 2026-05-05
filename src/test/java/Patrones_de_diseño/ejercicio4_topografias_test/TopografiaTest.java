package Patrones_de_diseño.ejercicio4_topografias_test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Patrones_de_diseño.topografias.Agua;
import Patrones_de_diseño.topografias.Mixta;
import Patrones_de_diseño.topografias.Tierra;
import Patrones_de_diseño.topografias.Topografia;

public class TopografiaTest {
	private Topografia agua;
	private Topografia tierra;
	private Topografia mixta;
	private Topografia mixta2;

	@BeforeEach
	public void setUp() {
		agua = new Agua();
		tierra = new Tierra();
		mixta = new Mixta(new Agua(), new Tierra(), new Agua(), new Tierra());
		mixta2 = new Mixta(new Agua(), new Tierra(), new Agua(), new Tierra());
		
	}
	
	@Test
	public void unaTopografiaAguaDevuelveProporcionAgua1() {
		assertEquals(1, agua.proporcionAgua());
	}
	@Test
	public void unaTopografiaAguaDevuelveProporcionTierra0() {
		assertEquals(0, agua.proporcionTierra());
	}
	
	@Test
	public void unaTopografiaTierraDevuelveProporcionAgua0() {
		assertEquals(0, tierra.proporcionAgua());
	}
	@Test
	public void unaTopografiaTierraDevuelveProporcionTierra1() {
		assertEquals(1, tierra.proporcionTierra());
	}
	
	@Test
	public void unaTopografiaMixtaDevuelveProporcionAgua() {
		assertEquals(0.5, mixta.proporcionAgua());
	}
	
	@Test
	public void dosTopografiasMixtasSonIgualesSiTienenLaMismaProporciones() {
		assertEquals(true, mixta.equals(mixta2));
		assertEquals(true, agua.equals(new Agua()));
		assertEquals(true, tierra.equals(new Tierra()));
	}
}
