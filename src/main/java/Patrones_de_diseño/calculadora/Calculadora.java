package Patrones_de_diseño.calculadora;

public class Calculadora {
	private double valorAcumulado;
	private Estado estado;
	
	public Calculadora() {
		this.reiniciar();
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public double getValorAcumulado() {
		return valorAcumulado;
	}

	public void setValorAcumulado(double valorAcumulado) {
		this.valorAcumulado = valorAcumulado;
	}
	
	public String getResultado() {
		return this.estado.getResultado(this);
	}
	
	private void reiniciar() {
		this.valorAcumulado = 0;
		this.estado = new EstadoInicial();
	}
	
	public void borrar() {
		this.reiniciar();
	}
	
	public void setValor(double unValor) {
		this.estado.setValor(this, unValor);
	}
	
	public void mas() {
		this.estado.mas(this);
	}
	
	public void resta(){
		this.estado.resta(this);
	}

	public void menos() {
		this.resta();
	}
	
	public void division() {
		this.estado.division(this);
	}

	public void dividido() {
		this.division();
	}
	
	public void por() {
		this.estado.por(this);
	}
	
}
