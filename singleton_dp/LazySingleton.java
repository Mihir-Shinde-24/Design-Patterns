package singleton_dp;

public class LazySingleton {
	
	private static LazySingleton obj = null;
	
	private LazySingleton() {}
	
	public static LazySingleton getInstance()
	{
		if(obj == null)
		{
			obj = new LazySingleton();
		}
		return obj;
	}
}
