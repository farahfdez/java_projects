package factorymethod.secondapproach;

import java.util.logging.Logger;

public class Peugeot implements ICar {
	
	Logger logger = Logger.getLogger(Peugeot.class.getName());

	@Override
	public void funcionalityOne() {
		// here goes funcionality one method implementation
		logger.info("Excuting funcionality one");

	}

	@Override
	public void funcionalityTwo() {
		// here goes funcionality two method implementation
		logger.info("Excuting funcionality two");

	}

}
