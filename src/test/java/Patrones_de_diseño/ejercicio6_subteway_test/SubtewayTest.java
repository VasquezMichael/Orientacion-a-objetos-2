package Patrones_de_diseño.ejercicio6_subteway_test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Patrones_de_diseño.subteway.ArmadorSandwich;
import Patrones_de_diseño.subteway.SandwichBuilder;
import Patrones_de_diseño.subteway.SandwichClasico;
import Patrones_de_diseño.subteway.SandwichSinTacc;
import Patrones_de_diseño.subteway.SandwichVegano;
import Patrones_de_diseño.subteway.SandwichVegetariano;

public class SubtewayTest {

	 private ArmadorSandwich armador;

	    @BeforeEach
	    public void setUp() {
	        this.armador = new ArmadorSandwich();
	    }

	    @Test
	    public void testConstruirSandwichClasicoCalculaBienElCosto() {
	        SandwichBuilder builder = new SandwichClasico();

	        double costo = this.armador.construir(builder);

	        // pan brioche: 100
	        // aderezo mayonesa: 20
	        // carne de ternera: 300
	        // tomate: 80
	        // total: 500
	        assertEquals(500, costo);
	    }

	    @Test
	    public void testConstruirSandwichVegetarianoCalculaBienElCosto() {
	        SandwichBuilder builder = new SandwichVegetariano();

	        double costo = this.armador.construir(builder);

	        // pan con semillas: 120
	        // sin aderezo: 0
	        // provoleta grillada: 200
	        // berenjenas: 100
	        // total: 420
	        assertEquals(420, costo);
	    }

	    @Test
	    public void testConstruirSandwichVeganoCalculaBienElCosto() {
	        SandwichBuilder builder = new SandwichVegano();

	        double costo = this.armador.construir(builder);

	        // pan integral: 100
	        // salsa criolla: 20
	        // milanesa de girgolas: 500
	        // sin adicional: 0
	        // total: 620
	        assertEquals(620, costo);
	    }

	    @Test
	    public void testConstruirSandwichSinTaccCalculaBienElCosto() {
	        SandwichBuilder builder = new SandwichSinTacc();

	        double costo = this.armador.construir(builder);

	        // pan de chipa: 150
	        // salsa tartara: 18
	        // pollo: 250
	        // verduras grilladas: 200
	        // total: 618
	        assertEquals(618, costo);
	    }

}
