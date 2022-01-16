package observer;

public class ChocolateObserver implements Observer {
	private BakeryModel bakeryModel;
	private double price;
	
	public ChocolateObserver(BakeryModel bakeryModel) {
		this.bakeryModel = bakeryModel;
		this.bakeryModel.register(this);
	}

	
	public void update(double price) {
		this.price = price;
		display();

	}
	public void display() {
		System.out.println("Chocolate Observer cake updated " + bakeryModel.getPrice());
	}



}
