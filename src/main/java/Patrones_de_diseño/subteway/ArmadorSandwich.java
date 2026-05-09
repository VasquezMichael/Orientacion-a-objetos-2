package Patrones_de_diseño.subteway;

public class ArmadorSandwich {

	public ArmadorSandwich() {
		// TODO Auto-generated constructor stub
	}
	
	public double construir (SandwichBuilder builder) {
		builder.construirAderezo();
		builder.construirAdicional();
		builder.construirPan();
		builder.construirPrincipal();
		return builder.getSandwichCosto();
	}

}
