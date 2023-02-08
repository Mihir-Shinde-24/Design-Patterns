package command_dp.example_2.commands;

import command_dp.example_2.receiver.Stock;

public class SellStocksCommand implements Command{

	// Receiver
	Stock stock;
	
	//Constructor
	public SellStocksCommand(Stock stock)
	{
		this.stock = stock;
	}

	
	@Override
	public void execute(int n)
	{
		stock.sellStock(n);
	}

	@Override
	public void unexecute(int n)
	{
		stock.buyStock(n);
	}

}
