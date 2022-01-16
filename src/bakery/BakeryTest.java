package bakery;
import decorator.*;
import observer.*;
public class BakeryTest {

	public static void main(String[] args) {
		Confectionery cake = new Cake();
		
		System.out.println(cake.getDescription() + cake.cost());
		
		BakeryModel bakeryModel = new BakeryModel();
		
		//Observe chocolate, frosting , candles when the cake is updated
		
		ChocolateDecorator chocolateDecorator = new ChocolateDecorator(cake);
		
		ChocolateObserver chocolateObserver = new ChocolateObserver(bakeryModel);
		
		System.out.println("Price changed");
		bakeryModel.setPrice(chocolateDecorator.cost());
		bakeryModel.unregister(chocolateObserver);
		
		FrostingDecorator frostingDecorator = new FrostingDecorator(chocolateDecorator);
		
		FrostingObserver frostingObserver = new FrostingObserver(bakeryModel);
		
		System.out.println("Price Changed");
		bakeryModel.setPrice(frostingDecorator.cost());
		bakeryModel.unregister(frostingObserver);
		CandleDecorator candleDecorator = new CandleDecorator(frostingDecorator);
		
		CandleObserver candleObserver = new CandleObserver(bakeryModel);
		
		System.out.println("Price changed");
		
		bakeryModel.setPrice(candleDecorator.cost());
		System.out.println("\n");
		System.out.println(candleDecorator.getDescription() +"\t"+ candleDecorator.cost());
		
		

	}

}
