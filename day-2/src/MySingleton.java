
public class MySingleton {

	private static MySingleton mySigleton =new MySingleton();
	
	private MySingleton() {
		System.out.println("dare to call...");
	}
	
	public static MySingleton getMySigleton() {
		return mySigleton;
	}
	public void businessMethod() {
		System.out.println("bl of the method....");
	}
}
