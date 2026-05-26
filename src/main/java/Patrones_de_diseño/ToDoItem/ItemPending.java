package Patrones_de_diseño.ToDoItem;
import java.time.Duration;
import java.time.LocalDateTime;
public class ItemPending implements EstadoItem{


	@Override
	public void start(ToDoItem item) {
		item.setFechaInicio(LocalDateTime.now());
		item.setEstadoItem(new ItemInProgress());
		
	}

	@Override
	public void togglePause(ToDoItem item) {
		throw new IllegalStateException("El item no se encuentra en estado paused o in-progress");
		
	}

	@Override
	public void finish(ToDoItem item) {
		// No hace nada
		
	}

	@Override
	public Duration workedTime(ToDoItem item) {
		throw new IllegalStateException ("La tarea no ha iniciado");
		
	}

	@Override
	public void addComment(ToDoItem item, String comment) {
		item.agregarComentario(comment);
	}

}
