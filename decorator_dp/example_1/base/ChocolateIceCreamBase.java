package decorator_dp.example_1.base;

public class ChocolateIceCreamBase extends IceCreamBase{

	@Override
	public String getDescription()
	{
		return "Chocolate Icecream";
	}

	@Override
	public int getCost()
	{
		return 100;
	}

}
