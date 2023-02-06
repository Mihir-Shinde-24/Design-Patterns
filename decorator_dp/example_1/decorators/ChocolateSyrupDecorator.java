package decorator_dp.example_1.decorators;

import decorator_dp.example_1.base.IceCreamBase;

public class ChocolateSyrupDecorator extends IceCreamDecorator{

	IceCreamBase icecreamBase;
	
	public ChocolateSyrupDecorator(IceCreamBase icecreamBase)
	{
		this.icecreamBase = icecreamBase;
	}

	@Override
	public String getDescription()
	{
		return icecreamBase.getDescription() + " with Chocolate Syrup"; 
	}

	@Override
	public int getCost()
	{
		return icecreamBase.getCost() + 50;
	}

}
