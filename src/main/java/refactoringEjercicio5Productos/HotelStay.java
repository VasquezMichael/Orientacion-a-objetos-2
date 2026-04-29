package refactoringEjercicio5Productos;

public class HotelStay extends Product {
    private double quote;
    private Hotel hotel;

    public HotelStay(double cost, TimePeriod timePeriod, Hotel hotel) {
        this.quote = cost;
        this.timePeriod = timePeriod;
        this.hotel = hotel;
    }

    public double priceFactor() {
        return this.quote / this.price();
    }

    public double price() {
        return this.timePeriod.duration() * this.hotel.totalPrice();
    }

	public double getQuote() {
		return quote;
	}

	public void setQuote(double cost) {
		this.quote = cost;
	}
    
    
}
