package Patrones_de_diseño.calculo_de_sueldos;

public class Temporario extends EmpleadoConFamilia{
	
	private int cantidadHorasTrabajadas;
	
	public Temporario() {
		// TODO Auto-generated constructor stub
	}
	
	
	public int getCantidadHorasTrabajadas() {
		return cantidadHorasTrabajadas;
	}


	public void setCantidadHorasTrabajadas(int cantidadHorasTrabajadas) {
		this.cantidadHorasTrabajadas = cantidadHorasTrabajadas;
	}


	@Override
	protected double basico() {
		return 20000 + (this.cantidadHorasTrabajadas * 300);
	}

	


}
