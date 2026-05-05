package Patrones_de_diseño.topografias;

public abstract class Topografia {

	public Topografia() {
		// TODO Auto-generated constructor stub
	}
	
	public abstract double proporcionAgua();
	
	public double proporcionTierra() {
		return 1 - this.proporcionAgua();
	}
	

}
