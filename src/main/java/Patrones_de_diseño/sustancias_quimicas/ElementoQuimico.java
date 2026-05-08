package Patrones_de_diseño.sustancias_quimicas;

public abstract class ElementoQuimico {
	
	public ElementoQuimico() {
		// TODO Auto-generated constructor stub
	}
	
	public abstract String formula();
	
	public abstract int pesoMolecular();
	
	public abstract int carga();

	public abstract boolean esMetal();
	
	public abstract boolean esValida();
	
	public boolean esNoMetal() {
		return !this.esMetal();				
				
	}
	
}
