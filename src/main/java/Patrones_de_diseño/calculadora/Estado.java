package Patrones_de_diseño.calculadora;

public interface Estado {
	
	void setValor(Calculadora calculadora, Double unValor);
	
	void mas(Calculadora calculadora);
	
	void resta(Calculadora calculadora);
	
	void division(Calculadora calculadora);
	
	void por(Calculadora calculadora);
	
	String getResultado(Calculadora calculadora);
}
