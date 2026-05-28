package Patrones_de_diseño.calculadora;

public class EstadoInicial implements Estado{

	public EstadoInicial() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setValor(Calculadora calculadora, Double unValor) {
		calculadora.setValorAcumulado(unValor);
	}

	@Override
	public void mas(Calculadora calculadora) {
		calculadora.setEstado(new Sumando());
	}

	@Override
	public void resta(Calculadora calculadora) {
		calculadora.setEstado(new Restando());
		
	}

	@Override
	public void division(Calculadora calculadora) {
		calculadora.setEstado(new Dividiendo());
		
	}

	@Override
	public void por(Calculadora calculadora) {
		calculadora.setEstado(new Multiplicando());
		
	}

	@Override
	public String getResultado(Calculadora calculadora) {
		return Double.toString(calculadora.getValorAcumulado());
	}

}
