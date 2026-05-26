package Patrones_de_diseño.ejercicio8_toDoItem_test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Patrones_de_diseño.ToDoItem.ItemFinished;
import Patrones_de_diseño.ToDoItem.ItemInProgress;
import Patrones_de_diseño.ToDoItem.ItemPaused;
import Patrones_de_diseño.ToDoItem.ItemPending;
import Patrones_de_diseño.ToDoItem.ToDoItem;

public class ToDoItemTest {

	private ToDoItem item;

	@BeforeEach
	public void setUp() {
		this.item = new ToDoItem("Resolver ejercicio");
	}

	@Test
	public void testEstadoInicialEsPending() {
		assertTrue(this.item.getEstado() instanceof ItemPending);
	}

	@Test
	public void testStartCambiaAInProgressYRegistraFechaInicio() {
		this.item.start();

		assertTrue(this.item.getEstado() instanceof ItemInProgress);
		assertNotNull(this.item.getFechaInicio());
	}

	@Test
	public void testTogglePauseDesdeInProgressCambiaAPaused() {
		this.item.start();

		this.item.togglePause();

		assertTrue(this.item.getEstado() instanceof ItemPaused);
	}

	@Test
	public void testTogglePauseDesdePausedCambiaAInProgress() {
		this.item.start();
		this.item.togglePause();

		this.item.togglePause();

		assertTrue(this.item.getEstado() instanceof ItemInProgress);
	}

	@Test
	public void testFinishDesdeInProgressCambiaAFinishedYRegistraFechaFin() {
		this.item.start();

		this.item.finish();

		assertTrue(this.item.getEstado() instanceof ItemFinished);
		assertNotNull(this.item.getFechaFin());
	}

	@Test
	public void testFinishDesdePausedCambiaAFinishedYRegistraFechaFin() {
		this.item.start();
		this.item.togglePause();

		this.item.finish();

		assertTrue(this.item.getEstado() instanceof ItemFinished);
		assertNotNull(this.item.getFechaFin());
	}

	@Test
	public void testFinishDesdePendingNoHaceNada() {
		this.item.finish();

		assertTrue(this.item.getEstado() instanceof ItemPending);
	}

	@Test
	public void testTogglePauseDesdePendingLanzaExcepcion() {
		assertThrows(IllegalStateException.class, () -> this.item.togglePause());
	}

	@Test
	public void testWorkedTimeDesdePendingLanzaExcepcion() {
		assertThrows(IllegalStateException.class, () -> this.item.workedTime());
	}

	@Test
	public void testTogglePauseDesdeFinishedLanzaExcepcion() {
		this.item.start();
		this.item.finish();

		assertThrows(IllegalStateException.class, () -> this.item.togglePause());
	}

	@Test
	public void testWorkedTimeDesdeFinishedCalculaEntreInicioYFin() {
		LocalDateTime inicio = LocalDateTime.of(2026, 5, 26, 9, 0);
		LocalDateTime fin = LocalDateTime.of(2026, 5, 26, 11, 30);
		this.item.setFechaInicio(inicio);
		this.item.setFechaFin(fin);
		this.item.setEstadoItem(new ItemFinished());

		assertEquals(Duration.ofMinutes(150), this.item.workedTime());
	}

	@Test
	public void testWorkedTimeDesdeInProgressDevuelveDuracionPositiva() {
		this.item.setFechaInicio(LocalDateTime.now().minusMinutes(10));
		this.item.setEstadoItem(new ItemInProgress());

		assertTrue(this.item.workedTime().compareTo(Duration.ZERO) > 0);
	}

	@Test
	public void testAddCommentAgregaComentariosMientrasNoEsteFinished() {
		this.item.addComment("primer comentario");
		this.item.start();
		this.item.addComment("segundo comentario");
		this.item.togglePause();
		this.item.addComment("tercer comentario");

		assertEquals(List.of("primer comentario", "segundo comentario", "tercer comentario"), this.item.getComments());
	}

	@Test
	public void testAddCommentDesdeFinishedNoHaceNada() {
		this.item.addComment("comentario antes de finalizar");
		this.item.start();
		this.item.finish();

		this.item.addComment("comentario ignorado");

		assertEquals(List.of("comentario antes de finalizar"), this.item.getComments());
	}
}
