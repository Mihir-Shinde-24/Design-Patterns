package abstract_factory_dp.example_2.factories;

import abstract_factory_dp.example_2.vehicles.HondaCity;
import abstract_factory_dp.example_2.vehicles.Swift;
import abstract_factory_dp.example_2.vehicles.Vehicle;

public class CarFactory extends AbstractFactory {

	@Override
	public Vehicle getVehicle(String vehicleName)
	{
		switch (vehicleName)
		{
			case "SWIFT":
			{
				return new Swift();
			}
			case "HONDACITY":
			{
				return new HondaCity();
			}
			default:
				System.out.println("Invalid Vehicle name");
				return null;
			}
	}

}
