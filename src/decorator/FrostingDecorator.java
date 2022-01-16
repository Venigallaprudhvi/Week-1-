package decorator;

public class FrostingDecorator extends Decorator{


	
	
	public FrostingDecorator(Confectionery confnery) {
		super(confnery);
	}
	public String getDescription() {
		return confnery.getDescription() + ", Frosting";
	}
	public double cost() {
		return confnery.cost() + 8;
	}
}
