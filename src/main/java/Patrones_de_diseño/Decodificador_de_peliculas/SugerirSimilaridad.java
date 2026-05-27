package Patrones_de_diseño.Decodificador_de_peliculas;

import java.util.Comparator;
import java.util.List;

public class SugerirSimilaridad implements EstrategiaSugerencia{



	@Override
	public List<Pelicula> sugerirPeliculas(List<Pelicula> grilla, List<Pelicula> reproducidas) {
		return reproducidas.stream()
			    .flatMap(pelicula -> pelicula.getPeliculasSimilares().stream())
			    .distinct()
			    .filter(pelicula -> !reproducidas.contains(pelicula))
			    .sorted(Comparator.comparing(Pelicula::getAnioEstreno).reversed())
			    .limit(3)
			    .toList();
	}

}
