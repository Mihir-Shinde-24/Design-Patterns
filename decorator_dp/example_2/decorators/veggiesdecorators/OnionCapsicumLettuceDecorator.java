package decorator_dp.example_2.decorators.veggiesdecorators;

import decorator_dp.example_2.base.SandwichBase;
import decorator_dp.example_2.decorators.SandwichDecorator;

public class OnionCapsicumLettuceDecorator extends SandwichDecorator{

	SandwichBase sb;
	
	public OnionCapsicumLettuceDecorator(SandwichBase sb)
	{
		this.sb = sb;
	}
	
	@Override
	public int getCost()
	{
		return sb.getCost() + 50;
	}

	@Override
	public String getDescription()
	{
		return sb.getDescription()+ " with Onion Capsicum Lettuce";
	}
}
