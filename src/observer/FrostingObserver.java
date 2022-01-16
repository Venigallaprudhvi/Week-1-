package observer;

public class FrostingObserver implements Observer{
	private BakeryModel bakeryModel;
	private double price;
	
	public FrostingObserver(BakeryModel bakeryModel) {
		this.bakeryModel = bakeryModel;
		this.bakeryModel.register(this);
	}

	
	public void update(double price) {
		this.price = price;
		display();

	}
	public void display() {
		System.out.println("Frosting Observer cake updated " + bakeryModel.getPrice());
	}


}
