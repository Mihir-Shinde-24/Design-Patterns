package command_dp.example_2.receiver;

public class Stock {

	// fields
	private String name;
	private int quantity;

	// constructor
	public Stock(String name, int quantity)
	{
		this.name = name;
		this.quantity = quantity;
	}

	// We can Buy or sell this stock

	public void buyStock(int n)
	{
		this.quantity -= n;
		System.out.printf("Stock [Name: %s, qty bought: %d, remaining:%d] bought!\n",name,n,quantity);
	}
	
	public void sellStock(int n)
	{
		this.quantity += n;
		System.out.printf("Stock [Name: %s, qty sold: %d, remaining:%d] Sold!\n",name,n,quantity);
	}

}
