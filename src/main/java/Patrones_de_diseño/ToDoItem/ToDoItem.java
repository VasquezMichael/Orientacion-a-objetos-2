package Patrones_de_diseño.ToDoItem;
import java.time.*;
import java.util.LinkedList;
import java.util.List;
public class ToDoItem {
	private String name;
	private EstadoItem estado;
	private LocalDateTime fechaInicio;
	private LocalDateTime fechaFin;
	private List<String> comments;
	public ToDoItem() {
		// TODO Auto-generated constructor stub
	}
	
	public void setEstadoItem(EstadoItem estado) {
		this.estado = estado;
	}
	

	public LocalDateTime getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(LocalDateTime fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public LocalDateTime getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(LocalDateTime fechaFin) {
		this.fechaFin = fechaFin;
	}

	public void agregarComentario(String comment) {
		this.comments.add(comment);
	}
	
	public ToDoItem(String name) {
		this.name = name;
		this.estado = new ItemPending();
		this.comments = new LinkedList<>();
	}
	
	public void start() {
		this.estado.start(this);
	}
	
	
	public void togglePause() {
		this.estado.togglePause(this);
	}
	
	public void finish() {
		this.estado.finish(this);
	}
	
	public Duration workedTime() {
		return this.estado.workedTime(this);
	}
	
	public void addComment(String comment) {
		this.estado.addComment(this, comment);
	}
	
}
