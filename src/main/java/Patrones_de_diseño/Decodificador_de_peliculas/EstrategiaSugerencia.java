package Patrones_de_diseño.Decodificador_de_peliculas;

import java.util.List;

public interface EstrategiaSugerencia {

	List<Pelicula> sugerirPeliculas(List<Pelicula> grilla, List<Pelicula> reproducidas);

}
