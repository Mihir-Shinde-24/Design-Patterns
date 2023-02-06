package decorator_dp.example_2.base;

public class PaneerTikkaSandwichBase extends SandwichBase{

	@Override
	public int getCost()
	{
		return 125;
	}

	@Override
	public String getDescription()
	{
		return "Paneer Tikka Sandwich";
	}
}
