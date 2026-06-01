package parcialesPatrones.excursionesParcial2022PrimeraFecha;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
		this.inscriptos = new ArrayList<>();
		this.listaEspera = new ArrayList<>();
		this.estado = new EstadoSinCupoMinimo();
	}

	public Excursion(String nombre, LocalDate fechaInicio, LocalDate fechaFin, String puntoEncuentro, double costo,
			int cupoMinimo, int cupoMaximo) {
		this();
		this.nombre = nombre;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.puntoEncuentro = puntoEncuentro;
		this.costo = costo;
		this.cupoMinimo = cupoMinimo;
		this.cupoMaximo = cupoMaximo;
		this.estado = new EstadoSinCupoMinimo();
	}


	public void inscribir(Usuario usuario) {
		this.estado.inscribir(this, usuario);
	}
	
	
	private String obtenerInformacionBasica() {
		return "Nombre: " + nombre + ", costo: " + costo + ", fecha de inicio: " + fechaInicio + ", fecha de fin: "
				+ fechaFin + ", punto de encuentro: " + puntoEncuentro;
	}
	

	public String obtenerInformacion() {
		return this.obtenerInformacionBasica() + this.estado.obtenerInformacion(this);
	}
	
	public String cantidadFaltanteParaCupoMinimo() {
		return ", usuarios faltantes para alcanzar el cupo minimo: " + (cupoMinimo - this.inscriptos.size());
	}
	
	public String cantidadFaltanteParaCupoMaximo() {
		return ", usuarios faltantes para alcanzar el cupo maximo: " + (cupoMaximo - this.inscriptos.size());
	}

	public String mailsInscriptos() {
		return ", mails de usuarios inscriptos: " + this.inscriptos.stream().map(Usuario::getEmail)
				.collect(Collectors.joining(", "));
	}
	
	public void agregarInscripto(Usuario usuario) {
		this.inscriptos.add(usuario);
	}
	
	public void agregarAListaEspera(Usuario usuario) {
		this.listaEspera.add(usuario);
	}
	
	public boolean alcancoCupoMinimo() {
		return this.inscriptos.size() >= this.cupoMinimo;
	}
	
	public boolean alcanzoCupoMaximo() {
		return this.inscriptos.size() >= this.cupoMaximo;
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
