package observer;

public class CandleObserver implements Observer{
	private BakeryModel bakeryModel;
	private double price;
	
	public CandleObserver(BakeryModel bakeryModel) {
		this.bakeryModel = bakeryModel;
		this.bakeryModel.register(this);
	}

	
	public void update(double price) {
		this.price = price;
		display();

	}
	public void display() {
		System.out.println("Candle Observer cake updated " + bakeryModel.getPrice());
	}


}
