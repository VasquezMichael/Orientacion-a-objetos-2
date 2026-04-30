package Patrones_de_diseño.calculo_de_sueldos;

public class Pasante extends Empleado{
	private int cantidadExamenesRendidos;
	
	public Pasante() {
		// TODO Auto-generated constructor stub
	}

	
	
	public int getCantidadExamenesRendidos() {
		return cantidadExamenesRendidos;
	}



	public void setCantidadExamenesRendidos(int cantidadExamenesRendidos) {
		this.cantidadExamenesRendidos = cantidadExamenesRendidos;
	}



	@Override
	protected double basico() {
		return 20000;
	}

	@Override
	protected double adicional() {
		
		return 2000 * this.cantidadExamenesRendidos;
	}
	
	

}
