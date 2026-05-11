package Patrones_de_diseño.productos_financieros;

import java.util.List;

public class ProductoCombinado extends ProductoFinanciero{

	private List<ProductoFinanciero> productos;
	
	public ProductoCombinado() {
		// TODO Auto-generated constructor stub
	}
	
	public ProductoCombinado(List<ProductoFinanciero> productos) {
		this.productos = productos;
	}
	
	

	@Override
	public double retornoInversion(double montoInicial) {
	    double montoActual = montoInicial;

	    for (ProductoFinanciero producto : this.productos) {
	        montoActual = producto.retornoInversion(montoActual);
	    }

	    return montoActual;
	}

}
