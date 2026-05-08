package Patrones_de_diseño.sustancias_quimicas;

public class Atomo extends ElementoQuimico{
	
	private String nombre;
	private String simbolo;
	private int pesoAtomico;
	private int carga;
	private boolean esMetal;
	
	
	
	public String getSimbolo() {
		return simbolo;
	}

	public void setSimbolo(String simbolo) {
		this.simbolo = simbolo;
	}

	public int getPesoAtomico() {
		return pesoAtomico;
	}

	public void setPesoAtomico(int pesoAtomico) {
		this.pesoAtomico = pesoAtomico;
	}

	public int getCarga() {
		return carga;
	}

	public void setCarga(int carga) {
		this.carga = carga;
	}

	public void setEsMetal(boolean esMetal) {
		this.esMetal = esMetal;
	}

	public boolean getEsMetal() {
		return this.esMetal;
	}
	
	public Atomo() {
		// TODO Auto-generated constructor stub
	}
	
	public Atomo(String nombre, String simbolo, int pesoAtomico, int carga, boolean esMetal) {
		super();
		this.nombre = nombre;
		this.simbolo = simbolo;
		this.pesoAtomico = pesoAtomico;
		this.carga = carga;
		this.esMetal = esMetal;
	}

	@Override
	public String formula() {
		return this.getSimbolo();
	}

	@Override
	public int pesoMolecular() {
		return this.getPesoAtomico();
	}

	@Override
	public int carga() {
		return this.getCarga();
	}

	@Override
	public boolean esMetal() {
		return this.getEsMetal();
	}

	@Override
	public boolean esValida() {
		return true;
	}

}
