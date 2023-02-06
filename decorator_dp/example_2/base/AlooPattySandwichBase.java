package decorator_dp.example_2.base;

public class AlooPattySandwichBase  extends SandwichBase{

	@Override
	public int getCost()
	{
		return 150;
	}

	@Override
	public String getDescription()
	{
		return "Aloo Patty Sandwich";
	}
}
