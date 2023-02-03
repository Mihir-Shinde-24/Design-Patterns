package abstract_factory_dp.factories;

import abstract_factory_dp.components.AsusGPU;
import abstract_factory_dp.components.AsusMonitor;
import abstract_factory_dp.components.GPU;
import abstract_factory_dp.components.Monitor;

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
