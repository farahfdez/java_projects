package factorymethod.firstapproach;

public class ConcreteCar extends CarFactory {

	@Override
	public ICar createCar(String brand) {
		switch (brand) {
		
		case "Renault" : 
			return new Renault();
		
		case "Peugeot" : 
			return new Peugeot();
			
		default: 
			return null;		
		}
	}
}
