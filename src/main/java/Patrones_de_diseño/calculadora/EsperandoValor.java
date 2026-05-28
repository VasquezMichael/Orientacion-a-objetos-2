package Patrones_de_diseño.calculadora;

public abstract class EsperandoValor implements Estado{

	public EsperandoValor() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public abstract void setValor(Calculadora calculadora, Double unValor);

	@Override
	public void mas(Calculadora calculadora) {
		calculadora.setEstado(new Error());
		
	}

	@Override
	public void resta(Calculadora calculadora) {
		calculadora.setEstado(new Error());
		
	}

	@Override
	public void division(Calculadora calculadora) {
		calculadora.setEstado(new Error());
		
	}

	@Override
	public void por(Calculadora calculadora) {
		calculadora.setEstado(new Error());
		
	}

	@Override
	public String getResultado(Calculadora calculadora) {
		calculadora.setEstado(new Error());
		return "Error";
	}

}
