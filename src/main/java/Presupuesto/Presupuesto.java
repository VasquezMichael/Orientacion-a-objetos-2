package Presupuesto;

import java.time.LocalDate;
import java.util.List;

public class Presupuesto {

	private LocalDate fecha;
	private String cliente;
	private List<Item> items;
	
	
	public Presupuesto() {
		// TODO Auto-generated constructor stub
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public LocalDate getFecha() {
		return this.fecha;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	
	public void agregarItem(Item item) {
		this.items.add(item);
	}
	
	public double calcularTotal() {
		double total = 0;
		for(Item item: this.items) {
			total += item.costo();
		}
		//this.items.stream().mapToDouble(item -> item.costo()).sum();
		return total;
	}
	
}
