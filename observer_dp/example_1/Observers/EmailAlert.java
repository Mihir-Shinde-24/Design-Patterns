package observer_dp.example_1.Observers;

public class EmailAlert implements Observer{

	private String email;

	public EmailAlert(String email)
	{
		this.email = email;
	}
	
	@Override
	public void update(String text)
	{
		// or we can directly print
		sendEmail(email,text);
	}
	
	public void sendEmail(String email, String text)
	{
		System.out.println("TO Email\t-> "+email+"\t: "+text);
	}
	


}
