package parcialesPatrones.excursionesParcial2022PrimeraFecha;

public class EstadoConCupoMinimo implements EstadoExcursion{

	@Override
	public void inscribir(Excursion excursion, Usuario usuario) {
		excursion.agregarInscripto(usuario);
		if (excursion.alcanzoCupoMaximo()) {
			excursion.setEstado(new EstadoConCupoMaximo());
		}
	}

	@Override
	public String obtenerInformacion(Excursion excursion) {
		return excursion.mailsInscriptos() + excursion.cantidadFaltanteParaCupoMaximo();
	}



}
