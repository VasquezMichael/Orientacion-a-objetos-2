package Patrones_de_diseño.calculo_de_sueldos;

public abstract class EmpleadoConFamilia extends Empleado{
	
	private boolean estaCasado;
	private int cantidadHijos;
	
	public EmpleadoConFamilia() {
		// TODO Auto-generated constructor stub
	}

	public boolean isEstaCasado() {
		return estaCasado;
	}

	public void setEstaCasado(boolean estaCasado) {
		this.estaCasado = estaCasado;
	}

	public int getCantidadHijos() {
		return cantidadHijos;
	}

	public void setCantidadHijos(int cantidadHijos) {
		this.cantidadHijos = cantidadHijos;
	}


	@Override
	protected double adicional() {
		if(this.estaCasado)
			return 5000 + (2000 * this.cantidadHijos);
		
		return 2000 * this.cantidadHijos;
	}
	
}
