package Patrones_de_diseño.calculadora;

public class Error implements Estado{

	public Error() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setValor(Calculadora calculadora, Double unValor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mas(Calculadora calculadora) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resta(Calculadora calculadora) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void division(Calculadora calculadora) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void por(Calculadora calculadora) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getResultado(Calculadora calculadora) {
		return "Error";
	}

}
