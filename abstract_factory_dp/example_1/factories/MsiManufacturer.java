package abstract_factory_dp.example_1.factories;

import abstract_factory_dp.example_1.components.GPU;
import abstract_factory_dp.example_1.components.Monitor;
import abstract_factory_dp.example_1.components.MsiGPU;
import abstract_factory_dp.example_1.components.MsiMonitor;

public class MsiManufacturer extends Company{

	@Override
	public GPU getGPU()
	{
		return new MsiGPU();
	}

	@Override
	public Monitor getMonitor()
	{
		return new MsiMonitor();
	}
}
