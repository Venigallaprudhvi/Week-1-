package decorator;

public class CandleDecorator extends Decorator{
	

	
	public CandleDecorator(Confectionery confnery) {
		super(confnery);
	}
	public String getDescription() {
		return confnery.getDescription() + ", Candles";
	}
	public double cost() {
		return confnery.cost() + 5;
	}
}
