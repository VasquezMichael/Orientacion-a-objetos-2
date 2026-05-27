package Patrones_de_diseño.Decodificador_de_peliculas;

import java.util.Comparator;
import java.util.List;

public class SugerirPuntaje implements EstrategiaSugerencia{


	@Override
	public List<Pelicula> sugerirPeliculas(List<Pelicula> grilla, List<Pelicula> reproducidas) {
	    return grilla.stream()
	            .filter(pelicula -> !reproducidas.contains(pelicula))
	            .sorted(
	                Comparator.comparing(Pelicula::getPuntaje).reversed()
	                    .thenComparing(
	                        Comparator.comparing(Pelicula::getAnioEstreno).reversed()
	                    )
	            )
	            .limit(3)
	            .toList();
	}

}
