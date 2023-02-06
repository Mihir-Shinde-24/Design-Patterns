package decorator_dp.example_1;

import decorator_dp.example_1.base.IceCreamBase;
import decorator_dp.example_1.base.VanillaIceCreamBase;
import decorator_dp.example_1.decorators.ChocoChipsDecorator;
import decorator_dp.example_1.decorators.NutsSprinklingDecorator;

public class Main {
	public static void main(String[] args)
	{
		IceCreamBase nuts_chocoChips_vanillaBase = new NutsSprinklingDecorator(new ChocoChipsDecorator(new VanillaIceCreamBase()));
		
		
		System.out.println("Final Product: "+nuts_chocoChips_vanillaBase.getDescription());
		System.out.println("Total Cost: "+nuts_chocoChips_vanillaBase.getCost());
	}
}
