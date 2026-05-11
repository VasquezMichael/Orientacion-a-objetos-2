package Patrones_de_diseño.productos_financieros;

public class PlazoFijo extends ProductoFinanciero{
	private int cantidadDias;
	private double interes;
	
	public PlazoFijo(int cantidadDias, double interes) {
		this.cantidadDias = cantidadDias;
		this.interes = interes;
	}

	@Override
	public double retornoInversion(double montoInicial) {
		return montoInicial + (montoInicial * this.interes * this.cantidadDias / 100);
	}
	
	

}
