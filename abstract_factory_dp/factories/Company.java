package abstract_factory_dp.factories;

import abstract_factory_dp.components.GPU;
import abstract_factory_dp.components.Monitor;

public abstract class Company {

	public abstract GPU getGPU();
	
	public abstract Monitor getMonitor();
	
}
