package refactoringEjercicio6Empleados;

public class EmpleadoPlanta extends Empleado{
    private int cantidadHijos = 0;
    /* ......
    Metodo implementado en la superclase
    public double sueldo() {
        return this.getSueldoBasico() + 
        		(this.getCantidadHijos() * 2000) - 
        		(this.getSueldoBasico() * 0.13);
    }
     */
    @Override
    protected double adicionales() {
    	return (this.getCantidadHijos() * 2000);
    }
    
	public int getCantidadHijos() {
		return cantidadHijos;
	}

	public void setCantidadHijos(int cantidadHijos) {
		this.cantidadHijos = cantidadHijos;
	}

    
    
}
