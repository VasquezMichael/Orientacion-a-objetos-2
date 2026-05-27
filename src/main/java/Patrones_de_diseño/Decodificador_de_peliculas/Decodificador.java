package Patrones_de_diseño.Decodificador_de_peliculas;

import java.util.ArrayList;
import java.util.List;

public class Decodificador {

	private List<Pelicula> grilla;
	private List<Pelicula> reproducidas;
	private EstrategiaSugerencia criterio;
	
	public Decodificador() {
		// TODO Auto-generated constructor stub
	}
	public Decodificador(List<Pelicula> grilla, EstrategiaSugerencia criterio) {
	    this.grilla = grilla;
	    this.reproducidas = new ArrayList<>();
	    this.criterio = criterio;
	}

	public List<Pelicula> getGrilla() {
		return grilla;
	}

	public void setGrilla(List<Pelicula> grilla) {
		this.grilla = grilla;
	}

	public List<Pelicula> getReproducidas() {
		return reproducidas;
	}

	public void setReproducidas(List<Pelicula> reproducidas) {
		this.reproducidas = reproducidas;
	}

	public EstrategiaSugerencia getCriterio() {
		return criterio;
	}

	public void setCriterio(EstrategiaSugerencia criterio) {
		this.criterio = criterio;
	}
	
	public List<Pelicula> sugerirPeliculas(){
		return criterio.sugerirPeliculas(grilla, reproducidas);
	}
	
	public void reproducir(Pelicula pelicula) {
		this.reproducidas.add(pelicula);
	}

}
