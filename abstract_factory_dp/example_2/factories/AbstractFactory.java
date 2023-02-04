package abstract_factory_dp.example_2.factories;

import abstract_factory_dp.example_2.vehicles.Vehicle;

public abstract class AbstractFactory {

	public abstract Vehicle getVehicle(String vehicleName);
}
