package Patrones_de_diseño.calculo_de_sueldos;

public abstract class Empleado {
	private String name;
	private String apellido;
	
	public Empleado() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	protected abstract double basico();
	
	protected abstract double adicional();
	
	private double descuento() {
		return (this.basico() * 0.13) + (this.adicional() * 0.05);
	}
	
	protected double sueldo() {
		return this.basico() + this.adicional() - this.descuento();
	}
}
