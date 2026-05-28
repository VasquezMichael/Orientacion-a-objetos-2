package Patrones_de_diseño.calculadora;

public class Dividiendo extends EsperandoValor{

	@Override
	public void setValor(Calculadora calculadora, Double unValor) {
		if(unValor == 0) {
			calculadora.setEstado(new Error());
			return;
		}
		calculadora.setValorAcumulado(calculadora.getValorAcumulado() / unValor);
		calculadora.setEstado(new EstadoInicial());
		
	}

}
