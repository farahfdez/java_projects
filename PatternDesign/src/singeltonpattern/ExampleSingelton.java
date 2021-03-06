package singeltonpattern;

public class ExampleSingelton {
	
	private static ExampleSingelton uniqueInstance = null;
	
	private ExampleSingelton() {		
	}
	
	public static ExampleSingelton getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new ExampleSingelton();
		}
		return uniqueInstance;
	}

}
