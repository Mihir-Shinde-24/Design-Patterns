package abstract_factory_dp.example_1.factories;

import abstract_factory_dp.example_1.components.AsusGPU;
import abstract_factory_dp.example_1.components.AsusMonitor;
import abstract_factory_dp.example_1.components.GPU;
import abstract_factory_dp.example_1.components.Monitor;

public class AsusManufacturer extends Company{

	@Override
	
	public GPU getGPU()
	{
		return new AsusGPU();
	}

	@Override
	public Monitor getMonitor()
	{
		return new AsusMonitor();
	}

}
