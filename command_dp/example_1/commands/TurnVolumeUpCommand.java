package command_dp.example_1.commands;

import command_dp.example_1.receivers.ElectronicDevice;

public class TurnVolumeUpCommand implements Command{

	ElectronicDevice device; // to know which device we will be working with
	
	public TurnVolumeUpCommand(ElectronicDevice device)
	{
		this.device = device;
	}

	@Override
	public void execute()
	{
		device.volumeUp();
	}
	
}
