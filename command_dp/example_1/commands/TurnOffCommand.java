package command_dp.example_1.commands;

import command_dp.example_1.receivers.ElectronicDevice;

public class TurnOffCommand implements Command{

	ElectronicDevice device; // to know which device we will be working with
	
	public TurnOffCommand(ElectronicDevice device)
	{
		this.device = device;
	}

	@Override
	public void execute()
	{
		device.off();
	}
	
}
