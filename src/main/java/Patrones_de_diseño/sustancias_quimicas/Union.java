package Patrones_de_diseño.sustancias_quimicas;

import java.util.List;

public class Union extends ElementoQuimico{
	
	private List<ElementoQuimico> componentes;
	
	public Union() {
		// TODO Auto-generated constructor stub
	}

	
	public Union(List<ElementoQuimico> componentes) throws IllegalAccessException {
		super();
		if(componentes == null || componentes.size() < 2)
			throw new IllegalArgumentException("Una union necesita al menos dos componentes");
		this.componentes = componentes;

	}


	public List<ElementoQuimico> getComponentes() {
		return componentes;
	}



	public void setComponentes(List<ElementoQuimico> componentes) {
		this.componentes = componentes;
	}


	
	@Override
	public boolean esValida() {
		long cantidadMetales = this.componentes.stream().filter(ElementoQuimico::esMetal).count();
		
		return cantidadMetales <= 1;
	}


	@Override
	public String formula() {
		String formula = "";
		for (ElementoQuimico elementoQuimico : componentes) {
			formula = formula + elementoQuimico.formula();
		}
		return formula;
	}

	@Override
	public int pesoMolecular() {
		return this.componentes.stream().mapToInt(ElementoQuimico::pesoMolecular).sum();
	}

	@Override
	public int carga() {
		return this.componentes.stream().mapToInt(ElementoQuimico::carga).sum();
	}

	@Override
	public boolean esMetal() {
		return false;
	}

}
