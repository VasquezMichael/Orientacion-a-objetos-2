package Patrones_de_diseño.topografias;

import java.util.LinkedList;
import java.util.List;

public class Mixta extends Topografia{
	private List<Topografia> celdas;
	
	
	public Mixta(Topografia c1, Topografia c2, Topografia c3, Topografia c4) {
		this.celdas = new LinkedList<>();
		celdas.add(c1);
		celdas.add(c2);
		celdas.add(c3);
		celdas.add(c4);
	}

	@Override
	public double proporcionAgua() {
		double sum = 0;
		for (Topografia celda : this.celdas) {
			sum += celda.proporcionAgua();
		}
		/*
		  return this.celdas.stream().mapToDouble(Topografia::proporcionAgua).sum() / this.celdas.size();
        */
		
		return sum/4;
	}
	
	@Override
	public boolean equals(Object obj) {
	    if (!(obj instanceof Mixta)) {
	        return false;
	    }

	    Mixta otra = (Mixta) obj;
	    return this.celdas.equals(otra.celdas);
	}
	@Override
	public int hashCode() {
	    return this.celdas.hashCode();
	}
}
