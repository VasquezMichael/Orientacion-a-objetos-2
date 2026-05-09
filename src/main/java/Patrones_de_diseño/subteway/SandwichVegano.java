package Patrones_de_diseño.subteway;

public class SandwichVegano implements SandwichBuilder{

	private Sandwich sandwich = new Sandwich();
	
	public SandwichVegano() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void construirPan() {
		this.sandwich.setPan(new Componente("pan interal",100));
		
	}

	@Override
	public void construirPrincipal() {
		this.sandwich.setPrincipal(new Componente("milanesa de girgolas",500));
		
	}

	@Override
	public void construirAderezo() {
		this.sandwich.setAderezo(new Componente("salsa criolla",20));
		
	}

	@Override
	public void construirAdicional() {
		this.sandwich.setAdicional(new Componente("sin adicional",0));
		
	}

	@Override
	public double getSandwichCosto() {
		return this.sandwich.getCostoSandwich();
	}

}
