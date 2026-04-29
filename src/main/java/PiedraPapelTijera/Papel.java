package PiedraPapelTijera;

public class Papel extends Jugada {

	public Papel() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Resultado competirContra(Jugada otra) {
		return otra.competirContraPapel();
	}

	@Override
	protected Resultado competirContraPiedra() {
		return Resultado.GANA;
	}

	@Override
	protected Resultado competirContraPapel() {
		return Resultado.EMPATA;
	}

	@Override
	protected Resultado competirContraTijera() {
		return Resultado.PIERDE;
	}

	@Override
	protected Resultado competirContraLagarto() {
		return Resultado.PIERDE;
	}

	@Override
	protected Resultado competirContraSpock() {
		return Resultado.GANA;
	}

	
}
