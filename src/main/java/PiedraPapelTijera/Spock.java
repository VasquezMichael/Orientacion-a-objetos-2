package PiedraPapelTijera;

public class Spock extends Jugada{

	public Spock() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Resultado competirContra(Jugada otra) {
		return otra.competirContraSpock();
	}

	@Override
	protected Resultado competirContraPiedra() {
		return Resultado.GANA;
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
		return Resultado.PIERDE;
	}

	@Override
	protected Resultado competirContraSpock() {
		return Resultado.EMPATA;
	}
	
	

}
