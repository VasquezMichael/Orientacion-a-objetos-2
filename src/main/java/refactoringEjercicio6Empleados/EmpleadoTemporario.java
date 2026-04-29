package refactoringEjercicio6Empleados;

public class EmpleadoTemporario extends Empleado{

    private double horasTrabajadas = 0;
    private int cantidadHijos = 0;
    /* metodo implementado en la superclase
    
	public double sueldo() {
		return this.getSueldoBasico() + 
				(this.getHorasTrabajadas() * 500) 
				+ (this.getCantidadHijos() * 1000) - 
				(this.getSueldoBasico() * 0.13);
	}
	*/
	
	@Override
	protected double adicionales() {
		return (this.getHorasTrabajadas() * 500) 
				+ (this.getCantidadHijos() * 1000);
	}

	public double getHorasTrabajadas() {
		return horasTrabajadas;
	}

	public void setHorasTrabajadas(double horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}

	public int getCantidadHijos() {
		return cantidadHijos;
	}

	public void setCantidadHijos(int cantidadHijos) {
		this.cantidadHijos = cantidadHijos;
	}

	

}
