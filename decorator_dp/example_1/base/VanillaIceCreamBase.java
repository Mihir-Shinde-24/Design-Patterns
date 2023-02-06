package decorator_dp.example_1.base;

public class VanillaIceCreamBase extends IceCreamBase{


	@Override
	public String getDescription()
	{
		return "Vanilla Icecream";
	}

	@Override
	public int getCost()
	{
		return 150;
	}
}
