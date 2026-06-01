package parcialesPatrones.excursionesParcial2022Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import parcialesPatrones.excursionesParcial2022PrimeraFecha.Excursion;
import parcialesPatrones.excursionesParcial2022PrimeraFecha.Usuario;

public class ExcursionTest {
	Excursion excursion;
	
	@BeforeEach
	void setUp() {
		excursion = new Excursion("Dos dias en kayak bajando el Parana", LocalDate.of(2026, 6, 1),
				LocalDate.of(2026, 6, 3), "rio", 200, 1, 2);
		excursion.inscribir(new Usuario("Michael", "vasquez", "email1"));
		excursion.inscribir(new Usuario("Steven", "bendezu", "email2"));
	}

	
	@Test
	void inscribirUsuarioCuandoExcursionEstaCompletaLoAgregaAListaDeEspera() {
		Usuario usuarioEnEspera = new Usuario("nuevo", "a esperar", "otro email");
		
		assertEquals(0, excursion.getListaEspera().size());
		assertEquals(excursion.getCupoMaximo(), excursion.getInscriptos().size());
		
		excursion.inscribir(usuarioEnEspera);
		
		assertEquals(1, excursion.getListaEspera().size());
		assertSame(usuarioEnEspera, excursion.getListaEspera().get(0));
		assertEquals(excursion.getCupoMaximo(), excursion.getInscriptos().size());
	}
}
