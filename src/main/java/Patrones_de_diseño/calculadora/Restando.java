package Patrones_de_diseño.calculadora;

public class Restando extends EsperandoValor{

	@Override
	public void setValor(Calculadora calculadora, Double unValor) {
		calculadora.setValorAcumulado(calculadora.getValorAcumulado() - unValor);
		calculadora.setEstado(new EstadoInicial());
	}

}
