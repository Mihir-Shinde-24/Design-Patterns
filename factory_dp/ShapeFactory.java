package factory_dp;

public class ShapeFactory {

	public static Shape getShape(String shapeName)
	{
		switch (shapeName)
		{
			case ("CIRCLE"):
			{
				return new Circle();
			}
			case ("RECTANGLE"):
			{
				return new Rectangle();
			}
			case ("SQUARE"):
			{
				return new Square();
			}
			default:
			{
				System.out.println("Invalid Shape Name");
				return null;
			}
		}
	}
}
