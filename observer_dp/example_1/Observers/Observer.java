package observer_dp.example_1.Observers;

public interface Observer {
	
	public void update(String text);
	
	// Out of context methods	
	
	public default void sendEmail(String email, String text)
	{
		System.out.println("TO Email-> "+email+": "+text);
	}
	
}
