package abstract_factory_dp.example_2;

import abstract_factory_dp.example_2.factories.AbstractFactory;
import abstract_factory_dp.example_2.factories.BikeFactory;
import abstract_factory_dp.example_2.factories.CarFactory;

public class FactoryProducer {

	public static AbstractFactory getFactory(String vehicleType)
	{
		switch (vehicleType	)	{
		case "CAR":
		{
			return new CarFactory();
		}
		case "BIKE":
		{
			return new BikeFactory();
		}
		default:
			System.out.println("Invalid Vehicle");
			return null;
		}
			
	}
}
