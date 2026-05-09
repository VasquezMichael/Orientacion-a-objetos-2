package Patrones_de_diseño.subteway;

public class SandwichSinTacc implements SandwichBuilder{

	private Sandwich sandwich = new Sandwich();
	
	
	public SandwichSinTacc() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void construirPan() {
		this.sandwich.setPan(new Componente("pan de chipa",150));
		
	}

	@Override
	public void construirAderezo() {
		this.sandwich.setAderezo(new Componente("salsa tartara",18));
		
	}

	@Override
	public void construirPrincipal() {
		this.sandwich.setPrincipal(new Componente("carne de pollo",250));
		
	}

	@Override
	public void construirAdicional() {
		this.sandwich.setAdicional(new Componente("verduras grilladas",200));
		
	}

	@Override
	public double getSandwichCosto() {
		return this.sandwich.getCostoSandwich();
	}

}
