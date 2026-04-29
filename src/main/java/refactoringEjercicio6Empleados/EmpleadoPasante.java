package refactoringEjercicio6Empleados;

public class EmpleadoPasante extends Empleado{

    /* Metodo implementado en la superclase
    
    public double sueldo() {
        return this.getSueldoBasico() - (this.getSueldoBasico() * 0.13);
    }
    */
    protected double adicionales() {
    	return 0;
    }

    
    
}
