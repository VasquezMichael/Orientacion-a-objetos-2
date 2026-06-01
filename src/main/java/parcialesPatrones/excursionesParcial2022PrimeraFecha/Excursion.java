package parcialesPatrones.excursionesParcial2022PrimeraFecha;

import java.time.LocalDate;
import java.util.List;

public class Excursion {
	private EstadoExcursion estado;
	private String nombre;
	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	private String puntoEncuentro;
	private double costo;
	private int cupoMinimo;
	private int cupoMaximo;
	private List<Usuario> inscriptos;
	private List<Usuario> listaEspera;
	
	public Excursion() {
		// TODO Auto-generated constructor stub
	}


	public void inscribir(Usuario usuario) {
		this.estado.inscribir(this, usuario);
	}
	
	
	private String obtenerInformacionBasica() {
		return "Excursion [nombre=" + nombre + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin
				+ ", puntoEncuentro=" + puntoEncuentro + ", costo=" + costo + "]";
	}
	

	public String obtenerInformacion() {
		return null;
	}
	

	public EstadoExcursion getEstado() {
		return estado;
	}
	
	public void setEstado(EstadoExcursion estado) {
		this.estado = estado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public LocalDate getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(LocalDate fechaFin) {
		this.fechaFin = fechaFin;
	}

	public String getPuntoEncuentro() {
		return puntoEncuentro;
	}

	public void setPuntoEncuentro(String puntoEncuentro) {
		this.puntoEncuentro = puntoEncuentro;
	}

	public double getCosto() {
		return costo;
	}

	public void setCosto(double costo) {
		this.costo = costo;
	}

	public int getCupoMinimo() {
		return cupoMinimo;
	}

	public void setCupoMinimo(int cupoMinimo) {
		this.cupoMinimo = cupoMinimo;
	}

	public int getCupoMaximo() {
		return cupoMaximo;
	}

	public void setCupoMaximo(int cupoMaximo) {
		this.cupoMaximo = cupoMaximo;
	}

	public List<Usuario> getInscriptos() {
		return inscriptos;
	}

	public void setInscriptos(List<Usuario> inscriptos) {
		this.inscriptos = inscriptos;
	}

	public List<Usuario> getListaEspera() {
		return listaEspera;
	}

	public void setListaEspera(List<Usuario> listaEspera) {
		this.listaEspera = listaEspera;
	}
	
	
	

}
