package Patrones_de_diseño.productos_financieros;

import java.util.List;

public class FabricaProductoTres implements CreadorProductoFinanciero{

	public FabricaProductoTres() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public ProductoFinanciero crearProducto() {
		return new ProductoCombinado(List.of(new CompraBonoAltoRiesgo(72), new CompraBonoBajoRiesgo(24), new PlazoFijo(120, 1)));
	}

}
