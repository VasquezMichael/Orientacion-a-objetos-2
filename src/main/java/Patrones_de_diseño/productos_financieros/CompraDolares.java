package Patrones_de_diseño.productos_financieros;

public class CompraDolares extends ProductoFinanciero{

	private double valorCompra;
	
	public CompraDolares(double valorCompra) {
		this.valorCompra = valorCompra;
	}

	@Override
	public double retornoInversion(double montoInicial) {
	
		return montoInicial/this.valorCompra;
	}

}
