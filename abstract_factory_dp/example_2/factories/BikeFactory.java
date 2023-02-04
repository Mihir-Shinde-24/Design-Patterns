package abstract_factory_dp.example_2.factories;

import abstract_factory_dp.example_2.vehicles.Dominar;
import abstract_factory_dp.example_2.vehicles.Splendor;
import abstract_factory_dp.example_2.vehicles.Vehicle;

public class BikeFactory extends AbstractFactory {

	@Override
	public Vehicle getVehicle(String vehicleName)
	{
		switch (vehicleName)
		{
			case "SPLENDOR":
			{
				return new Splendor();
			}
			case "DOMINAR":
			{
				return new Dominar();
			}
			default:
				System.out.println("Invalid Vehicle name");
				return null;
			}
	}
}
