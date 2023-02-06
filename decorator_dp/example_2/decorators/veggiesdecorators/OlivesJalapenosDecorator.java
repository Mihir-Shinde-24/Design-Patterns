package decorator_dp.example_2.decorators.veggiesdecorators;

import decorator_dp.example_2.base.SandwichBase;
import decorator_dp.example_2.decorators.SandwichDecorator;

public class OlivesJalapenosDecorator extends SandwichDecorator{

	SandwichBase sb;
	
	public OlivesJalapenosDecorator(SandwichBase sb)
	{
		super();
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
		return sb.getDescription()+ " with Olives Jalapenos";
	}
}
