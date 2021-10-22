package factorymethod.firstapproach;

public class Execution {

	public static void main(String[] args) {
		CarFactory factory = new ConcreteCar();
		ICar renault = factory.createCar("Renault");
		renault.funcionalityOne();
		renault.funcionalityTwo();
	}

}
