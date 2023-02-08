package command_dp.example_2.commands;

public interface Command {

	public void execute(int n);
	public void unexecute(int n);
	
}
