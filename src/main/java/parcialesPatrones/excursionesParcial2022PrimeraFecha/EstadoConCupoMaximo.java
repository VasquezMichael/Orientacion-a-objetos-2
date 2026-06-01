package parcialesPatrones.excursionesParcial2022PrimeraFecha;

public class EstadoConCupoMaximo implements EstadoExcursion{

	@Override
	public void inscribir(Excursion excursion, Usuario usuario) {
		excursion.agregarAListaEspera(usuario);
	}

	@Override
	public String obtenerInformacion(Excursion excursion) {
		return "";
	}


}
