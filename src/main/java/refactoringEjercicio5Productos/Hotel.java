package refactoringEjercicio5Productos;

public class Hotel {
    private double nightPrice;
    private double discountRate;

    public Hotel(double nightPrice, double discountRate) {
        this.nightPrice = nightPrice;
        this.discountRate = discountRate;
    }

    public double nightPrice() {
        return this.nightPrice;
    }

    public double discountRate() {
        return this.discountRate;
    }
    
    public double totalPrice() {
    	return this.nightPrice() * this.discountRate();
    }
}
