package command_dp.example_1.receivers;

public class Television implements ElectronicDevice{

	int volume=0;
	
	@Override
	public void on()
	{
		System.out.println("Television has Turned On!");
	}

	@Override
	public void off()
	{
		System.out.println("Television has Turned OFF!");
	}

	@Override
	public void volumeUp()
	{
		volume += 10;
		System.out.println("TV Volume is at:"+volume);
	}

	@Override
	public void volumeDown()
	{
		volume -= 10;
		System.out.println("TV Volume is at:"+volume);
	}

}
