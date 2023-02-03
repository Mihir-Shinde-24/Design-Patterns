package strategy_dp.bad;

public class Main {

	public static void main(String[] args)
	{
		Vehicle v1 = new OffRoadVehicle();
		v1.drive();
		
		Vehicle v2 = new PassengerVehicle();
		v2.drive();
		
		Vehicle v3 = new SportsVehicle();
		v3.drive();
		
/*
 		Task : Want to Add a sports drive functionality 
 		
 		Approach-1: Write drive(){// sports drive } method in super class Vehicle
 		Problem-1 : drive() method in PassengerVehicle class has to be given diff implementation drive(){// Normal drive} after overriding [Violates L:Liskov Principle]
 		
 		Approach-2: Write drive(){// sports drive } method in only SportsVehicle , OffRoadVehicle class
 		Problem-2 : Suppose if another class XYZ is added which needs drive(){// sports drive } implementation then we have to again write it Causing duplicacy. [Violates Reusability ]
 
 		here we followed approach 2 which is wrong...
 */
			
	}
}
