package decorator_dp.example_2.decorators.veggiesdecorators;

import decorator_dp.example_2.base.SandwichBase;
import decorator_dp.example_2.decorators.SandwichDecorator;

public class SliceCheeseDecorator extends SandwichDecorator{

	SandwichBase sb;
	
	@Override
	public int getCost()
	{
		return sb.getCost() + 25;
	}

	@Override
	public String getDescription()
	{
		return sb.getDescription()+ " with Slice Cheese";
	}

	public SliceCheeseDecorator(SandwichBase sb)
	{
		super();
		this.sb = sb;
	}

}
