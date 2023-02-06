package decorator_dp.example_2.decorators.saucedecorators;

import decorator_dp.example_2.base.SandwichBase;
import decorator_dp.example_2.decorators.SandwichDecorator;

public class BarbequeSauceDecorator extends SandwichDecorator{

	SandwichBase sb;
	
	public BarbequeSauceDecorator(SandwichBase sb)
	{
		this.sb = sb;
	}

	@Override
	public int getCost()
	{
		return sb.getCost() + 15;
	}

	@Override
	public String getDescription()
	{
		return sb.getDescription()+ " with Barbeque Sauce";
	}
}
