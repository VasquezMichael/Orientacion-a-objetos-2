package refactoringEjercicio6Empleados;

public abstract class Empleado {
	protected double sueldoBasico = 0;
	protected String nombre;
	protected String apellido;
	
	public Empleado() {
		// TODO Auto-generated constructor stub
	}

	protected double sueldo() {
		return this.getSueldoBasico() + 
				this.adicionales() - 
				this.descuentos();
		
	}
	
	protected double descuentos() {
		return (this.getSueldoBasico()* 0.13 );
	}
	
	abstract protected double adicionales();
	
	public double getSueldoBasico() {
		return sueldoBasico;
	}

	public void setSueldoBasico(double sueldoBasico) {
		this.sueldoBasico = sueldoBasico;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	
	
}
