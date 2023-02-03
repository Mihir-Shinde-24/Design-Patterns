package abstract_factory_dp.components;

public class MsiGPU implements GPU{

	@Override
	public void getSpecs()
	{
		System.out.println("COMPANY: MSI");
		System.out.println("COMPONENT: GPU");
	}
}
