package PiedraPapelTijera;

public class Piedra extends Jugada {

	public Piedra() {
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public Resultado competirContra(Jugada otra) {
		return otra.competirContraPiedra();
	}


	@Override
	protected Resultado competirContraPiedra() {
		return Resultado.EMPATA;
	}


	@Override
	protected Resultado competirContraPapel() {
		return Resultado.PIERDE;
	}


	@Override
	protected Resultado competirContraTijera() {
		return Resultado.GANA;
	}


	@Override
	protected Resultado competirContraLagarto() {
		return Resultado.GANA;
	}


	@Override
	protected Resultado competirContraSpock() {
		return Resultado.GANA;
	}
}
