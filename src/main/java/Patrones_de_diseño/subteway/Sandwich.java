package Patrones_de_diseño.subteway;

public class Sandwich {

	private Componente pan;
	private Componente aderezo;
	private Componente principal;
	private Componente adicional;
	
	public Sandwich() {
		// TODO Auto-generated constructor stub
	}

	public Sandwich(Componente pan, Componente aderezo, Componente principal, Componente adicional) {
		super();
		this.pan = pan;
		this.aderezo = aderezo;
		this.principal = principal;
		this.adicional = adicional;
	}

	public Componente getPan() {
		return pan;
	}

	public void setPan(Componente pan) {
		this.pan = pan;
	}

	public Componente getAderezo() {
		return aderezo;
	}

	public void setAderezo(Componente aderezo) {
		this.aderezo = aderezo;
	}

	public Componente getPrincipal() {
		return principal;
	}

	public void setPrincipal(Componente principal) {
		this.principal = principal;
	}

	public Componente getAdicional() {
		return adicional;
	}

	public void setAdicional(Componente adicional) {
		this.adicional = adicional;
	}
	
	public double getCostoSandwich() {
		return this.aderezo.getCosto()
				+ this.adicional.getCosto()
				+ this.pan.getCosto()
				+ this.principal.getCosto();
	}

}
