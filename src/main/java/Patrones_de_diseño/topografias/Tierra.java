package Patrones_de_diseño.topografias;

public class Tierra extends Topografia{

	public Tierra() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public double proporcionAgua() {
		return 0;
	}
    @Override
    public boolean equals(Object obj) {
        return obj instanceof Tierra;
    }

    @Override
    public int hashCode() {
        return Tierra.class.hashCode();
    }

}
