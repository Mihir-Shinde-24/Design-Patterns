package command_dp.example_2;

import command_dp.example_2.commands.BuyStockCommand;
import command_dp.example_2.commands.SellStocksCommand;
import command_dp.example_2.invokers.Broker;
import command_dp.example_2.receiver.Stock;

public class Main {

	public static void main(String[] args)
	{
		// 1. Create Receiver
		Stock stock = new Stock("Lenskart", 200);

		// 2. Create Invoker
		Broker broker1 = new Broker(new BuyStockCommand(stock));

		// 3. Triggering Invoker method
		broker1.doMyTransaction(50); // telling broker
		broker1.doMyTransaction(30);
		broker1.doMyTransaction(60);

		// 4. Undo
		broker1.undoMyTransaction();
		broker1.undoMyTransaction();
		
		// 5. Changing the command
		broker1.setCommand(new SellStocksCommand(stock));
		broker1.doMyTransaction(45);

	}
}
