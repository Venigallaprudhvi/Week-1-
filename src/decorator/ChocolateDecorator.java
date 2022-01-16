package decorator;

public class ChocolateDecorator extends Decorator{

	
	
	public ChocolateDecorator(Confectionery confnery) {
		super(confnery);
	}
	public String getDescription() {
		return this.confnery.getDescription() + ", Chocolate";
	}
	public double cost() {
		return this.confnery.cost() + 10;
	}

}
