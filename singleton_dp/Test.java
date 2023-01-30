package singleton_dp;

public class Test {
	public static void main(String[] args) throws Exception
	{
// Lazy Singleton : Not Thread Safe
//		LazySingleton obj1 = LazySingleton.getInstance();
//		LazySingleton obj2 = LazySingleton.getInstance();		
//		System.out.println(obj1.hashCode());
//		System.out.println(obj2.hashCode());
// ------------------------------------------------------------------
		// Eager Singleton : Thread Safe but Memory Issue
		EagerSingleton obj1 = EagerSingleton.getInstance();
		EagerSingleton obj2 = EagerSingleton.getInstance();		
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());	

// ------------------------------------------------------------------
		// Multithreaded Singleton : Thread Safe & No Memory Issue

//		Thread t1 = new Thread(() -> {
//			MultithreadedSingleton obj = MultithreadedSingleton.getInstance();
//			System.out.println(obj.hashCode());
//		});
//		Thread t2 = new Thread(() -> {
//			MultithreadedSingleton obj = MultithreadedSingleton.getInstance();
//			System.out.println(obj.hashCode());
//		});
//
//		t1.start();
//		t2.start();

// ------------------------------------------------------------------		

		// Serializable Singleton : without readResolve(), oos gives different object
//		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(
//				"D:\\Java\\eclipse enterprise\\DesignPatterns\\src\\filesDemo\\data.txt"));
//		SerializableSingleton obj1 = SerializableSingleton.getInstance();
//
//		oos.writeObject(obj1);
//		oos.close();
//
//		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(
//				"D:\\Java\\eclipse enterprise\\DesignPatterns\\src\\filesDemo\\data.txt"));
//
//		SerializableSingleton obj2 = (SerializableSingleton) ois.readObject();
//		ois.close();
//
//		System.out.println("Obj 1:" + obj1.hashCode());
//		System.out.println("Obj 2:" + obj2.hashCode());

// ------------------------------------------------------------------		

		// Enum Singleton : Thread Safe & No Memory Issue
//		System.out.println(EnumSingleton.OBJ.hashCode());
//		System.out.println(EnumSingleton.OBJ.hashCode());

	}
}
