package PiedraPapelTijera;

public class Lagarto extends Jugada{

	public Lagarto() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Resultado competirContra(Jugada otra) {
		return otra.competirContraLagarto();
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
		return Resultado.PIERDE;
	}

	@Override
	protected Resultado competirContraLagarto() {
		return Resultado.EMPATA;
	}

	@Override
	protected Resultado competirContraSpock() {
		return Resultado.GANA;
	}

}
