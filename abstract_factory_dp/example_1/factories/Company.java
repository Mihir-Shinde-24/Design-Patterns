package abstract_factory_dp.example_1.factories;

import abstract_factory_dp.example_1.components.GPU;
import abstract_factory_dp.example_1.components.Monitor;

public abstract class Company {

	public abstract GPU getGPU();
	
	public abstract Monitor getMonitor();
	
}
