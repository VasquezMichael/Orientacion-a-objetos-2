package Patrones_de_diseño.subteway;

public interface SandwichBuilder {

	public void construirPan();
	
	public void construirAderezo();
	
	public void construirPrincipal();
	
	public void construirAdicional();
	
	public double getSandwichCosto();
}
