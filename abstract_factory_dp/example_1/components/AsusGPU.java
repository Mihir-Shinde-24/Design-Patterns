package abstract_factory_dp.example_1.components;

public class AsusGPU implements GPU{

	@Override
	public void getSpecs()
	{
		System.out.println("COMPANY: ASUS");
		System.out.println("COMPONENT: GPU");
	}
}
