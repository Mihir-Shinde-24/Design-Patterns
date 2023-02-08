package command_dp.example_1;

import command_dp.example_1.commands.TurnOffCommand;
import command_dp.example_1.commands.TurnOnCommand;
import command_dp.example_1.commands.TurnVolumeUpCommand;
import command_dp.example_1.invoker.DeviceButton;
import command_dp.example_1.receivers.ElectronicDevice;
import command_dp.example_1.receivers.Television;

public class Main {

	public static void main(String[] args)
	{
		/* 
		 Client: Who invokes the command (us) 
		 Invoker: Through which the command gets executed ( button of remote )
		 Receiver: Who receives the Commands (TV). Receiver has some actions like on, off, volumeup ,volumedown, etc
		 Command: Task to perform (TurnON, TurnOFF, etc)
		
		 Flow (assigning): Remote Button --> What command should take place on that button --> Command should take place on which device
		 
		 		then at end client presses the button!
		*/
		ElectronicDevice television = new Television();
		
		// Follows the flow... We always create the invoker (button)
		DeviceButton btn1 = new DeviceButton(new TurnOnCommand(television));
		btn1.press();	// we press the button	
		
		
		/* Turn OFF TV */
		DeviceButton btn2 = new DeviceButton(new TurnOffCommand(television));
		btn2.press();

		/* Change Command during run time */
		btn2.setCommand(new TurnOnCommand(television));
		btn2.press();
		
		/* Turn Vol Up TV */
		DeviceButton btn3 = new DeviceButton(new TurnVolumeUpCommand(television));
		btn3.press();
		btn3.press();
		btn3.press();
		
		
		DeviceButton btn4 = new DeviceButton(new TurnVolumeUpCommand(television));
		btn4.press();
		btn4.press();
		btn4.press();
		
		/* All commands are being executed on the single TV */
	}

}
