package decorator_dp.example_2.decorators.saucedecorators;

import decorator_dp.example_2.base.SandwichBase;
import decorator_dp.example_2.decorators.SandwichDecorator;

public class TandooriSauceDecorator extends SandwichDecorator{

	SandwichBase sb;
	
	public TandooriSauceDecorator(SandwichBase sb)
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
		return sb.getDescription()+ " with Tandoori Sauce";
	}
}
