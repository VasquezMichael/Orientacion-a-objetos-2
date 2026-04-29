package PiedraPapelTijera;

public abstract class Jugada {

	public Jugada() {
		// TODO Auto-generated constructor stub
	}

	public abstract Resultado competirContra(Jugada otra);
	
	protected abstract Resultado competirContraPiedra();
	protected abstract Resultado competirContraPapel();
	protected abstract Resultado competirContraTijera();
	protected abstract Resultado competirContraLagarto();
	protected abstract Resultado competirContraSpock();
}
