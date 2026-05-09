package Patrones_de_diseño.subteway;

public class SandwichVegetariano implements SandwichBuilder{
	private Sandwich sandwich = new Sandwich();
	
	
	public SandwichVegetariano() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void construirPan() {
		this.sandwich.setPan(new Componente("pan con semillas",120));
		
	}

	@Override
	public void construirPrincipal() {
		this.sandwich.setPrincipal(new Componente("provoleta grillada",200));
		
	}

	@Override
	public void construirAderezo() {
		this.sandwich.setAderezo(new Componente("sin aderezo",0));
		
	}

	@Override
	public void construirAdicional() {
		this.sandwich.setAdicional(new Componente("berenjenas al escabeche",100));
		
	}

	@Override
	public double getSandwichCosto() {
		return this.sandwich.getCostoSandwich();
	}

}
