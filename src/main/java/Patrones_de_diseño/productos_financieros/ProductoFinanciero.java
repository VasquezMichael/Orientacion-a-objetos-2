package Patrones_de_diseño.productos_financieros;

import java.util.Date;

public abstract class ProductoFinanciero {

	private Date fechaOperacion;
	
	public ProductoFinanciero() {
		this.fechaOperacion = new Date();
	}
	
	
	
	public abstract double retornoInversion(double montoInicial);

}
