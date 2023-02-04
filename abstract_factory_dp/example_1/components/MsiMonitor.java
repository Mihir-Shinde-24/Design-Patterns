package abstract_factory_dp.example_1.components;

public class MsiMonitor implements Monitor{

	@Override
	public void getSpecs()
	{
		System.out.println("COMPANY: MSI");
		System.out.println("COMPONENT: MONITOR");
	}

}
