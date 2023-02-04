package abstract_factory_dp.example_1.components;

public class AsusMonitor implements Monitor{

	@Override
	public void getSpecs()
	{
		System.out.println("COMPANY: ASUS");
		System.out.println("COMPONENT: MONITOR");
	}
}
