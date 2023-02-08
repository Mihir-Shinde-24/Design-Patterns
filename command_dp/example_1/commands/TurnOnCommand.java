package command_dp.example_1.commands;

import command_dp.example_1.receivers.ElectronicDevice;

public class TurnOnCommand implements Command{

	// Receiver : ElectronicDevice
	ElectronicDevice device; // to know which device we will be working with
	
	public TurnOnCommand(ElectronicDevice device)
	{
		this.device = device;
	}

	@Override
	public void execute()
	{
		device.on();
	}


	
}
