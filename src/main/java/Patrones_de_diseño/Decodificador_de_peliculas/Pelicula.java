package Patrones_de_diseño.Decodificador_de_peliculas;

import java.util.ArrayList;
import java.util.List;

public class Pelicula {

	private String titulo;
	private int anioEstreno;
	private double puntaje;
	private List<Pelicula> peliculasSimilares;
	
	public Pelicula() {
		// TODO Auto-generated constructor stub
	}

	public Pelicula(String titulo, int anioEstreno, double puntaje) {
	    this.titulo = titulo;
	    this.anioEstreno = anioEstreno;
	    this.puntaje = puntaje;
	    this.peliculasSimilares = new ArrayList<>();
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAnioEstreno() {
		return anioEstreno;
	}

	public void setAnioEstreno(int anioEstreno) {
		this.anioEstreno = anioEstreno;
	}

	public double getPuntaje() {
		return puntaje;
	}

	public void setPuntaje(double puntaje) {
		this.puntaje = puntaje;
	}

	public List<Pelicula> getPeliculasSimilares() {
		return peliculasSimilares;
	}

	public void setPeliculasSimilares(List<Pelicula> peliculasSimilares) {
		this.peliculasSimilares = peliculasSimilares;
	}
	public void agregarPeliculaSimilar(Pelicula pelicula) {
	    this.peliculasSimilares.add(pelicula);
	    pelicula.getPeliculasSimilares().add(this);
	}
	
	
}
