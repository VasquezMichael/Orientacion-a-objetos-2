package Patrones_de_diseño.subteway;

public class Componente {
	private String nombre;
	private double costo;
	
	public Componente() {
		// TODO Auto-generated constructor stub
	}

	public Componente(String nombre, double costo) {
		super();
		this.nombre = nombre;
		this.costo = costo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getCosto() {
		return costo;
	}

	public void setCosto(int costo) {
		this.costo = costo;
	}

	
	
}
