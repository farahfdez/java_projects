package factorymethod.secondapproach;

import java.lang.reflect.Constructor;

public class CarFactory {
	
	public ICar getInstance(CarEnum carEnum) throws Exception  {

		try {
			final Class<?> cls = Class.forName(carEnum.getClassName());
			final Constructor<?> ctor = cls.getConstructor();
			final Object clase = ctor.newInstance();
			return (ICar) clase;
		} catch (Exception e) {
			throw new Exception("car.factory.error");
		}

	}

}
