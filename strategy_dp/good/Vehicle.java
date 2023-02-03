package strategy_dp.good;

public abstract class Vehicle {
	
	private DriveStrategy ds;
	
	public Vehicle(DriveStrategy ds)
	{
		this.ds = ds;
	}
	
	public void driveCap()
	{
		ds.drive();
	}

	public void setDs(DriveStrategy ds)
	{
		this.ds = ds;
	}
	
	
}
