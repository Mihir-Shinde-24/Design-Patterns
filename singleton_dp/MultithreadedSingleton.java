package singleton_dp;

public class MultithreadedSingleton{

	private static MultithreadedSingleton obj;

	public MultithreadedSingleton(){}

	public static MultithreadedSingleton getInstance()
	{
		if (obj == null)
		{
			synchronized (MultithreadedSingleton.class)
			{
				if (obj == null)
				{
					obj = new MultithreadedSingleton();
				}
			}
		}
		
		return obj;
	}


}
