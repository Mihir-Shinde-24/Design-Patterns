package decorator_dp.example_1.decorators;

import decorator_dp.example_1.base.IceCreamBase;

public class NutsSprinklingDecorator extends IceCreamDecorator{

	IceCreamBase icecreamBase;
	
	public NutsSprinklingDecorator(IceCreamBase icecreamBase)
	{
		this.icecreamBase = icecreamBase;
	}
	
	@Override
	public String getDescription()
	{
		return icecreamBase.getDescription() +" with Nuts Sprinkler";
	}

	@Override
	public int getCost()
	{
		return icecreamBase.getCost()+ 25;
	}

}
