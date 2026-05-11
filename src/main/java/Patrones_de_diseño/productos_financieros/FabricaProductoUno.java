package Patrones_de_diseño.productos_financieros;

import java.util.List;

public class FabricaProductoUno implements CreadorProductoFinanciero{

	public FabricaProductoUno() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public ProductoFinanciero crearProducto() {
		
		return new ProductoCombinado(List.of(new CompraDolares(100), new PlazoFijo(20, 2), new CompraPesos(50)));
	}

}
