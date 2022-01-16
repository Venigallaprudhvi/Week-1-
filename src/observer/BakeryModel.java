package observer;
import java.util.List;
import java.util.ArrayList;
public class BakeryModel implements Subject , Display{

	private List<Observer> observers;
	private double price;
	
	public BakeryModel() {
		observers = new ArrayList<Observer>();
	}
	
	public void register(Observer observer) {
        if(observer == null ) 
        	throw new NullPointerException("Null Observer");
        
        if(!observers.contains(observer)) 
            observers.add(observer);	
	}
	public void unregister(Observer observer) {
    	if(observers.contains(observer)) 
            observers.remove(observer);
	}
	public void notifyAllObservers() {
		for ( Observer observer : observers) {
			observer.update(price);
		}
	}
	public void layerAdded() {
		notifyAllObservers();
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
		layerAdded();
	}

	@Override
	public void display() {
		System.out.println("Bakery Model");
		
	}
	
}
