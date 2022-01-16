package decorator;

public class Decorator extends Confectionery{

	Confectionery confnery;
	String description = "Decorator";
	
	public Decorator(Confectionery confnery) {
		this.confnery = confnery;
	}
	public String getDescription() {
		return description;
	}
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 0;
	}

}
