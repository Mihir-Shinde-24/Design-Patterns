package decorator_dp.example_1.decorators;

import decorator_dp.example_1.base.IceCreamBase;

public class ChocoChipsDecorator extends IceCreamDecorator{

	IceCreamBase icecreamBase;

	public ChocoChipsDecorator(IceCreamBase icecreamBase) 
	{
		this.icecreamBase = icecreamBase;
	}
	@Override
	public String getDescription()
	{
		return icecreamBase.getDescription() + " with Chocolate Chips"; 
	}

	@Override
	public int getCost()
	{
		return icecreamBase.getCost() + 40;
	}
	
	
}
