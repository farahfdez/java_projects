package factorymethod.secondapproach;

public class Excecution {

	public static void main(String[] args) throws Exception {
		CarFactory factory = new CarFactory();
		ICar renault = factory.getInstance(CarEnum.fromBrand("Renault"));
		renault.funcionalityOne();
		renault.funcionalityTwo();
	}

}
