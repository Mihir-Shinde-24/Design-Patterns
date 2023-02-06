package decorator_dp.example_2;

import decorator_dp.example_2.base.SandwichBase;
import decorator_dp.example_2.base.TandooriChickenSandwichBase;
import decorator_dp.example_2.decorators.saucedecorators.BarbequeSauceDecorator;
import decorator_dp.example_2.decorators.veggiesdecorators.OnionCapsicumLettuceDecorator;
import decorator_dp.example_2.decorators.veggiesdecorators.SliceCheeseDecorator;

public class MainSubwayStore {
	static int i = 1;
	
	public static void printItem(SandwichBase sandwich)
	{
		System.out.println("Item No: "+i);
		System.out.println("Desc: "+ sandwich.getDescription());
		System.out.println("Cost: Rs."+ sandwich.getCost());
		System.out.println();
		i++;
	}

	
	
	public static void main(String[] args)
	{
		SandwichBase sandwich1 = new TandooriChickenSandwichBase();
		printItem(sandwich1);
		
		SandwichBase sandwich2 = new OnionCapsicumLettuceDecorator(new TandooriChickenSandwichBase());
		printItem(sandwich2);
		
		SandwichBase sandwich3 = new BarbequeSauceDecorator(new SliceCheeseDecorator(new OnionCapsicumLettuceDecorator(new TandooriChickenSandwichBase())) );
		printItem(sandwich3);
	}
	
}
