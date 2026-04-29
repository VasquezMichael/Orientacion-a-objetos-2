package refactoringEjercicio5Productos;

public class CarRental extends Product {
    private double cost;
    private Company company;

    public CarRental(double cost, TimePeriod timePeriod, Company company) {
        this.cost = cost;
        this.timePeriod = timePeriod;
        this.company = company;
    }

    public double price() {
        return this.company.totalPrice();
    }

   /* public double cost() {
        return this.cost;
    }aplico rename method y dejo solo el de abajo que es mas claro*/

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}
    
    
}
