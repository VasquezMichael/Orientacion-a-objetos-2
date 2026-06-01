package parcialesPatrones.excursionesParcial2022PrimeraFecha;

public class EstadoSinCupoMinimo implements EstadoExcursion{


	@Override
	public void inscribir(Excursion excursion, Usuario usuario) {
		excursion.agregarInscripto(usuario);
		if (excursion.alcanzoCupoMaximo()) {
			excursion.setEstado(new EstadoConCupoMaximo());
		} else if (excursion.alcancoCupoMinimo()) {
			excursion.setEstado(new EstadoConCupoMinimo());
		}
	}

	@Override
	public String obtenerInformacion(Excursion excursion) {
		return excursion.cantidadFaltanteParaCupoMinimo();
	}

}
