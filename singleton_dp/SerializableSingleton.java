package singleton_dp;

import java.io.Serializable;

public class SerializableSingleton implements Serializable{

	private static SerializableSingleton obj = null;
	
	private SerializableSingleton() {}
	
	public static SerializableSingleton getInstance()
	{
		if(obj == null)
		{
			obj = new SerializableSingleton();
		}
		return obj;
	}
	
	protected Object readResolve()
	{
		return obj;
	}
	

}
