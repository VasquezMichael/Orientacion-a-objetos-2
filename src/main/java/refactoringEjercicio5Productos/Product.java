package refactoringEjercicio5Productos;

import java.time.LocalDate;

public class Product {

	protected TimePeriod timePeriod;

	public LocalDate startDate() {
	    return this.timePeriod.start();
	}

	public LocalDate endDate() {
	    return this.timePeriod.end();
	}
	
}
