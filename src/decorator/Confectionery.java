package decorator;

public abstract class Confectionery {
	
	String description = "Confectionery";
	
	public String getDescription() {
		return description;
	}
	
	public abstract double cost();

}
