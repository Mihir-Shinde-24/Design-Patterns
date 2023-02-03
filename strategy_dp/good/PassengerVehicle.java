package strategy_dp.good;

public class PassengerVehicle extends Vehicle{
	
	PassengerVehicle()
	{
		super( new NormalDrive() );
	}

}
