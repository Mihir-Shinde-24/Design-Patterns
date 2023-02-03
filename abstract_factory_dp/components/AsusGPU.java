package abstract_factory_dp.components;

public class AsusGPU implements GPU{

	@Override
	public void getSpecs()
	{
		System.out.println("COMPANY: ASUS");
		System.out.println("COMPONENT: GPU");
	}
}
