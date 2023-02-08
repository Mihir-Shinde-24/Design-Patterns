package command_dp.example_2.invokers;

import java.util.ArrayDeque;

import command_dp.example_2.commands.Command;

public class Broker {

	// Command object
	Command command;
	
	// Using ArrayDeque as a Stack..
	private ArrayDeque<Integer> stockQuantities;

	// Constructor
	public Broker(Command command)
	{
		this.command = command;
		stockQuantities = new ArrayDeque<>();
	}
	
	// Telling broker to perform the command
	public void doMyTransaction(int n)
	{
		stockQuantities.addLast(n);
		command.execute(n);
	}
	
	// Telling broker to undo the command performed
	public void undoMyTransaction()
	{
		int n = stockQuantities.pollLast();
		command.unexecute(n);
	}
	
	// To change commnad during run time
	public void setCommand(Command command)
	{
		this.command = command;
	}
	
	
}
