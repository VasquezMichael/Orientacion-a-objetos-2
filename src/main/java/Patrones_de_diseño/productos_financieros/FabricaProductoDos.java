package Patrones_de_diseño.productos_financieros;

import java.util.List;

public class FabricaProductoDos implements CreadorProductoFinanciero{

	public FabricaProductoDos() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public ProductoFinanciero crearProducto() {
		return new ProductoCombinado(List.of(new CompraBonoBajoRiesgo(72),new CompraDolares(200),new PlazoFijo(120, 1), new CompraPesos(100)));
	}

}
