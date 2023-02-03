package factory_dp;

public class Main {
	public static void main(String[] args)
	{
		Shape rect = ShapeFactory.getShape("RECTANGLE");
		rect.draw();
	}
}
