package strategy_dp.good;

public class Main {

	public static void main(String[] args)
	{

		Vehicle v1 = new OffRoadVehicle();
		v1.driveCap();
		
		v1.setDs(new NormalDrive());
		v1.driveCap();
		
	}
}
