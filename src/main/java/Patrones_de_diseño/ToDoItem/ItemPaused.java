package Patrones_de_diseño.ToDoItem;

import java.time.Duration;
import java.time.LocalDateTime;

public class ItemPaused implements EstadoItem{


	@Override
	public void start(ToDoItem item) {
		// No hace nada
		
	}

	@Override
	public void togglePause(ToDoItem item) {
		item.setEstadoItem(new ItemInProgress());
		
	}

	@Override
	public void finish(ToDoItem item) {
		item.setEstadoItem(new ItemFinished());
		item.setFechaFin(LocalDateTime.now());
		
	}

	@Override
	public Duration workedTime(ToDoItem item) {
		return Duration.between(item.getFechaInicio(), LocalDateTime.now());
		
	}

	@Override
	public void addComment(ToDoItem item, String comment) {
		item.agregarComentario(comment);
		
	}

}
