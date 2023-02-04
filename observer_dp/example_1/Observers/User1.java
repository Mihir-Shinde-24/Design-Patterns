package observer_dp.example_1.Observers;

public class User1 implements Observer{

	private String email;

	public User1(String email, String contact)
	{
		this.email = email;
	}
	
	@Override
	public void update(String text)
	{
		// or we can directly print
		sendEmail(email,text);
	}
	


}