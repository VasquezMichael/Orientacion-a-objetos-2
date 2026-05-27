package Patrones_de_diseño.Decodificador_de_peliculas;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SugerirNovedad implements EstrategiaSugerencia{


	@Override
	public List<Pelicula> sugerirPeliculas(List<Pelicula> grilla, List<Pelicula> reproducidas) {
		List<Pelicula> candidatas = new ArrayList<>(grilla);
		candidatas.removeAll(reproducidas);
		candidatas.sort(Comparator.comparing(Pelicula::getAnioEstreno).reversed());
		return candidatas.subList(0, Math.min(3, candidatas.size()));
	}

}
