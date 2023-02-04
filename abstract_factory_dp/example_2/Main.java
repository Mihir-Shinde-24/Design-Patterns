package abstract_factory_dp.example_2;

import abstract_factory_dp.example_2.factories.AbstractFactory;
import abstract_factory_dp.example_2.vehicles.Vehicle;

public class Main {

	public static void main(String[] args)
	{
//		Factory factory = new CarFactory();
//		Vehicle swift = factory.getVehicle("SWIFT");
//		swift.getVehicleName();
		
		AbstractFactory bikefactory = FactoryProducer.getFactory("BIKE");
		
		Vehicle dominar = bikefactory.getVehicle("SPLENDOR");
		
		dominar.getVehicleName();
	}
}
