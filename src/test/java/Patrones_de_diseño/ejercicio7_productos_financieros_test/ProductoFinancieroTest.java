package Patrones_de_diseño.ejercicio7_productos_financieros_test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

import Patrones_de_diseño.productos_financieros.CompraBonoAltoRiesgo;
import Patrones_de_diseño.productos_financieros.CompraBonoBajoRiesgo;
import Patrones_de_diseño.productos_financieros.CompraDolares;
import Patrones_de_diseño.productos_financieros.CompraPesos;
import Patrones_de_diseño.productos_financieros.FabricaProductoCuatro;
import Patrones_de_diseño.productos_financieros.FabricaProductoDos;
import Patrones_de_diseño.productos_financieros.FabricaProductoTres;
import Patrones_de_diseño.productos_financieros.FabricaProductoUno;
import Patrones_de_diseño.productos_financieros.PlazoFijo;
import Patrones_de_diseño.productos_financieros.ProductoCombinado;
import Patrones_de_diseño.productos_financieros.ProductoFinanciero;

public class ProductoFinancieroTest {

    @Test
    public void testPlazoFijoCalculaElRetorno() {
        ProductoFinanciero plazoFijo = new PlazoFijo(20, 2);

        assertEquals(1400, plazoFijo.retornoInversion(1000), 0.01);
    }

    @Test
    public void testCompraDolaresCalculaElRetorno() {
        ProductoFinanciero compraDolares = new CompraDolares(100);

        assertEquals(10, compraDolares.retornoInversion(1000), 0.01);
    }

    @Test
    public void testCompraPesosCalculaElRetorno() {
        ProductoFinanciero compraPesos = new CompraPesos(50);

        assertEquals(20, compraPesos.retornoInversion(1000), 0.01);
    }

    @Test
    public void testCompraBonoBajoRiesgoCalculaElRetorno() {
        ProductoFinanciero bono = new CompraBonoBajoRiesgo(72);

        assertEquals(1100, bono.retornoInversion(1000), 0.01);
    }

    @Test
    public void testCompraBonoAltoRiesgoCalculaElRetorno() {
        ProductoFinanciero bono = new CompraBonoAltoRiesgo(72);

        assertEquals(1700, bono.retornoInversion(1000), 0.01);
    }

    @Test
    public void testProductoCombinadoAplicaLosProductosEnOrden() {
        ProductoFinanciero producto = new ProductoCombinado(List.of(
            new CompraDolares(100),
            new PlazoFijo(20, 2),
            new CompraPesos(50)
        ));

        assertEquals(2.8, producto.retornoInversion(10000), 0.01);
    }

    @Test
    public void testFabricaProductoUno() {
        ProductoFinanciero producto = new FabricaProductoUno().crearProducto();

        assertEquals(2.8, producto.retornoInversion(10000), 0.01);
    }

    @Test
    public void testFabricaProductoDos() {
        ProductoFinanciero producto = new FabricaProductoDos().crearProducto();

        assertEquals(1.21, producto.retornoInversion(10000), 0.01);
    }

    @Test
    public void testFabricaProductoTres() {
        ProductoFinanciero producto = new FabricaProductoTres().crearProducto();

        assertEquals(41140, producto.retornoInversion(10000), 0.01);
    }

    @Test
    public void testFabricaProductoCuatro() {
        ProductoFinanciero producto = new FabricaProductoCuatro().crearProducto();

        assertEquals(49130, producto.retornoInversion(10000), 0.01);
    }
}
