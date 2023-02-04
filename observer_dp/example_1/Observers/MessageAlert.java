package observer_dp.example_1.Observers;

public class MessageAlert implements Observer{

	private String contact;
	

	public MessageAlert(String contact)
	{
		this.contact = contact;
	}
	
	@Override
	public void update(String text)
	{
		// or we can directly print
		sendEmail(contact,text);
	}
	
	public void sendEmail(String contact, String text)
	{
		System.out.println("TO Contact\t-> "+contact+"\t\t: "+text);
	}
	

}
