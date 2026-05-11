package Patrones_de_diseño.productos_financieros;

import java.util.List;

public class FabricaProductoCuatro implements CreadorProductoFinanciero{

	public FabricaProductoCuatro() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public ProductoFinanciero crearProducto() {
		return new ProductoCombinado(List.of(new CompraBonoAltoRiesgo(72), new CompraBonoAltoRiesgo(72), new CompraBonoAltoRiesgo(72)));
	}

}
