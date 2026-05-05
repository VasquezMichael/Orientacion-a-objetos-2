package Patrones_de_diseño.topografias;

public class Agua extends Topografia{

	public Agua() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public double proporcionAgua() {
		return 1;
	}
	
    @Override
    public boolean equals(Object obj) {
        return obj instanceof Agua;
    }

    @Override
    public int hashCode() {
        return Agua.class.hashCode();
    }

}
