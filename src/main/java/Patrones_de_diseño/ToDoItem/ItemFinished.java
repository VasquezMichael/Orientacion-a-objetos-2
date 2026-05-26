package Patrones_de_diseño.ToDoItem;

import java.time.Duration;

public class ItemFinished implements EstadoItem{


	@Override
	public void start(ToDoItem item) {
		  // No hace nada
		
	}

	@Override
	public void togglePause(ToDoItem item) {
		throw new IllegalStateException ("La tarea no esta en estado in-progress o paused");
		
	}

	@Override
	public void finish(ToDoItem item) {
		// No hace nada
		
	}

	@Override
	public Duration workedTime(ToDoItem item) {
		return Duration.between(item.getFechaInicio(), item.getFechaFin());
		
	}

	@Override
	public void addComment(ToDoItem item, String comment) {
		// No hace nada
		
	}

}
