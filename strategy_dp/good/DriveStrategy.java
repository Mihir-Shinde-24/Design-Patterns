package strategy_dp.good;

public interface DriveStrategy {
	
	public void drive();
}

class NormalDrive implements DriveStrategy{

	@Override
	public void drive()
	{
		System.out.println("Normal Drive Capability");	
	}
	
}

class SpecialDrive implements DriveStrategy{

	@Override
	public void drive()
	{
		System.out.println("Special Drive Capabilty");
	}
	
}