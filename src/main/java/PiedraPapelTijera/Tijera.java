package PiedraPapelTijera;

public class Tijera extends Jugada {

	public Tijera() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Resultado competirContra(Jugada otra) {
		return otra.competirContraTijera();
	}

	@Override
	protected Resultado competirContraPiedra() {
		return Resultado.PIERDE;
	}

	@Override
	protected Resultado competirContraPapel() {
		return Resultado.GANA;
	}

	@Override
	protected Resultado competirContraTijera() {
		return Resultado.EMPATA;
	}

	@Override
	protected Resultado competirContraLagarto() {
		return Resultado.GANA;
	}

	@Override
	protected Resultado competirContraSpock() {
		return Resultado.PIERDE;
	}

	
}
