package decorator;

public class Cake extends Confectionery{

	String description = "Cake " ;
	public String getDescription() {
		return description;
	}
	@Override
	public double cost() {
		
		return 15;
	}

}
