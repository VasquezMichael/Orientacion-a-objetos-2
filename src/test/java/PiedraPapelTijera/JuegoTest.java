package PiedraPapelTijera;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class JuegoTest {
	

	
	@Test
	public void PidraContraPapelPierdePiedra() {
		Jugada piedra = new Piedra();
		assertEquals(Resultado.PIERDE, piedra.competirContraPapel());
	}
	
	@Test
	public void LagartoContraPiedraPierdeLagarto() {
		Jugada lagarto = new Lagarto();
		
		assertEquals(Resultado.PIERDE, lagarto.competirContraPiedra());
	}
	
	@Test
	public void TijeraContraPapelGanaTijera() {
		Jugada tijera = new Tijera();
		
		assertEquals(Resultado.GANA,tijera.competirContraPapel());
	}
}
