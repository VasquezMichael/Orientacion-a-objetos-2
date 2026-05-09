package Patrones_de_diseño.subteway;

public class SandwichClasico implements SandwichBuilder{

	private Sandwich sandwich = new Sandwich();
	
	@Override
	public void construirPan() {
		this.sandwich.setPan(new Componente("pan brioche",100));
		
	}

	@Override
	public void construirAderezo() {
		this.sandwich.setAderezo(new Componente("aderezo a base de mayonesa",20));
		
	}

	@Override
	public void construirPrincipal() {
		this.sandwich.setPrincipal(new Componente("Carne de  ternera",300));
		
	}
	
	@Override
	public void construirAdicional() {
		this.sandwich.setAdicional(new Componente("adicional de tomate",80));
	}

	@Override
	public double getSandwichCosto() {
		return this.sandwich.getCostoSandwich();
		
	}



}
