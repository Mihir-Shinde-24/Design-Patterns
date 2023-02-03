package abstract_factory_dp.factories;

import abstract_factory_dp.components.GPU;
import abstract_factory_dp.components.Monitor;
import abstract_factory_dp.components.MsiGPU;
import abstract_factory_dp.components.MsiMonitor;

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
