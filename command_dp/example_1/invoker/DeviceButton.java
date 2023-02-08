package command_dp.example_1.invoker;

import command_dp.example_1.commands.Command;

public class DeviceButton {

	// Command obj
	Command command;
	
	public DeviceButton(Command command)
	{
		this.command = command;
	}

	public void press()
	{
		command.execute();
	}
	
	public void setCommand(Command newCommand)
	{
		command = newCommand;
	}
}
