package Patrones_de_diseño.calculo_de_sueldos;

public class Planta extends EmpleadoConFamilia{
	private int añosAntiguedad;
	
	public Planta() {
		// TODO Auto-generated constructor stub
	}

	@Override
	protected double basico() {
		return 50000;
	}
	
	@Override
	protected double adicional() {
		
		return super.adicional() + (2000 * this.añosAntiguedad);
	}

}
