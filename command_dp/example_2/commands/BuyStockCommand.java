package command_dp.example_2.commands;

import command_dp.example_2.receiver.Stock;

public class BuyStockCommand implements Command{

	// Receiver
	Stock stock;
	
	//Constructor
	public BuyStockCommand(Stock stock)
	{
		this.stock = stock;
	}

	
	@Override
	public void execute(int n)
	{
		stock.buyStock(n);
	}

	@Override
	public void unexecute(int n)
	{
		stock.sellStock(n);
	}

}
